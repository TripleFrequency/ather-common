/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables.records;


import javax.annotation.Generated;

import media.thehoard.hoardmediaserver.common.database.jooq.tables.Providerfilerelationships;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ProviderfilerelationshipsRecord extends UpdatableRecordImpl<ProviderfilerelationshipsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -298074679;

    /**
     * Setter for <code>thehoard.ProviderFileRelationships.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>thehoard.ProviderFileRelationships.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>thehoard.ProviderFileRelationships.FileUuid</code>.
     */
    public void setFileuuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>thehoard.ProviderFileRelationships.FileUuid</code>.
     */
    public String getFileuuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>thehoard.ProviderFileRelationships.ParentUuid</code>.
     */
    public void setParentuuid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>thehoard.ProviderFileRelationships.ParentUuid</code>.
     */
    public String getParentuuid() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Providerfilerelationships.PROVIDERFILERELATIONSHIPS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Providerfilerelationships.PROVIDERFILERELATIONSHIPS.FILEUUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Providerfilerelationships.PROVIDERFILERELATIONSHIPS.PARENTUUID;
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
        return getFileuuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParentuuid();
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
        return getFileuuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParentuuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderfilerelationshipsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderfilerelationshipsRecord value2(String value) {
        setFileuuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderfilerelationshipsRecord value3(String value) {
        setParentuuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderfilerelationshipsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProviderfilerelationshipsRecord
     */
    public ProviderfilerelationshipsRecord() {
        super(Providerfilerelationships.PROVIDERFILERELATIONSHIPS);
    }

    /**
     * Create a detached, initialised ProviderfilerelationshipsRecord
     */
    public ProviderfilerelationshipsRecord(Integer id, String fileuuid, String parentuuid) {
        super(Providerfilerelationships.PROVIDERFILERELATIONSHIPS);

        set(0, id);
        set(1, fileuuid);
        set(2, parentuuid);
    }
}
