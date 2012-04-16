package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_attempting_to_persist_a_commit_twice {

}


/*
	[Subject("Persistence")]
	public class when_attempting_to_persist_a_commit_twice : using_the_persistence_engine
	{
		static readonly Commit attemptTwice = streamId.BuildAttempt();
		static Exception thrown;

		Establish context = () =>
			persistence.Commit(attemptTwice);

		Because of = () =>
			thrown = Catch.Exception(() => persistence.Commit(attemptTwice));

		It should_throw_a_DuplicateCommitException = () =>
			thrown.ShouldBeOfType<DuplicateCommitException>();
	}
 */