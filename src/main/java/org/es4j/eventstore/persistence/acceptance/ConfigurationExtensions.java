package org.es4j.eventstore.persistence.acceptance;

//using System.Configuration;

import org.es4j.dotnet.ConfigurationManager;


//internal static
public class ConfigurationExtensions {

    public static String getSetting(/*this*/ String settingName) {
        String settings = getCommandLineArgument("/" + settingName + ":");
        if(settings!=null)
            return settings;
        settings = System.getenv(settingName);
        if(settings!=null)
            return settings;
        settings = ConfigurationManager.getAppSettings().get(settingName);
        return settings;
    }

    private static String getCommandLineArgument(String settingName) {
        return Environment.getCommandLineArgs()
				.Where(arg => arg.StartsWith(settingName))
				.Select(arg => arg.Replace(settingName, string.Empty))
				.FirstOrDefault();
    }
}
