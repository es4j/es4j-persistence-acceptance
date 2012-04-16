package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_committing_more_events_than_the_configured_page_size {

}


/*
	[Subject("Persistence")]
	public class when_committing_more_events_than_the_configured_page_size : using_the_persistence_engine
	{
		static readonly int ConfiguredPageSize = FactoryScanner.PageSize;
		static readonly int CommitsToPersist = ConfiguredPageSize + 1;
		static readonly HashSet<Guid> committed = new HashSet<Guid>();
		static readonly ICollection<Guid> loaded = new LinkedList<Guid>();
		static Commit attempt = streamId.BuildAttempt();

		Establish context = () =>
		{
			var attempt = streamId.BuildAttempt();
			for (var i = 0; i < CommitsToPersist; i++)
			{
				persistence.Commit(attempt);
				committed.Add(attempt.CommitId);
				attempt = attempt.BuildNextAttempt();
			}
		};

		Because of = () =>
			persistence.GetFrom(streamId, 0, int.MaxValue).ToList().ForEach(x => loaded.Add(x.CommitId));

		It should_load_the_same_number_of_commits_which_have_been_persisted = () =>
			loaded.Count.ShouldEqual(committed.Count);

		It should_load_the_same_commits_which_have_been_persisted = () =>
			committed.All(x => loaded.Contains(x)).ShouldBeTrue(); // all commits should be found in loaded collection
	}
 */
