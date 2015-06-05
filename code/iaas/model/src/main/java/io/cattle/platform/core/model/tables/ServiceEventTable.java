/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ServiceEventTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.ServiceEventRecord> {

	private static final long serialVersionUID = 1789665555;

	/**
	 * The singleton instance of <code>cattle.service_event</code>
	 */
	public static final io.cattle.platform.core.model.tables.ServiceEventTable SERVICE_EVENT = new io.cattle.platform.core.model.tables.ServiceEventTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.ServiceEventRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.ServiceEventRecord.class;
	}

	/**
	 * The column <code>cattle.service_event.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.service_event.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.service_event.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.service_event.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.service_event.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.service_event.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.service_event.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.service_event.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.service_event.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.service_event.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.service_event.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.service_event.host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.service_event.healthcheck_uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> HEALTHCHECK_UUID = createField("healthcheck_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.service_event.instance_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.service_event.healthcheck_instance_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> HEALTHCHECK_INSTANCE_ID = createField("healthcheck_instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.service_event.reported_health</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.String> REPORTED_HEALTH = createField("reported_health", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.service_event.external_timestamp</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Integer> EXTERNAL_TIMESTAMP = createField("external_timestamp", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>cattle.service_event</code> table reference
	 */
	public ServiceEventTable() {
		this("service_event", null);
	}

	/**
	 * Create an aliased <code>cattle.service_event</code> table reference
	 */
	public ServiceEventTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.ServiceEventTable.SERVICE_EVENT);
	}

	private ServiceEventTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ServiceEventRecord> aliased) {
		this(alias, aliased, null);
	}

	private ServiceEventTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ServiceEventRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.ServiceEventRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_SERVICE_EVENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ServiceEventRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_SERVICE_EVENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ServiceEventRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ServiceEventRecord>>asList(io.cattle.platform.core.model.Keys.KEY_SERVICE_EVENT_PRIMARY, io.cattle.platform.core.model.Keys.KEY_SERVICE_EVENT_IDX_SERVICE_EVENT_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ServiceEventRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ServiceEventRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_SERVICE_EVENT__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_SERVICE_EVENT__HOST_ID, io.cattle.platform.core.model.Keys.FK_SERVICE_EVENT__INSTANCE_ID, io.cattle.platform.core.model.Keys.FK_SERVICE_EVENT__HEALTHCHECK_INSTANCE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.ServiceEventTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.ServiceEventTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.ServiceEventTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.ServiceEventTable(name, null);
	}
}