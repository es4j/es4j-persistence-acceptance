package org.es4j.eventstore.persistence.acceptance.Engines;

import org.es4j.dotnet.data.TransactionScopeOption;
import org.es4j.eventstore.persistence.acceptance.ConfigurationExtensions;
import org.es4j.persistence.sql.IConnectionFactory;
import org.es4j.persistence.sql.SqlPersistenceFactory;
import org.es4j.serialization.BinarySerializer;
import org.es4j.serialization.api.ISerialize;

//using System.Configuration;
//using System.Transactions;
//using Serialization;
//using SqlPersistence;

public abstract class AcceptanceTestSqlPersistenceFactory extends SqlPersistenceFactory {

    protected AcceptanceTestSqlPersistenceFactory(String connectionName) {
        this(new TransformConfigConnectionFactory(connectionName), new BinarySerializer());
    }

    private AcceptanceTestSqlPersistenceFactory(IConnectionFactory factory, ISerialize serializer) {
        super(factory, serializer, null, TransactionScopeOption.Suppress, 0);
        String pageSize = ConfigurationExtensions.getSetting("pageSize");
        if (pageSize != null || pageSize != "") {
            this.pageSize = Integer.valueOf(pageSize);
        }
    }
}
