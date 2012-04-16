package org.es4j.eventstore.persistence.acceptance;

//using System.IO;
//using System.Reflection;

public class PersistenceFactoryScanner {

    private static final IDictionary<string, IPersistenceFactory> Factories =
			new Dictionary<string, IPersistenceFactory>();

    public PersistenceFactoryScanner() {

			if (Factories.Count > 0)
				return;

			foreach (var type in GetAssemblyFiles().SelectMany(GetTypes))
				AddFactory(type);
    }

    private static IEnumerable<String> getAssemblyFiles() {
        return Directory.GetFiles(AppDomain.CurrentDomain.BaseDirectory, "*.dll");
    }

    private static Iterable<Type> getTypes(String filename) {
        try {
				return Assembly.LoadFrom(filename).GetTypes();
			}
			catch (FileLoadException)
			{
				return new Type[] { };
			}
			catch (Exception)
			{
				return new Type[] { };
			}
    }

    private static void addFactory(Type type)
		{
			if (!typeof(IPersistenceFactory).IsAssignableFrom(type))
				return;

			if (typeof(IPersistenceFactory) == type || type.IsAbstract)
				return;

			try
			{
				var factory = (IPersistenceFactory)Activator.CreateInstance(type);
				var key = factory.GetType().Name
					.Replace("AcceptanceTest", string.Empty)
					.Replace("Factory", string.Empty);

				Factories[key] = factory;
			}
			catch
			{
				return; // no-op (added to suppress a warning)
			}
    }

    //virtual
    public IPersistenceFactory getFactory() {
        var persistenceEngine = "persistence".getSetting() ?? "MsSqlPersistence";

        try{
				return Factories[persistenceEngine];
			}
			catch (KeyNotFoundException)
			{
				var message = "The key '{0}' was not a configured persistence engine.".FormatWith(persistenceEngine);
				throw new StorageException(message);
			}
    }

    // virtual
    public int pageSize {
        get { return int.Parse("pageSize".getSetting() ?? "0"); }
    }
}
