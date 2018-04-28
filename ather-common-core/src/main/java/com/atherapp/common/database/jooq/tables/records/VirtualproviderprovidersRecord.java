/*
 * This file is generated by jOOQ.
 */
package com.atherapp.common.database.jooq.tables.records;


import com.atherapp.common.database.jooq.tables.Virtualproviderproviders;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * Provider references for virtual providers
 */
@Generated(value = {"http://www.jooq.org", "jOOQ version:3.10.1"}, comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VirtualproviderprovidersRecord extends UpdatableRecordImpl<VirtualproviderprovidersRecord>
		implements Record8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Timestamp> {

	private static final long serialVersionUID = -1727054;

	/**
	 * Create a detached VirtualproviderprovidersRecord
	 */
	public VirtualproviderprovidersRecord() {
		super(Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS);
	}

	/**
	 * Create a detached, initialised VirtualproviderprovidersRecord
	 */
	public VirtualproviderprovidersRecord(Integer id, Integer providerid, String providerrootvirtualpath, String providerrootid, Integer virtualproviderid, Timestamp datecreated, Timestamp dateupdated, Timestamp datedeleted) {
		super(Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS);

		set(0, id);
		set(1, providerid);
		set(2, providerrootvirtualpath);
		set(3, providerrootid);
		set(4, virtualproviderid);
		set(5, datecreated);
		set(6, dateupdated);
		set(7, datedeleted);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.id</code>.
	 */
	public Integer getId() {
		return (Integer) get(0);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.id</code>.
	 */
	public void setId(Integer value) {
		set(0, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.providerId</code>.
	 */
	public Integer getProviderid() {
		return (Integer) get(1);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.providerId</code>.
	 */
	public void setProviderid(Integer value) {
		set(1, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.providerRootVirtualPath</code>.
	 */
	public String getProviderrootvirtualpath() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.providerRootVirtualPath</code>.
	 */
	public void setProviderrootvirtualpath(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.providerRootId</code>.
	 */
	public String getProviderrootid() {
		return (String) get(3);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.providerRootId</code>.
	 */
	public void setProviderrootid(String value) {
		set(3, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.virtualProviderId</code>.
	 */
	public Integer getVirtualproviderid() {
		return (Integer) get(4);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.virtualProviderId</code>.
	 */
	public void setVirtualproviderid(Integer value) {
		set(4, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.dateCreated</code>.
	 */
	public Timestamp getDatecreated() {
		return (Timestamp) get(5);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.dateCreated</code>.
	 */
	public void setDatecreated(Timestamp value) {
		set(5, value);
	}

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.dateUpdated</code>.
	 */
	public Timestamp getDateupdated() {
		return (Timestamp) get(6);
	}

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.dateUpdated</code>.
	 */
	public void setDateupdated(Timestamp value) {
		set(6, value);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * Getter for <code>thehoard.VirtualProviderProviders.dateDeleted</code>.
	 */
	public Timestamp getDatedeleted() {
		return (Timestamp) get(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * Setter for <code>thehoard.VirtualProviderProviders.dateDeleted</code>.
	 */
	public void setDatedeleted(Timestamp value) {
		set(7, value);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Integer, String, String, Integer, Timestamp, Timestamp, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.PROVIDERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.PROVIDERROOTVIRTUALPATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.PROVIDERROOTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.VIRTUALPROVIDERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.DATECREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.DATEUPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Virtualproviderproviders.VIRTUALPROVIDERPROVIDERS.DATEDELETED;
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
		return getProviderid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getProviderrootvirtualpath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component4() {
		return getProviderrootid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component5() {
		return getVirtualproviderid();
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
	public Timestamp component8() {
		return getDatedeleted();
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
		return getProviderid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getProviderrootvirtualpath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getProviderrootid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getVirtualproviderid();
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
	public Timestamp value8() {
		return getDatedeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value2(Integer value) {
		setProviderid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value3(String value) {
		setProviderrootvirtualpath(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value4(String value) {
		setProviderrootid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value5(Integer value) {
		setVirtualproviderid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value6(Timestamp value) {
		setDatecreated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value7(Timestamp value) {
		setDateupdated(value);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord value8(Timestamp value) {
		setDatedeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VirtualproviderprovidersRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Timestamp value6, Timestamp value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}
}
