package org.es4j.eventstore.persistence.acceptance;

import org.es4j.dotnet.ConfigurationManager;

//using System.Configuration;


//internal static
public class ConfigurationExtensions {

    public static String getSetting(/*this*/String settingName) {
        
        String settings = getCommandLineArgument("/" + settingName + ":");
        if (settings != null) {
            return settings;
        }
        settings = System.getenv(settingName);
        if (settings != null) {
            return settings;
        }
        settings = ConfigurationManager.getAppSettings().getProperty(settingName, null);
        return settings;
    }

    private static String getCommandLineArgument(String settingName) {
        throw new UnsupportedOperationException("Not yet implemented");
        /*
        return Environment.getCommandLineArgs()
				.Where(arg => arg.StartsWith(settingName))
				.Select(arg => arg.Replace(settingName, string.Empty))
				.FirstOrDefault();
       */                                
    }
}
