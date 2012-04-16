package org.es4j.eventstore.persistence.acceptance.Engines;


public class TransformConfigConnectionFactory extends ConfigurationConnectionFactory {

    public TransformConfigConnectionFactory(String connectionName) {
        super(connectionName);
    }

    @Override
    protected String BuildConnectionString(Guid streamId, ConnectionStringSettings setting) {
        return setting.ConnectionString
				.Replace("[HOST]", "host".GetSetting() ?? "localhost")
				.Replace("[PORT]", "port".GetSetting() ?? string.Empty)
				.Replace("[DATABASE]", "database".GetSetting() ?? "EventStore")
				.Replace("[USER]", "user".GetSetting() ?? string.Empty)
				.Replace("[PASSWORD]", "password".GetSetting() ?? string.Empty);
    }
}









