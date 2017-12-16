/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import media.thehoard.common.database.jooq.Indexes;
import media.thehoard.common.database.jooq.Keys;
import media.thehoard.common.database.jooq.Thehoard;
import media.thehoard.common.database.jooq.tables.records.ProviderfilesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Providerfiles extends TableImpl<ProviderfilesRecord> {

    private static final long serialVersionUID = -1907344374;

    /**
     * The reference instance of <code>thehoard.ProviderFiles</code>
     */
    public static final Providerfiles PROVIDERFILES = new Providerfiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProviderfilesRecord> getRecordType() {
        return ProviderfilesRecord.class;
    }

    /**
     * The column <code>thehoard.ProviderFiles.Id</code>.
     */
    public final TableField<ProviderfilesRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Uuid</code>.
     */
    public final TableField<ProviderfilesRecord, String> UUID = createField("Uuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.ProviderUuid</code>.
     */
    public final TableField<ProviderfilesRecord, String> PROVIDERUUID = createField("ProviderUuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Name</code>.
     */
    public final TableField<ProviderfilesRecord, String> NAME = createField("Name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.MimeType</code>.
     */
    public final TableField<ProviderfilesRecord, String> MIMETYPE = createField("MimeType", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Description</code>.
     */
    public final TableField<ProviderfilesRecord, String> DESCRIPTION = createField("Description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Status</code>.
     */
    public final TableField<ProviderfilesRecord, Byte> STATUS = createField("Status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.ProviderFileId</code>.
     */
    public final TableField<ProviderfilesRecord, String> PROVIDERFILEID = createField("ProviderFileId", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Type</code>.
     */
    public final TableField<ProviderfilesRecord, Byte> TYPE = createField("Type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.DateCreated</code>.
     */
    public final TableField<ProviderfilesRecord, Timestamp> DATECREATED = createField("DateCreated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.DateUpdated</code>.
     */
    public final TableField<ProviderfilesRecord, Timestamp> DATEUPDATED = createField("DateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Size</code>.
     */
    public final TableField<ProviderfilesRecord, Long> SIZE = createField("Size", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>thehoard.ProviderFiles.Hash</code>.
     */
    public final TableField<ProviderfilesRecord, String> HASH = createField("Hash", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>thehoard.ProviderFiles</code> table reference
     */
    public Providerfiles() {
        this(DSL.name("ProviderFiles"), null);
    }

    /**
     * Create an aliased <code>thehoard.ProviderFiles</code> table reference
     */
    public Providerfiles(String alias) {
        this(DSL.name(alias), PROVIDERFILES);
    }

    /**
     * Create an aliased <code>thehoard.ProviderFiles</code> table reference
     */
    public Providerfiles(Name alias) {
        this(alias, PROVIDERFILES);
    }

    private Providerfiles(Name alias, Table<ProviderfilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Providerfiles(Name alias, Table<ProviderfilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.PROVIDERFILES_ID_UNIQUE, Indexes.PROVIDERFILES_PRIMARY, Indexes.PROVIDERFILES_UUID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProviderfilesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROVIDERFILES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProviderfilesRecord> getPrimaryKey() {
        return Keys.KEY_PROVIDERFILES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProviderfilesRecord>> getKeys() {
        return Arrays.<UniqueKey<ProviderfilesRecord>>asList(Keys.KEY_PROVIDERFILES_PRIMARY, Keys.KEY_PROVIDERFILES_ID_UNIQUE, Keys.KEY_PROVIDERFILES_UUID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Providerfiles as(String alias) {
        return new Providerfiles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Providerfiles as(Name alias) {
        return new Providerfiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Providerfiles rename(String name) {
        return new Providerfiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Providerfiles rename(Name name) {
        return new Providerfiles(name, null);
    }
}
