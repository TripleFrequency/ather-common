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
import media.thehoard.common.database.jooq.tables.records.PartyaccountsRecord;

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
public class Partyaccounts extends TableImpl<PartyaccountsRecord> {

    private static final long serialVersionUID = -1779199374;

    /**
     * The reference instance of <code>thehoard.PartyAccounts</code>
     */
    public static final Partyaccounts PARTYACCOUNTS = new Partyaccounts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartyaccountsRecord> getRecordType() {
        return PartyaccountsRecord.class;
    }

    /**
     * The column <code>thehoard.PartyAccounts.id</code>.
     */
    public final TableField<PartyaccountsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>thehoard.PartyAccounts.accountId</code>.
     */
    public final TableField<PartyaccountsRecord, Integer> ACCOUNTID = createField("accountId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.PartyAccounts.partyId</code>.
     */
    public final TableField<PartyaccountsRecord, Integer> PARTYID = createField("partyId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.PartyAccounts.isActive</code>.
     */
    public final TableField<PartyaccountsRecord, Byte> ISACTIVE = createField("isActive", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>thehoard.PartyAccounts.dateJoined</code>.
     */
    public final TableField<PartyaccountsRecord, Timestamp> DATEJOINED = createField("dateJoined", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>thehoard.PartyAccounts.dateUpdated</code>.
     */
    public final TableField<PartyaccountsRecord, Timestamp> DATEUPDATED = createField("dateUpdated", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>thehoard.PartyAccounts.dateLeft</code>.
     */
    public final TableField<PartyaccountsRecord, Timestamp> DATELEFT = createField("dateLeft", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>thehoard.PartyAccounts</code> table reference
     */
    public Partyaccounts() {
        this(DSL.name("PartyAccounts"), null);
    }

    /**
     * Create an aliased <code>thehoard.PartyAccounts</code> table reference
     */
    public Partyaccounts(String alias) {
        this(DSL.name(alias), PARTYACCOUNTS);
    }

    /**
     * Create an aliased <code>thehoard.PartyAccounts</code> table reference
     */
    public Partyaccounts(Name alias) {
        this(alias, PARTYACCOUNTS);
    }

    private Partyaccounts(Name alias, Table<PartyaccountsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Partyaccounts(Name alias, Table<PartyaccountsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PARTYACCOUNTS_ID_UNIQUE, Indexes.PARTYACCOUNTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PartyaccountsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PARTYACCOUNTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PartyaccountsRecord> getPrimaryKey() {
        return Keys.KEY_PARTYACCOUNTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PartyaccountsRecord>> getKeys() {
        return Arrays.<UniqueKey<PartyaccountsRecord>>asList(Keys.KEY_PARTYACCOUNTS_PRIMARY, Keys.KEY_PARTYACCOUNTS_ID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Partyaccounts as(String alias) {
        return new Partyaccounts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Partyaccounts as(Name alias) {
        return new Partyaccounts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Partyaccounts rename(String name) {
        return new Partyaccounts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Partyaccounts rename(Name name) {
        return new Partyaccounts(name, null);
    }
}
