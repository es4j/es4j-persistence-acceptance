package org.es4j.eventstore.persistence.acceptance.Engines;

import java.util.UUID;
import org.es4j.dotnet.data.ConnectionStringSettings;
import org.es4j.eventstore.persistence.acceptance.ConfigurationExtensions;
import org.es4j.persistence.sql.ConfigurationConnectionFactory;


public class TransformConfigConnectionFactory extends ConfigurationConnectionFactory {

    public TransformConfigConnectionFactory(String connectionName) {
        super(connectionName);
    }

    @Override
    protected String buildConnectionString(UUID streamId, ConnectionStringSettings setting) {
        String cs = setting.getConnectionString();
        /*
        return setting.getConnectionString()
				.Replace("[HOST]", "host".GetSetting() ?? "localhost")
				.Replace("[PORT]", "port".GetSetting() ?? string.Empty)
				.Replace("[DATABASE]", "database".GetSetting() ?? "EventStore")
				.Replace("[USER]", "user".GetSetting() ?? string.Empty)
				.Replace("[PASSWORD]", "password".GetSetting() ?? string.Empty);
        */
        
        String host = ConfigurationExtensions.getSetting("host");
        cs = cs.replace("[HOST]", host!=null? host : "localhost");
        
        String port = ConfigurationExtensions.getSetting("port");
        cs = cs.replace("[PORT", port!=null? port : "");
        
        String database = ConfigurationExtensions.getSetting("database");
        cs = cs.replace("[DATABASE]", database!=null? database : "EventStore");
        
        String user = ConfigurationExtensions.getSetting("user");
        cs = cs.replace("[USER]", user!=null? user : "");
        
        String password = ConfigurationExtensions.getSetting("password");
        cs = cs.replace("[PASSWORD", password!=null? password : "");
        
        return cs;
    }
}









