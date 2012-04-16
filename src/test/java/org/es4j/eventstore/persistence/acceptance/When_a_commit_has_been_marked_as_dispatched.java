package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_a_commit_has_been_marked_as_dispatched {

}


/*
	[Subject("Persistence")]
	public class when_a_commit_has_been_marked_as_dispatched : using_the_persistence_engine
	{
		static readonly Commit attempt = streamId.BuildAttempt();

		Establish context = () =>
			persistence.Commit(attempt);

		Because of = () =>
			persistence.MarkCommitAsDispatched(attempt);

		It should_no_longer_be_found_in_the_set_of_undispatched_commits = () =>
			persistence.GetUndispatchedCommits()
				.FirstOrDefault(x => x.CommitId == attempt.CommitId).ShouldBeNull();
	}
 */