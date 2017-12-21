/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import media.thehoard.common.database.jooq.tables.Partyaccounts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PartyaccountsRecord extends UpdatableRecordImpl<PartyaccountsRecord> implements Record6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2139243916;

    /**
     * Setter for <code>thehoard.PartyAccounts.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thehoard.PartyAccounts.UserId</code>.
     */
    public void setUserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.UserId</code>.
     */
    public Integer getUserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>thehoard.PartyAccounts.PartyId</code>.
     */
    public void setPartyid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.PartyId</code>.
     */
    public Integer getPartyid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>thehoard.PartyAccounts.IsActive</code>.
     */
    public void setIsactive(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.IsActive</code>.
     */
    public Byte getIsactive() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>thehoard.PartyAccounts.DateJoined</code>.
     */
    public void setDatejoined(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.DateJoined</code>.
     */
    public Timestamp getDatejoined() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>thehoard.PartyAccounts.DateUpdated</code>.
     */
    public void setDateupdated(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>thehoard.PartyAccounts.DateUpdated</code>.
     */
    public Timestamp getDateupdated() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Partyaccounts.PARTYACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Partyaccounts.PARTYACCOUNTS.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Partyaccounts.PARTYACCOUNTS.PARTYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return Partyaccounts.PARTYACCOUNTS.ISACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Partyaccounts.PARTYACCOUNTS.DATEJOINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Partyaccounts.PARTYACCOUNTS.DATEUPDATED;
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
    public Integer component2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPartyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDatejoined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
    public Integer value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPartyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsactive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDatejoined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getDateupdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value2(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value3(Integer value) {
        setPartyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value4(Byte value) {
        setIsactive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value5(Timestamp value) {
        setDatejoined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord value6(Timestamp value) {
        setDateupdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PartyaccountsRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PartyaccountsRecord
     */
    public PartyaccountsRecord() {
        super(Partyaccounts.PARTYACCOUNTS);
    }

    /**
     * Create a detached, initialised PartyaccountsRecord
     */
    public PartyaccountsRecord(Integer id, Integer userid, Integer partyid, Byte isactive, Timestamp datejoined, Timestamp dateupdated) {
        super(Partyaccounts.PARTYACCOUNTS);

        set(0, id);
        set(1, userid);
        set(2, partyid);
        set(3, isactive);
        set(4, datejoined);
        set(5, dateupdated);
    }
}
