package org.es4j.eventstore.persistence.acceptance;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.es4j.eventstore.api.persistence.IPersistenceFactory;

//using System.IO;
//using System.Reflection;

public class PersistenceFactoryScanner {

    private static final Map<String, IPersistenceFactory> Factories =
            new HashMap<String, IPersistenceFactory>();

    public PersistenceFactoryScanner() {

        if (!Factories.isEmpty()) {
            return;
        }

        if(true) throw new UnsupportedOperationException("Not yet implemented");
        //foreach (Type type in GetAssemblyFiles().SelectMany(GetTypes)) {
        //    this.addFactory(type);
        //}
    }

    private static Iterable<String> getAssemblyFiles() {
        throw new UnsupportedOperationException("Not yet implemented");
        //return Directory.GetFiles(AppDomain.CurrentDomain.BaseDirectory, "*.dll");
    }

    private static Iterable<Class<?>> getTypes(String filename) {
        throw new UnsupportedOperationException("Not yet implemented");
        /*
        try {
            return Assembly.loadFrom(filename).getTypes();
        } 
        catch (FileLoadException ex) {
            return new LinkedList<Type>{};
        } 
        catch (Exception ex) {
            return new Type[]{};
        }
        */
    }

    private static void addFactory(Type type) {
        throw new UnsupportedOperationException("Not yet implemented");
        /*
        if (!IPersistenceFactory.class.isAssignableFrom(type))
            return;

        if (IPersistenceFactory.class == type || type.isAbstract())
            return;

        try
        {
            IPersistenceFactory factory = (IPersistenceFactory)Activator.CreateInstance(type);
            String key = factory.GetType().Name
                        .Replace("AcceptanceTest", string.Empty)
                        .Replace("Factory", string.Empty);

            Factories[key] = factory;
        }
        catch
        {
            return; // no-op (added to suppress a warning)
        }
        */
    }

    //virtual
    public IPersistenceFactory getFactory() {
        throw new UnsupportedOperationException("Not yet implemented");
        /*
        var persistenceEngine = "persistence".getSetting() ?? "MsSqlPersistence";

        try{
            return Factories[persistenceEngine];
        }
        catch (KeyNotFoundException) {
				var message = "The key '{0}' was not a configured persistence engine.".FormatWith(persistenceEngine);
				throw new StorageException(message);
			}
    */
    }

    // virtual
    public int getPageSize() {
        throw new UnsupportedOperationException("Not yet implemented");
        //return int.Parse("pageSize".getSetting() ?? "0");
    }
}
