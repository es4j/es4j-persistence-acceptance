package org.es4j.eventstore.persistence.acceptance;

import org.es4j.exceptions.ObjectDisposedException;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;


//[Subject("Persistence")]
public class When_invoking_after_disposal extends Using_the_persistence_engine {

    static ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {

        // Given
        thrown.expect(ObjectDisposedException.class);

        // When
        persistence.dispose();
    }

    @Test
    public void should_throw_an_ObjectDisposedException() {

        // Then
        // Catch.Exception(() => persistence.Commit(streamId.BuildAttempt())).ShouldBeOfType<ObjectDisposedException>();
    }
}


/*
	[Subject("Persistence")]
	public class when_invoking_after_disposal : using_the_persistence_engine
	{
		static Exception thrown;

		Establish context = () =>
			persistence.Dispose();

		It should_throw_an_ObjectDisposedException = () =>
			Catch.Exception(() => persistence.Commit(streamId.BuildAttempt())).ShouldBeOfType<ObjectDisposedException>();
	}
*/
