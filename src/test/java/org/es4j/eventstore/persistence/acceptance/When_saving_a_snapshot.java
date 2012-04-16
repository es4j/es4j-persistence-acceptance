package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_saving_a_snapshot {

}


/*
	[Subject("Persistence")]
	public class when_saving_a_snapshot : using_the_persistence_engine
	{
		static readonly Snapshot snapshot = new Snapshot(streamId, 1, "Snapshot");
		static bool added;

		Establish context = () =>
			persistence.Commit(streamId.BuildAttempt());

		Because of = () =>
			added = persistence.AddSnapshot(snapshot);

		It should_indicate_the_snapshot_was_added = () =>
			added.ShouldBeTrue();

		It should_be_able_to_retrieve_the_snapshot = () =>
			persistence.GetSnapshot(streamId, snapshot.StreamRevision).ShouldNotBeNull();
	}
 */