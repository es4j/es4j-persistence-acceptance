package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_a_commit_is_successfully_persisted {

}


/*
	[Subject("Persistence")]
	public class when_a_commit_is_successfully_persisted : using_the_persistence_engine
	{
		static readonly DateTime now = SystemTime.UtcNow.AddYears(1);
		static readonly Commit attempt = streamId.BuildAttempt(now);
		static Commit persisted;

		Establish context = () =>
			persistence.Commit(attempt);

		Because of = () =>
			persisted = persistence.GetFrom(streamId, 0, int.MaxValue).First();

		It should_correctly_persist_the_stream_identifier = () =>
			persisted.StreamId.ShouldEqual(attempt.StreamId);

		It should_correctly_persist_the_stream_stream_revision = () =>
			persisted.StreamRevision.ShouldEqual(attempt.StreamRevision);

		It should_correctly_persist_the_commit_identifier = () =>
			persisted.CommitId.ShouldEqual(attempt.CommitId);

		It should_correctly_persist_the_commit_sequence = () =>
			persisted.CommitSequence.ShouldEqual(attempt.CommitSequence);

		// persistence engines have varying levels of precision with respect to time.
		It should_correctly_persist_the_commit_stamp = () =>
			persisted.CommitStamp.Subtract(now).ShouldBeLessThan(TimeSpan.FromSeconds(1));

		It should_correctly_persist_the_headers = () =>
			persisted.Headers.Count.ShouldEqual(attempt.Headers.Count);

		It should_correctly_persist_the_events = () =>
			persisted.Events.Count.ShouldEqual(attempt.Events.Count);

		It should_add_the_commit_to_the_set_of_undispatched_commits = () =>
			persistence.GetUndispatchedCommits()
				.FirstOrDefault(x => x.CommitId == attempt.CommitId).ShouldNotBeNull();

		It should_cause_the_stream_to_be_found_in_the_list_of_streams_to_snapshot = () =>
			persistence.GetStreamsToSnapshot(1)
				.FirstOrDefault(x => x.StreamId == streamId).ShouldNotBeNull();
	}
 */