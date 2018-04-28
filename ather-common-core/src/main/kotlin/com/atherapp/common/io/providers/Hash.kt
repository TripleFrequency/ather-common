package com.atherapp.common.io.providers

import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.security.DigestInputStream
import java.security.MessageDigest

object HashExceptions {
    class UnsupportedHashException(cause: Throwable) : IOException("Hash type not supported", cause)
}

enum class Hash(
        val width: Int,
        val supported: Boolean,
        private val algorithm: String = this.toString(),
        val hasher: MessageDigest? = if (supported) MessageDigest.getInstance(algorithm) else null
) {
    /**
     * Indicates MD5 Support
     */
    MD5(32, true),
    /**
     * Indicates SHA-1 Support
     */
    SHA1(40, false, "SHA-1"),
    /**
     * Indicates Dropbox special hash
     * @see <a href="https://www.dropbox.com/developers/reference/content-hash">Dropbox Content Hash</a>
     */
    Dropbox(64, false),
    /**
     * Indicates Microsoft OneDrive hash
     * @see <a href="https://docs.microsoft.com/en-us/onedrive/developer/code-snippets/quickxorhash">OneDrive QuickXorHash</a>
     */
    QuickXorHash(40, false),
    /**
     * Indicates no hashes are supported
     */
    None(-1, false);

    companion object {
        /**
         * @return Set of all supported hash types
         */
        fun supported() = Hash.values().filter { h -> h.width != -1 && h.supported }.toSet()

        /**
         * @return Map of hash types and their hashers
         */
        fun hashers(types: Set<Hash> = supported()): Map<Hash, MessageDigest> {
            val map = HashMap<Hash, MessageDigest>(types.size)
            for (type in types)
                map[type] = type.hasher()
            return map
        }

        /**
         * Calculate the hashes of all supported hash types
         *
         * @see [streamTypes]
         */
        fun stream(input: InputStream): Map<Hash, String> = streamTypes(input, supported())

        /**
         * Calculate the hashes of the requested hash types
         *
         * @throws [HashExceptions.UnsupportedHashException] if an unsupported hash is passed
         */
        fun streamTypes(input: InputStream, set: Set<Hash>): Map<Hash, String> {
            val hashers = hashers(set)
            val hashOut = hashers.toMultiOutputStream()
        }

        private fun Map<Hash, MessageDigest>.toMultiOutputStream(): OutputStream {
            val streams = mutableListOf<OutputStream>()
            for ((hash, hasher) in this) {
                streams.add(hasher)
            }
        }
    }
}

