package com.atherapp.common.modules.manifest

import com.atherapp.common.json.Json
import com.atherapp.common.json.gson.nextStringOrNull
import com.atherapp.common.modules.manifest.permissions.MutableDataPermission
import com.atherapp.common.modules.manifest.permissions.PermissionDefault
import com.github.salomonbrys.kotson.string
import com.github.salomonbrys.kotson.toJson
import com.github.salomonbrys.kotson.typeAdapter
import com.google.gson.*
import com.google.gson.stream.JsonToken
import io.vertx.core.http.HttpMethod
import java.lang.reflect.Type

val moduleManifestTypeAdapter = typeAdapter<ModuleManifest> {
    read {
        MutableModuleManifest().apply {
            if (peek() == JsonToken.BEGIN_OBJECT) {
                beginObject()
                while (hasNext()) {
                    if (peek() == JsonToken.NAME) {
                        when (nextName()) {
                            "group" -> {
                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal group name: $path")
                                group = nextString().takeIf { it.isNotBlank() } ?: throw IllegalManifestException("Illegal group name: $path")
                            }
                            "artifact" -> {
                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal artifact name: $path")
                                artifact = nextString().takeIf { it.isNotBlank() } ?: throw IllegalManifestException("Illegal artifact name: $path")
                            }
                            "tag" -> {
                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal tag: $path")
                                tag = nextString().takeIf { it.isNotBlank() } ?: throw IllegalManifestException("Illegal tag: $path")
                            }
                            "alias" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal alias: $path")
                                alias = nextStringOrNull().also { if (it != null && it.isBlank()) throw IllegalManifestException("Illegal alias: $path") }
                            }
                            "description" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal description: $path")
                                description = nextStringOrNull()
                            }
                            "loadStage" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal load stage: $path")
                                loadStage = nextStringOrNull()?.let {
                                    try {
                                        ModuleLoadStage.valueOf(it)
                                    } catch (e: IllegalArgumentException) {
                                        throw IllegalManifestException("Illegal load stage: $path")
                                    }
                                } ?: ModuleLoadStage.POST_API
                            }
                            "authors" -> {
                                if (peek() == JsonToken.BEGIN_ARRAY) {
                                    beginArray()
                                    while (hasNext()) {
                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal author: $path")
                                        authors.add(nextString().takeIf { it.isNotBlank() }
                                                ?: throw IllegalManifestException("Illegal author: $path"))
                                    }
                                    endArray()
                                } else
                                    throw IllegalManifestException("Illegal authors section: $path")
                            }
                            "website" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal website: $path")
                                website = nextStringOrNull().also { if (it != null && it.isBlank()) throw IllegalManifestException("Illegal website: $path") }
                            }
                            "mainClass" -> {
                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal entry point (mainClass): $path")
                                mainClass = nextString().takeIf { it.isNotBlank() } ?: throw IllegalManifestException("Illegal entry point (mainClass): $path")
                            }
                            "database" -> {
                                if (peek() != JsonToken.BOOLEAN) throw IllegalManifestException("Illegal database usage value: $path")
                                database = nextBoolean()
                            }
                            "jarDependencies" -> {
                                if (peek() == JsonToken.BEGIN_ARRAY) {
                                    beginArray()
                                    while (hasNext()) {
                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal jar dependencies section: $path")
                                        val dependency = nextString()
                                        jarDependencies.add(dependency.split(":").run {
                                            when (size) {
                                                2 -> DataJarDependency(groupId = this[0], artifactId = this[1])
                                                3 -> DataJarDependency(groupId = this[0], artifactId = this[1], version = this[3])
                                                else -> throw IllegalManifestException("Invalid jar dependency: $dependency @ $path")
                                            }
                                        })
                                    }
                                    endArray()
                                } else
                                    throw IllegalManifestException("Illegal jar dependencies section: $path")
                            }
                            "dependencies" -> {
                                if (peek() == JsonToken.BEGIN_ARRAY) {
                                    beginArray()
                                    while (hasNext()) {
                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal dependencies section: $path")
                                        dependencies.add(moduleDependencyFromString(nextString()))
                                    }
                                    endArray()
                                } else
                                    throw IllegalManifestException("Illegal dependencies section: $path")
                            }
                            "softDependencies" -> {
                                if (peek() == JsonToken.BEGIN_ARRAY) {
                                    beginArray()
                                    while (hasNext()) {
                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal soft dependency: $path")
                                        dependencies.add(moduleDependencyFromString(nextString()))
                                    }
                                    endArray()
                                } else
                                    throw IllegalManifestException("Illegal soft dependencies section: $path")
                            }
                            "logPrefix" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal log prefix: $path")
                                logPrefix = nextStringOrNull()
                            }
                            "loadBefore" -> {
                                if (peek() == JsonToken.BEGIN_ARRAY) {
                                    beginArray()
                                    while (hasNext()) {
                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal loadBefore section: $path")
                                        val moduleId = nextString()
                                        loadBefore.add(moduleId.split("/").run {
                                            if (size != 2)
                                                throw IllegalManifestException("Invalid module id format: $moduleId @ $path")
                                            DataDependency(group = this[0], artifact = this[1])
                                        })
                                    }
                                    endArray()
                                } else
                                    throw IllegalManifestException("Illegal dependencies section: $path")
                            }
                            "permissionPrefix" -> {
                                if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal module permission prefix: $path")
                                permissionPrefix = nextStringOrNull().also { if (it != null && it.isBlank()) throw IllegalManifestException("Illegal module permission prefix: $path") }
                            }
                            "endpoints" -> {
                                if (peek() == JsonToken.BEGIN_OBJECT) {
                                    beginObject()
                                    while (hasNext()) {
                                        lateinit var endpoint: String
                                        val endpointData = MutableDataEndpoint().apply {
                                            if (peek() == JsonToken.NAME) {
                                                if (group == "" || artifact == "")
                                                    throw IllegalManifestException("The endpoints section must be declared after the group and artifact names.")
                                                endpoint = expandEndpoint(group, artifact, nextName())
                                                beginObject()
                                                when (nextName()) {
                                                    "methods" -> {
                                                        if (peek() == JsonToken.BEGIN_ARRAY) {
                                                            beginArray()
                                                            // Clear the default GET method from the array, since it is being declared
                                                            if (hasNext()) methods.clear()
                                                            while (hasNext()) {
                                                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal endpoint declaration: $path")
                                                                methods.add(nextString()?.let {
                                                                    try {
                                                                        HttpMethod.valueOf(it)
                                                                    } catch (e: IllegalArgumentException) {
                                                                        throw IllegalManifestException("Illegal endpoint HTTP method: $it @ $path")
                                                                    }
                                                                }
                                                                        ?: throw IllegalManifestException("Illegal endpoint HTTP method: $path"))
                                                            }
                                                            endArray()
                                                        } else
                                                            throw IllegalManifestException("Illegal endpoint declaration: $path")
                                                    }
                                                    "aliases" -> {
                                                        if (peek() == JsonToken.BEGIN_ARRAY) {
                                                            beginArray()
                                                            while (hasNext()) {
                                                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal endpoint alias declaration: $path")
                                                                aliases.add(expandEndpoint(group, artifact, nextString(), true))
                                                            }
                                                            endArray()
                                                        }
                                                    }
                                                    "description" -> {
                                                        if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal endpoint description: $path")
                                                        description = nextStringOrNull()
                                                    }
                                                    "permissions" -> {
                                                        if (peek() == JsonToken.BEGIN_ARRAY) {
                                                            beginArray()
                                                            while (hasNext()) {
                                                                if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal endpoint permission: $path")
                                                                permissions.add(expandPermission(permissionPrefix, nextString()))
                                                            }
                                                            endArray()
                                                        }
                                                    }
                                                    "hidden" -> {
                                                        if (peek() != JsonToken.BOOLEAN) throw IllegalManifestException("Illegal 'hidden' value for endpoint: $path")
                                                        hidden = nextBoolean()
                                                    }
                                                    "permissionMessage" -> {
                                                        if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal endpoint permission message: $path")
                                                        permissionMessage = nextStringOrNull() ?: "You don't have permission to use this endpoint."
                                                    }
                                                    "usage" -> {
                                                        if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal endpoint usage message: $path")
                                                        usage = nextStringOrNull()
                                                    }
                                                    else -> throw IllegalManifestException("Extra section in endpoint declaration")
                                                }
                                                endObject()
                                            } else
                                                throw IllegalManifestException("Illegal endpoint declaration: $path")
                                        }
                                        endpoints[endpoint] = endpointData
                                    }
                                    endObject()
                                } else
                                    throw IllegalManifestException("Illegal endpoints section: $path")
                            }
                            "permissions" -> {
                                if (peek() == JsonToken.BEGIN_OBJECT) {
                                    beginObject()
                                    while (hasNext()) {
                                        lateinit var permission: String
                                        val permissionData = MutableDataPermission().apply {
                                            if (peek() == JsonToken.NAME) {
                                                permission = expandPermission(permissionPrefix, nextName())
                                                beginObject()
                                                when (nextName()) {
                                                    "description" -> {
                                                        if (peek() != JsonToken.STRING && peek() != JsonToken.NULL) throw IllegalManifestException("Illegal permission description: $path")
                                                        description = nextStringOrNull()
                                                    }
                                                    "children" -> {
                                                        if (peek() == JsonToken.BEGIN_OBJECT) {
                                                            beginObject()
                                                            while (hasNext()) {
                                                                if (peek() == JsonToken.NAME) {
                                                                    val child = expandPermission(permissionPrefix, nextString())
                                                                    if (peek() == JsonToken.BOOLEAN) {
                                                                        children[child] = nextBoolean()
                                                                    } else
                                                                        throw IllegalManifestException("Illegal permission child, must use a boolean value: $path")
                                                                } else
                                                                    throw IllegalManifestException("Illegal permission child: $path")
                                                            }
                                                            endObject()
                                                        } else
                                                            throw IllegalManifestException("Illegal permission children declaration: $path")
                                                    }
                                                    "default" -> {
                                                        if (peek() != JsonToken.STRING) throw IllegalManifestException("Illegal permission default: $path")
                                                        default = nextString()?.let {
                                                            try {
                                                                PermissionDefault.valueOf(it)
                                                            } catch (e: IllegalArgumentException) {
                                                                throw IllegalManifestException("Illegal permission default: $it @ $path")
                                                            }
                                                        } ?: throw IllegalManifestException("Illegal permission default: $path")
                                                    }
                                                }
                                                endObject()
                                            } else
                                                throw IllegalManifestException("Illegal permission node: $path")
                                        }
                                        permissions[permission] = permissionData
                                    }
                                    endObject()
                                } else
                                    throw IllegalManifestException("Illegal permissions section: $path")
                            }
                            else -> {
                                if (peek() != JsonToken.NULL)
                                    additionalProperties[nextName()] = nextString().toJson()
                            }
                        }
                    } else
                        throw IllegalManifestException("This section of the manifest does not start with a name: $path")
                }
                endObject()
                DataModuleManifest(
                        group = group,
                        artifact = artifact,
                        tag = tag,
                        alias = alias,
                        description = description,
                        loadStage = loadStage,
                        authors = authors,
                        website = website,
                        mainClass = mainClass,
                        database = database,
                        jarDependencies = jarDependencies,
                        dependencies = dependencies,
                        softDependencies = softDependencies,
                        logPrefix = logPrefix,
                        loadBefore = loadBefore,
                        permissionPrefix = permissionPrefix,
                        endpoints = endpoints,
                        permissions = permissions,
                        additionalProperties = additionalProperties
                )
            } else
                throw IllegalManifestException("The manifest does not start with an object token \"{\"")
        }
    }
    write { Json.serialize(this) }
}

/**
 * Expand a permission node by verifying its validity, and replacing a starting '$' with
 */
private fun expandPermission(permissionPrefix: String?, permission: String): String {
    return if (permission.startsWith("$")) {
        if (permissionPrefix == null) throw IllegalManifestException("Cannot use relative permissions if the permissionPrefix is null.")
        if (permissionPrefix.isBlank()) throw IllegalManifestException("The permission prefix must be declared before it is used in the endpoints or permissions sections.")
        permission.replaceFirst("$", permissionPrefix)
    } else permission
}

/**
 * Expand an endpoint by verifying its validity, optionally verifying if it is illegal, and replacing a starting '$' with '/api/modules/$group/$artifact'
 */
private fun expandEndpoint(group: String, artifact: String, endpoint: String, enforceValues: Boolean = false): String {
    // Relative endpoints aren't checked against any illegal declarations (such as ending with a wildcard), because they are isolated to their own area of the API.
    return if (endpoint.startsWith("$"))
        endpoint.replaceFirst("$", "/api/modules/$group/$artifact")
    else if (endpoint.isBlank()) throw IllegalManifestException("Endpoint declaration cannot be blank.")
    //TODO Consider testing against all native endpoints
    else if (enforceValues && (endpoint == "/" || endpoint == "/api" || endpoint.endsWith("*")))
        throw IllegalManifestException("Illegal alias declaration, the overloading of a root-level or wildcard endpoint must be done explicitly: '$endpoint'")
    else endpoint
}

/**
 * Create a new [ModuleDependency] from a string.
 * This can't be an extension because there is no companion object to allow it to be static in [ModuleDependency]
 */
private fun moduleDependencyFromString(dependency: String): ModuleDependency {
    return dependency.split("/").run {
        if (size != 2)
            throw IllegalManifestException("Invalid dependency format: $dependency")

        //if (this.all {  }) TODO Name Requirements / Illegal Character Check

        val artifactAndVersion = this[2].split(":")

        return@run when (artifactAndVersion.size) {
            1 -> DataModuleDependency(group = this[0], artifact = artifactAndVersion[0])
            2 -> DataModuleDependency(group = this[0], artifact = artifactAndVersion[0], tag = artifactAndVersion[1])
            else -> throw IllegalManifestException("Invalid dependency format: $dependency")
        }
    }
}

/**
 * Gson type adapter for any [Dependency].
 * Uses a "group/artifact" format
 */
object DependencyTypeAdapter : JsonDeserializer<Dependency>, JsonSerializer<Dependency> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Dependency = json.string.split("/").run {
        if (this.size != 2)
            throw IllegalManifestException("Invalid Dependency Format: ${json.string}")

        //if (this.all {  }) TODO Name Requirements / Illegal Character Check

        DataDependency(group = this[0], artifact = this[1])
    }

    override fun serialize(src: Dependency, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = "${src.group}/${src.artifact}".toJson()
}

/**
 * Gson type adapter for any [ModuleDependency].
 * Uses a "group/artifact:tag" format
 */
object ModuleDependencyTypeAdapter : JsonDeserializer<ModuleDependency>, JsonSerializer<ModuleDependency> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): ModuleDependency = json.string.split("/").run {
        if (this.size != 2)
            throw IllegalManifestException("Invalid Dependency Format: ${json.string}")

        //if (this.all {  }) TODO Name Requirements / Illegal Character Check

        val artifactAndVersion = this[2].split(":")

        return when (artifactAndVersion.size) {
            1 -> DataModuleDependency(group = this[0], artifact = artifactAndVersion[0])
            2 -> DataModuleDependency(group = this[0], artifact = artifactAndVersion[0], tag = artifactAndVersion[1])
            else -> throw IllegalManifestException("Invalid Dependency Format: ${json.string}")
        }
    }

    override fun serialize(src: ModuleDependency, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = "${src.group}/${src.artifact}:${src.tag}".toJson()
}

/**
 * Gson type adapter for any [JarDependency].
 * This uses Gradle-like format, "groupId:artifactId:version", but uses maven to resolve dependencies.
 */
object JarDependencyTypeAdapter : JsonDeserializer<JarDependency>, JsonSerializer<JarDependency> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): JarDependency = json.string.split(":").run {
        return when (size) {
            2 -> DataJarDependency(groupId = this[0], artifactId = this[1])
            3 -> DataJarDependency(groupId = this[0], artifactId = this[1], version = this[3])
            else -> throw IllegalManifestException("Invalid Dependency Format: ${json.string}")
        }
    }

    override fun serialize(src: JarDependency, typeOfSrc: Type, context: JsonSerializationContext): JsonElement = "${src.groupId}:${src.artifactId}:${src.version}".toJson()
}