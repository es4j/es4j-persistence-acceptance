package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_adding_a_commit_after_a_snapshot {

}


/*
	[Subject("Persistence")]
	public class when_adding_a_commit_after_a_snapshot : using_the_persistence_engine
	{
		const int WithinThreshold = 2;
		const int OverThreshold = 3;
		const string SnapshotData = "snapshot";
		static readonly Commit oldest = streamId.BuildAttempt();
		static readonly Commit oldest2 = oldest.BuildNextAttempt();
		static readonly Commit newest = oldest2.BuildNextAttempt();

		Establish context = () =>
		{
			persistence.Commit(oldest);
			persistence.Commit(oldest2);
			persistence.AddSnapshot(new Snapshot(streamId, oldest2.StreamRevision, SnapshotData));
		};

		Because of = () =>
			persistence.Commit(newest);

		// Because Raven and Mongo update the stream head asynchronously, occasionally will fail this test
		It should_find_the_stream_in_the_set_of_streams_to_be_snapshot_when_within_the_threshold = () =>
			persistence.GetStreamsToSnapshot(WithinThreshold)
				.FirstOrDefault(x => x.StreamId == streamId).ShouldNotBeNull();

		It should_not_find_the_stream_in_the_set_of_streams_to_be_snapshot_when_over_the_threshold = () =>
			persistence.GetStreamsToSnapshot(OverThreshold)
				.Any(x => x.StreamId == streamId).ShouldBeFalse();
	}
 */