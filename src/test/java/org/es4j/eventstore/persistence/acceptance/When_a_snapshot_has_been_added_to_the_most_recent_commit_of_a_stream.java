package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_a_snapshot_has_been_added_to_the_most_recent_commit_of_a_stream {

}

/*
	[Subject("Persistence")]
	public class when_a_snapshot_has_been_added_to_the_most_recent_commit_of_a_stream : using_the_persistence_engine
	{
		const string SnapshotData = "snapshot";
		static readonly Commit oldest = streamId.BuildAttempt();
		static readonly Commit oldest2 = oldest.BuildNextAttempt();
		static readonly Commit newest = oldest2.BuildNextAttempt();

		Establish context = () =>
		{
			persistence.Commit(oldest);
			persistence.Commit(oldest2);
			persistence.Commit(newest);
		};

		Because of = () =>
			persistence.AddSnapshot(new Snapshot(streamId, newest.StreamRevision, SnapshotData));

		It should_no_longer_find_the_stream_in_the_set_of_streams_to_be_snapshot = () =>
			persistence.GetStreamsToSnapshot(1).Any(x => x.StreamId == streamId).ShouldBeFalse();
	}
*/