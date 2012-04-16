package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_retrieving_a_snapshot {

}


/*
	[Subject("Persistence")]
	public class when_retrieving_a_snapshot : using_the_persistence_engine
	{
		static readonly Snapshot tooFarBack = new Snapshot(streamId, 1, string.Empty);
		static readonly Snapshot correct = new Snapshot(streamId, 3, "Snapshot");
		static readonly Snapshot tooFarForward = new Snapshot(streamId, 5, string.Empty);
		static Snapshot snapshot;

		Establish context = () =>
		{
			var commit1 = streamId.BuildAttempt();
			var commit2 = commit1.BuildNextAttempt();
			var commit3 = commit2.BuildNextAttempt();
			persistence.Commit(commit1); // rev 1-2
			persistence.Commit(commit2); // rev 3-4
			persistence.Commit(commit3); // rev 5-6

			persistence.AddSnapshot(tooFarBack);
			persistence.AddSnapshot(correct);
			persistence.AddSnapshot(tooFarForward);
		};

		Because of = () =>
			snapshot = persistence.GetSnapshot(streamId, tooFarForward.StreamRevision - 1);

		It should_load_the_most_recent_prior_snapshot = () =>
			snapshot.StreamRevision.ShouldEqual(correct.StreamRevision);

		It should_have_the_correct_snapshot_payload = () =>
			snapshot.Payload.ShouldEqual(correct.Payload);
	}
 */