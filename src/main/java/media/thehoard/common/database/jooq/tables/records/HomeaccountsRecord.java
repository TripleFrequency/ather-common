/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import media.thehoard.hoardmediaserver.common.database.jooq.tables.Homeaccounts;

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
public class HomeaccountsRecord extends UpdatableRecordImpl<HomeaccountsRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 270527816;

    /**
     * Setter for <code>thehoard.HomeAccounts.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thehoard.HomeAccounts.accountId</code>.
     */
    public void setAccountid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.accountId</code>.
     */
    public Integer getAccountid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>thehoard.HomeAccounts.homeId</code>.
     */
    public void setHomeid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.homeId</code>.
     */
    public Integer getHomeid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>thehoard.HomeAccounts.pin</code>.
     */
    public void setPin(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.pin</code>.
     */
    public Integer getPin() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>thehoard.HomeAccounts.dateJoined</code>.
     */
    public void setDatejoined(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.dateJoined</code>.
     */
    public Timestamp getDatejoined() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>thehoard.HomeAccounts.dateLeft</code>.
     */
    public void setDateleft(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>thehoard.HomeAccounts.dateLeft</code>.
     */
    public Timestamp getDateleft() {
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
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Homeaccounts.HOMEACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Homeaccounts.HOMEACCOUNTS.ACCOUNTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Homeaccounts.HOMEACCOUNTS.HOMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Homeaccounts.HOMEACCOUNTS.PIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Homeaccounts.HOMEACCOUNTS.DATEJOINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Homeaccounts.HOMEACCOUNTS.DATELEFT;
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
        return getAccountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getHomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPin();
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
        return getDateleft();
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
        return getAccountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getHomeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPin();
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
        return getDateleft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value2(Integer value) {
        setAccountid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value3(Integer value) {
        setHomeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value4(Integer value) {
        setPin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value5(Timestamp value) {
        setDatejoined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord value6(Timestamp value) {
        setDateleft(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HomeaccountsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached HomeaccountsRecord
     */
    public HomeaccountsRecord() {
        super(Homeaccounts.HOMEACCOUNTS);
    }

    /**
     * Create a detached, initialised HomeaccountsRecord
     */
    public HomeaccountsRecord(Integer id, Integer accountid, Integer homeid, Integer pin, Timestamp datejoined, Timestamp dateleft) {
        super(Homeaccounts.HOMEACCOUNTS);

        set(0, id);
        set(1, accountid);
        set(2, homeid);
        set(3, pin);
        set(4, datejoined);
        set(5, dateleft);
    }
}
