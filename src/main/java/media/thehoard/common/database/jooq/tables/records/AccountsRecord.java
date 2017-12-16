/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import media.thehoard.common.database.jooq.tables.Accounts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AccountsRecord extends UpdatableRecordImpl<AccountsRecord> implements Record7<Integer, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2137238549;

    /**
     * Setter for <code>thehoard.Accounts.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thehoard.Accounts.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>thehoard.Accounts.Email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.Email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>thehoard.Accounts.PasswordHash</code>.
     */
    public void setPasswordhash(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.PasswordHash</code>.
     */
    public String getPasswordhash() {
        return (String) get(3);
    }

    /**
     * Setter for <code>thehoard.Accounts.PasswordSalt</code>.
     */
    public void setPasswordsalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.PasswordSalt</code>.
     */
    public String getPasswordsalt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>thehoard.Accounts.DateCreated</code>.
     */
    public void setDatecreated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.DateCreated</code>.
     */
    public Timestamp getDatecreated() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>thehoard.Accounts.DateUpdated</code>.
     */
    public void setDateupdated(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>thehoard.Accounts.DateUpdated</code>.
     */
    public Timestamp getDateupdated() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Accounts.ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Accounts.ACCOUNTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Accounts.ACCOUNTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Accounts.ACCOUNTS.PASSWORDHASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Accounts.ACCOUNTS.PASSWORDSALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Accounts.ACCOUNTS.DATECREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Accounts.ACCOUNTS.DATEUPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPasswordhash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPasswordsalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getDatecreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getDateupdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPasswordhash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPasswordsalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getDatecreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDateupdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value4(String value) {
        setPasswordhash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value5(String value) {
        setPasswordsalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value6(Timestamp value) {
        setDatecreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord value7(Timestamp value) {
        setDateupdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountsRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsRecord
     */
    public AccountsRecord() {
        super(Accounts.ACCOUNTS);
    }

    /**
     * Create a detached, initialised AccountsRecord
     */
    public AccountsRecord(Integer id, String name, String email, String passwordhash, String passwordsalt, Timestamp datecreated, Timestamp dateupdated) {
        super(Accounts.ACCOUNTS);

        set(0, id);
        set(1, name);
        set(2, email);
        set(3, passwordhash);
        set(4, passwordsalt);
        set(5, datecreated);
        set(6, dateupdated);
    }
}
