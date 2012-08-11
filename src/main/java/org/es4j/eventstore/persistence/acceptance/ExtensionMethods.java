package org.es4j.eventstore.persistence.acceptance;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.es4j.eventstore.api.Commit;
import org.es4j.messaging.api.EventMessage;
import org.es4j.util.DateTime;
import org.es4j.util.SystemTime;


//internal static
public class ExtensionMethods {

    public static Commit buildAttempt(/*this*/ UUID streamId, DateTime now) {

        List<EventMessage> messages = Arrays.asList //new ArrayList<EventMessage>();
        (
            new EventMessage ("Test" /*Body = new SomeDomainEvent { SomeProperty = "Test" }*/ ),
            new EventMessage ("Test2" /*Body = new SomeDomainEvent { SomeProperty = "Test2" }*/ )
        );

        return new Commit(
                streamId,
                2,
                UUID.randomUUID(),
                1,
                now,
                new HashMap<String, Object>() {{
                    put("A header", "A string value");
                    put("Another header", 2);
                }},
                messages);
    }

    public static Commit buildAttempt(/*this*/ UUID streamId) {
        return ExtensionMethods.buildAttempt(streamId, SystemTime.utcNow());
    }

    public static Commit buildNextAttempt(/*this*/ Commit commit) {

        List<EventMessage> messages = Arrays.asList // new ArrayList<EventMessage> {
        (
            new EventMessage ("Another test"  /*Body = new SomeDomainEvent { SomeProperty = "Another test" }*/ ),
            new EventMessage ("Another test2" /*Body = new SomeDomainEvent { SomeProperty = "Another test2" }*/ )
        );

        return new Commit(
                commit.getStreamId(),
                commit.getStreamRevision() + 2,
                UUID.randomUUID(),
                commit.getCommitSequence() + 1,
                commit.getCommitStamp(),
                new HashMap<String, Object>(),
                messages);
    }
}
