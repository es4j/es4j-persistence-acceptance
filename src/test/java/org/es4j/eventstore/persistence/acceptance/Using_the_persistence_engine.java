package org.es4j.eventstore.persistence.acceptance;


public abstract class Using_the_persistence_engine {

    protected static final PersistenceFactoryScanner factoryScanner = new PersistenceFactoryScanner();
    protected static final IPersistenceFactory       factory        = FactoryScanner.GetFactory();

    protected static Guid            streamId = Guid.newGuid();
    protected static IPersistStreams persistence;

    protected void establishContext() {
        persistence = new PerformanceCounterPersistenceEngine(Factory.build(), "tests");
        persistence.initialize();
    }

    protected void cleanupEverything() {
        persistence.dispose();
        persistence = null;
        streamId = Guid.newGuid();
    }
}


/*
	public abstract class using_the_persistence_engine
	{
		protected static readonly PersistenceFactoryScanner FactoryScanner = new PersistenceFactoryScanner();
		protected static readonly IPersistenceFactory Factory = FactoryScanner.GetFactory();
		protected static Guid streamId = Guid.NewGuid();
		protected static IPersistStreams persistence;

		Establish context = () =>
		{
			persistence = new PerformanceCounterPersistenceEngine(Factory.Build(), "tests");
			persistence.Initialize();
		};

		Cleanup everything = () =>
		{
			persistence.Dispose();
			persistence = null;
			streamId = Guid.NewGuid();
		};
	}
*/
