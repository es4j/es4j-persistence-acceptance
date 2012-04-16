package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_reading_from_a_given_revision {

}


/*
	[Subject("Persistence")]
	public class when_reading_from_a_given_revision : using_the_persistence_engine
	{
		const int LoadFromCommitContainingRevision = 3;
		const int UpToCommitWithContainingRevision = 5;
		static readonly Commit oldest = streamId.BuildAttempt(); // 2 events, revision 1-2
		static readonly Commit oldest2 = oldest.BuildNextAttempt(); // 2 events, revision 3-4
		static readonly Commit oldest3 = oldest2.BuildNextAttempt(); // 2 events, revision 5-6
		static readonly Commit newest = oldest3.BuildNextAttempt(); // 2 events, revision 7-8
		static Commit[] committed;

		Establish context = () =>
		{
			persistence.Commit(oldest);
			persistence.Commit(oldest2);
			persistence.Commit(oldest3);
			persistence.Commit(newest);
		};

		Because of = () =>
			committed = persistence.GetFrom(streamId, LoadFromCommitContainingRevision, UpToCommitWithContainingRevision).ToArray();

		It should_start_from_the_commit_which_contains_the_min_stream_revision_specified = () =>
			committed.First().CommitId.ShouldEqual(oldest2.CommitId); // contains revision 3

		It should_read_up_to_the_commit_which_contains_the_max_stream_revision_specified = () =>
			committed.Last().CommitId.ShouldEqual(oldest3.CommitId); // contains revision 5
	}
 */