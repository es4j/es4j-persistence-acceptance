package org.es4j.eventstore.persistence.acceptance.Engines;

//using MongoPersistence;

import org.es4j.serialization.DocumentObjectSerializer;

//using Serialization;

public class AcceptanceTestMongoPersistenceFactory extends MongoPersistenceFactory {

    public AcceptanceTestMongoPersistenceFactory() {
        super("Mongo", new DocumentObjectSerializer());
    }

    @Override
    protected String transformConnectionString(String connectionString) {

        return connectionString
				.Replace("[HOST]", "host".GetSetting() ?? "localhost")
				.Replace("[PORT]", "port".GetSetting() ?? string.Empty)
				.Replace("[DATABASE]", "database".GetSetting() ?? "EventStore")
				.Replace("[USER]", "user".GetSetting() ?? string.Empty)
				.Replace("[PASSWORD]", "password".GetSetting() ?? string.Empty);
    }
}
