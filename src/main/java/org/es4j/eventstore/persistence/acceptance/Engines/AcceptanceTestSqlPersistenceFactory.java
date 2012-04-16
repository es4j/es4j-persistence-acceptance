package org.es4j.eventstore.persistence.acceptance.Engines;

//using System.Configuration;
//using System.Transactions;
//using Serialization;
//using SqlPersistence;

public abstract class AcceptanceTestSqlPersistenceFactory extends SqlPersistenceFactory {

    protected AcceptanceTestSqlPersistenceFactory(string connectionName) {
        this(new TransformConfigConnectionFactory(connectionName), new BinarySerializer());
    }

    private AcceptanceTestSqlPersistenceFactory(IConnectionFactory factory, ISerialize serializer) {

        super(factory, serializer, null, TransactionScopeOption.Suppress, 0);
        String pageSize = "pageSize".getSetting();
        if (!String.isNullOrEmpty(pageSize)) {
            this.pageSize = int.Parse(pageSize);
        }
    }
}
