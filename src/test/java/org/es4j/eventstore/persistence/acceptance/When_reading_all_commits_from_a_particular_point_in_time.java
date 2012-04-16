package org.es4j.eventstore.persistence.acceptance;

/**
 *
 * @author Esfand
 */
public class When_reading_all_commits_from_a_particular_point_in_time {

}


/*
	[Subject("Persistence")]
	public class when_reading_all_commits_from_a_particular_point_in_time : using_the_persistence_engine
	{
		static readonly DateTime now = SystemTime.UtcNow.AddYears(1);
		static readonly Commit first = streamId.BuildAttempt(now.AddSeconds(1));
		static readonly Commit second = first.BuildNextAttempt();
		static readonly Commit third = second.BuildNextAttempt();
		static readonly Commit fourth = third.BuildNextAttempt();
		static Commit[] committed;

		Establish context = () =>
		{
			persistence.Commit(first);
			persistence.Commit(second);
			persistence.Commit(third);
			persistence.Commit(fourth);
		};

		Because of = () =>
			committed = persistence.GetFrom(now).ToArray();

		It should_return_all_commits_on_or_after_the_point_in_time_specified = () =>
			committed.Length.ShouldEqual(4);
	}
 */