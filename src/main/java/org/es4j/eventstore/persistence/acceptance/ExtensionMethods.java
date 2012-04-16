
import java.util.ArrayList;
import java.util.List;


//internal static
public class ExtensionMethods {

    public static Commit buildAttempt(/*this*/ Guid streamId, DateTime now) {

        List<EventMessage> messages = new ArrayList<EventMessage> {
            new EventMessage { Body = new SomeDomainEvent { SomeProperty = "Test" } },
            new EventMessage { Body = new SomeDomainEvent { SomeProperty = "Test2" } },
        };

        return new Commit(
				streamId,
				2,
				Guid.NewGuid(),
				1,
				now,
				new Dictionary<string, object> { { "A header", "A string value" }, { "Another header", 2 } },
				messages);
    }

    public static Commit BuildAttempt(/*this*/ Guid streamId) {
        return streamId.BuildAttempt(SystemTime.UtcNow);
    }

    public static Commit BuildNextAttempt(/*this*/ Commit commit) {

        List<EventMessage> messages = new ArrayList<EventMessage> {
            new EventMessage { Body = new SomeDomainEvent { SomeProperty = "Another test" } },
            new EventMessage { Body = new SomeDomainEvent { SomeProperty = "Another test2" } },
        };

        return new Commit(
				commit.StreamId,
				commit.StreamRevision + 2,
				Guid.NewGuid(),
				commit.CommitSequence + 1,
				commit.CommitStamp,
				new Dictionary<string, object>(),
				messages);
    }
}

