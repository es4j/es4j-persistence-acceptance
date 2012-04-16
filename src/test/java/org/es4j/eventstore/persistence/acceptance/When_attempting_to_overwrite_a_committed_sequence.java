package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_attempting_to_overwrite_a_committed_sequence {

}


/*
	[Subject("Persistence")]
	public class when_attempting_to_overwrite_a_committed_sequence : using_the_persistence_engine
	{
		static readonly Commit successfulAttempt = streamId.BuildAttempt();
		static readonly Commit failedAttempt = streamId.BuildAttempt();
		static Exception thrown;

		Establish context = () =>
			persistence.Commit(successfulAttempt);

		Because of = () =>
			thrown = Catch.Exception(() => persistence.Commit(failedAttempt));

		It should_throw_a_ConcurrencyException = () =>
			thrown.ShouldBeOfType<ConcurrencyException>();
	}
 */