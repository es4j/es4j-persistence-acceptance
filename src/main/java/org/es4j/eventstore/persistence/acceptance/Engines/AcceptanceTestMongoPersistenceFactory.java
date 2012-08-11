package org.es4j.eventstore.persistence.acceptance.Engines;

import org.es4j.persistence.mongo.MongoPersistenceFactory;
import org.es4j.serialization.DocumentObjectSerializer;

//using MongoPersistence;
//using Serialization;

public class AcceptanceTestMongoPersistenceFactory extends MongoPersistenceFactory {

    public AcceptanceTestMongoPersistenceFactory() {
        super("Mongo", new DocumentObjectSerializer());
    }

    @Override
    protected String transformConnectionString(String connectionString) {
        throw new UnsupportedOperationException("Not yet implemented");
        /*
        return connectionString
            .replace("[HOST]", "host".GetSetting() ?? "localhost")
            .replace("[PORT]", "port".GetSetting() ?? string.Empty)
            .replace("[DATABASE]", "database".GetSetting() ?? "EventStore")
            .replace("[USER]", "user".GetSetting() ?? string.Empty)
            .replace("[PASSWORD]", "password".GetSetting() ?? string.Empty);
       */
    }
}
