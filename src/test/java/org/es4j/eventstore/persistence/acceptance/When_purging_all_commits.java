package org.es4j.eventstore.persistence.acceptance;

//[Subject("Persistence")]
public class When_purging_all_commits extends Using_the_persistence_engine {

}



/*
	[Subject("Persistence")]
	public class when_purging_all_commits : using_the_persistence_engine
	{
		Establish context = () =>
			persistence.Commit(streamId.BuildAttempt());

		Because of = () =>
		{
			Thread.Sleep(50); // 50 ms = enough time for Raven to become consistent
			persistence.Purge();
		};

		It should_not_find_any_commits_stored = () =>
			persistence.GetFrom(DateTime.MinValue).Count().ShouldEqual(0);

		It should_not_find_any_streams_to_snapshot = () =>
			persistence.GetStreamsToSnapshot(0).Count().ShouldEqual(0);

		It should_not_find_any_undispatched_commits = () =>
			persistence.GetUndispatchedCommits().Count().ShouldEqual(0);
	}
 */