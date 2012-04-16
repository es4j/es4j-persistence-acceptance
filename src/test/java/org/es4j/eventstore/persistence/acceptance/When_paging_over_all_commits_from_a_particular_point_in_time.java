package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_paging_over_all_commits_from_a_particular_point_in_time {

}


/*
	[Subject("Persistence")]
	public class when_paging_over_all_commits_from_a_particular_point_in_time : using_the_persistence_engine
	{
		static readonly int ConfiguredPageSize = FactoryScanner.PageSize;
		static readonly int CommitsToPersist = ConfiguredPageSize + 1;
		static readonly DateTime start = SystemTime.UtcNow;
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
			persistence.GetFrom(start).ToList().ForEach(x => loaded.Add(x.CommitId));

		It should_load_the_same_number_of_commits_which_have_been_persisted = () =>
			loaded.Count.ShouldBeGreaterThanOrEqualTo(committed.Count); // >= because items may be loaded from other tests.

		It should_load_the_same_commits_which_have_been_persisted = () =>
			committed.All(x => loaded.Contains(x)).ShouldBeTrue(); // all commits should be found in loaded collection
	}
 */