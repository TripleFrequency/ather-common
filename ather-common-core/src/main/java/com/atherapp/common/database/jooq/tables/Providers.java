/*
 * This file is generated by jOOQ.
 */
package com.atherapp.common.database.jooq.tables;


import com.atherapp.common.database.jooq.Indexes;
import com.atherapp.common.database.jooq.Keys;
import com.atherapp.common.database.jooq.Thehoard;
import com.atherapp.common.database.jooq.tables.records.ProvidersRecord;
import com.atherapp.common.database.jooq.tables.records.ProvidersRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = {"http://www.jooq.org", "jOOQ version:3.10.1"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Providers extends TableImpl<ProvidersRecord> {

	/**
	 * The reference instance of <code>thehoard.Providers</code>
	 */
	public static final Providers PROVIDERS = new Providers();
	private static final long serialVersionUID = 247056838;
	/**
	 * The column <code>thehoard.Providers.Id</code>.
	 */
	public final TableField<ProvidersRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER
			.nullable(false).identity(true), this, "");
	/**
	 * The column <code>thehoard.Providers.Uuid</code>.
	 */
	public final TableField<ProvidersRecord, String> UUID = createField("Uuid", org.jooq.impl.SQLDataType.VARCHAR(36)
			.nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.Alias</code>.
	 */
	public final TableField<ProvidersRecord, String> ALIAS = createField("Alias", org.jooq.impl.SQLDataType.VARCHAR(255)
			.nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.ProviderAlias</code>.
	 */
	public final TableField<ProvidersRecord, String> PROVIDERALIAS = createField("ProviderAlias", org.jooq.impl.SQLDataType
			.VARCHAR(255).nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.TypeId</code>.
	 */
	public final TableField<ProvidersRecord, Byte> TYPEID = createField("TypeId", org.jooq.impl.SQLDataType.TINYINT
			.nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.UsageId</code>.
	 */
	public final TableField<ProvidersRecord, Byte> USAGEID = createField("UsageId", org.jooq.impl.SQLDataType.TINYINT
			.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");
	/**
	 * The column <code>thehoard.Providers.Status</code>.
	 */
	public final TableField<ProvidersRecord, Byte> STATUS = createField("Status", org.jooq.impl.SQLDataType.TINYINT
			.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");
	/**
	 * The column <code>thehoard.Providers.DateCreated</code>.
	 */
	public final TableField<ProvidersRecord, Timestamp> DATECREATED = createField("DateCreated", org.jooq.impl.SQLDataType.TIMESTAMP
			.nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.DateUpdated</code>.
	 */
	public final TableField<ProvidersRecord, Timestamp> DATEUPDATED = createField("DateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP
			.nullable(false), this, "");
	/**
	 * The column <code>thehoard.Providers.Configuration</code>.
	 */
	public final TableField<ProvidersRecord, String> CONFIGURATION = createField("Configuration", org.jooq.impl.SQLDataType.CLOB, this, "");
	/**
	 * The column <code>thehoard.Providers.Credential</code>.
	 */
	public final TableField<ProvidersRecord, String> CREDENTIAL = createField("Credential", org.jooq.impl.SQLDataType.CLOB, this, "");
	/**
	 * The column <code>thehoard.Providers.ChangeToken</code>.
	 */
	public final TableField<ProvidersRecord, String> CHANGETOKEN = createField("ChangeToken", org.jooq.impl.SQLDataType
			.VARCHAR(45), this, "");
	/**
	 * The column <code>thehoard.Providers.OldCredential</code>.
	 */
	public final TableField<ProvidersRecord, byte[]> OLDCREDENTIAL = createField("OldCredential", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * Create a <code>thehoard.Providers</code> table reference
	 */
	public Providers() {
		this(DSL.name("Providers"), null);
	}

	/**
	 * Create an aliased <code>thehoard.Providers</code> table reference
	 */
	public Providers(String alias) {
		this(DSL.name(alias), PROVIDERS);
	}

	/**
	 * Create an aliased <code>thehoard.Providers</code> table reference
	 */
	public Providers(Name alias) {
		this(alias, PROVIDERS);
	}

	private Providers(Name alias, Table<ProvidersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Providers(Name alias, Table<ProvidersRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProvidersRecord> getRecordType() {
		return ProvidersRecord.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return Thehoard.THEHOARD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(Indexes.PROVIDERS_ID_UNIQUE, Indexes.PROVIDERS_PRIMARY, Indexes.PROVIDERS_UUID_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProvidersRecord, Integer> getIdentity() {
		return Keys.IDENTITY_PROVIDERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProvidersRecord> getPrimaryKey() {
		return Keys.KEY_PROVIDERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProvidersRecord>> getKeys() {
		return Arrays.<UniqueKey<ProvidersRecord>>asList(Keys.KEY_PROVIDERS_PRIMARY, Keys.KEY_PROVIDERS_ID_UNIQUE, Keys.KEY_PROVIDERS_UUID_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Providers as(String alias) {
		return new Providers(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Providers as(Name alias) {
		return new Providers(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public Providers rename(String name) {
		return new Providers(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public Providers rename(Name name) {
		return new Providers(name, null);
	}
}
