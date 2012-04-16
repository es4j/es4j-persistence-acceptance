package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_committing_a_stream_with_the_same_revision {

}


/*
	[Subject("Persistence")]
	public class when_committing_a_stream_with_the_same_revision : using_the_persistence_engine
	{
		static readonly IPersistStreams persistence1 = Factory.Build();
		static readonly Commit attempt1 = streamId.BuildAttempt();
		static readonly Commit attempt2 = streamId.BuildAttempt();
		static Exception thrown;

		Establish context = () =>
			persistence1.Commit(attempt1);

		Because of = () =>
			thrown = Catch.Exception(() => persistence1.Commit(attempt2));

		It should_throw_a_ConcurrencyException = () =>
			thrown.ShouldBeOfType<ConcurrencyException>();

		Cleanup cleanup = () =>
			persistence1.Dispose();
	}
 */