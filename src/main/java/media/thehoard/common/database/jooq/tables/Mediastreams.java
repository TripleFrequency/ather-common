/*
 * This file is generated by jOOQ.
*/
package media.thehoard.common.database.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import media.thehoard.common.database.jooq.Indexes;
import media.thehoard.common.database.jooq.Keys;
import media.thehoard.common.database.jooq.Thehoard;
import media.thehoard.common.database.jooq.tables.records.MediastreamsRecord;

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
public class Mediastreams extends TableImpl<MediastreamsRecord> {

    private static final long serialVersionUID = 930039642;

    /**
     * The reference instance of <code>thehoard.MediaStreams</code>
     */
    public static final Mediastreams MEDIASTREAMS = new Mediastreams();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MediastreamsRecord> getRecordType() {
        return MediastreamsRecord.class;
    }

    /**
     * The column <code>thehoard.MediaStreams.Id</code>.
     */
    public final TableField<MediastreamsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Uuid</code>.
     */
    public final TableField<MediastreamsRecord, String> UUID = createField("Uuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>thehoard.MediaStreams.MediaFileUuid</code>.
     */
    public final TableField<MediastreamsRecord, String> MEDIAFILEUUID = createField("MediaFileUuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Index</code>.
     */
    public final TableField<MediastreamsRecord, Short> INDEX = createField("Index", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>thehoard.MediaStreams.CodecName</code>.
     */
    public final TableField<MediastreamsRecord, String> CODECNAME = createField("CodecName", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Profile</code>.
     */
    public final TableField<MediastreamsRecord, String> PROFILE = createField("Profile", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>thehoard.MediaStreams.CodecType</code>.
     */
    public final TableField<MediastreamsRecord, Byte> CODECTYPE = createField("CodecType", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>thehoard.MediaStreams.CodecTimeBase</code>.
     */
    public final TableField<MediastreamsRecord, Double> CODECTIMEBASE = createField("CodecTimeBase", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>thehoard.MediaStreams.Width</code>.
     */
    public final TableField<MediastreamsRecord, Integer> WIDTH = createField("Width", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.Height</code>.
     */
    public final TableField<MediastreamsRecord, Integer> HEIGHT = createField("Height", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.AspectRatio</code>.
     */
    public final TableField<MediastreamsRecord, Double> ASPECTRATIO = createField("AspectRatio", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>thehoard.MediaStreams.PixelFormat</code>.
     */
    public final TableField<MediastreamsRecord, String> PIXELFORMAT = createField("PixelFormat", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>thehoard.MediaStreams.BitDepth</code>.
     */
    public final TableField<MediastreamsRecord, Integer> BITDEPTH = createField("BitDepth", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.Level</code>.
     */
    public final TableField<MediastreamsRecord, Integer> LEVEL = createField("Level", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.ReferenceFrames</code>.
     */
    public final TableField<MediastreamsRecord, Integer> REFERENCEFRAMES = createField("ReferenceFrames", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.AverageFrameRate</code>.
     */
    public final TableField<MediastreamsRecord, Double> AVERAGEFRAMERATE = createField("AverageFrameRate", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>thehoard.MediaStreams.TimeBase</code>.
     */
    public final TableField<MediastreamsRecord, Double> TIMEBASE = createField("TimeBase", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>thehoard.MediaStreams.BitRate</code>.
     */
    public final TableField<MediastreamsRecord, Integer> BITRATE = createField("BitRate", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.IsDefault</code>.
     */
    public final TableField<MediastreamsRecord, Boolean> ISDEFAULT = createField("IsDefault", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>thehoard.MediaStreams.IsForced</code>.
     */
    public final TableField<MediastreamsRecord, Boolean> ISFORCED = createField("IsForced", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>thehoard.MediaStreams.IsExternal</code>.
     */
    public final TableField<MediastreamsRecord, Boolean> ISEXTERNAL = createField("IsExternal", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Language</code>.
     */
    public final TableField<MediastreamsRecord, String> LANGUAGE = createField("Language", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Title</code>.
     */
    public final TableField<MediastreamsRecord, String> TITLE = createField("Title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>thehoard.MediaStreams.Duration</code>.
     */
    public final TableField<MediastreamsRecord, Integer> DURATION = createField("Duration", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.SampleRate</code>.
     */
    public final TableField<MediastreamsRecord, Integer> SAMPLERATE = createField("SampleRate", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.Channels</code>.
     */
    public final TableField<MediastreamsRecord, Integer> CHANNELS = createField("Channels", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>thehoard.MediaStreams.ChannelLayout</code>.
     */
    public final TableField<MediastreamsRecord, String> CHANNELLAYOUT = createField("ChannelLayout", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>thehoard.MediaStreams</code> table reference
     */
    public Mediastreams() {
        this(DSL.name("MediaStreams"), null);
    }

    /**
     * Create an aliased <code>thehoard.MediaStreams</code> table reference
     */
    public Mediastreams(String alias) {
        this(DSL.name(alias), MEDIASTREAMS);
    }

    /**
     * Create an aliased <code>thehoard.MediaStreams</code> table reference
     */
    public Mediastreams(Name alias) {
        this(alias, MEDIASTREAMS);
    }

    private Mediastreams(Name alias, Table<MediastreamsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mediastreams(Name alias, Table<MediastreamsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.MEDIASTREAMS_ID_UNIQUE, Indexes.MEDIASTREAMS_PRIMARY, Indexes.MEDIASTREAMS_UUID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MediastreamsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEDIASTREAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MediastreamsRecord> getPrimaryKey() {
        return Keys.KEY_MEDIASTREAMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MediastreamsRecord>> getKeys() {
        return Arrays.<UniqueKey<MediastreamsRecord>>asList(Keys.KEY_MEDIASTREAMS_PRIMARY, Keys.KEY_MEDIASTREAMS_ID_UNIQUE, Keys.KEY_MEDIASTREAMS_UUID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mediastreams as(String alias) {
        return new Mediastreams(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mediastreams as(Name alias) {
        return new Mediastreams(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mediastreams rename(String name) {
        return new Mediastreams(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mediastreams rename(Name name) {
        return new Mediastreams(name, null);
    }
}
