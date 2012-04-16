package org.es4j.eventstore.persistence.acceptance;

//using System.Configuration;

//internal static
public class ConfigurationExtensions {

    public static String getSetting(/*this*/ String settingName) {
        return GetCommandLineArgument("/" + settingName + ":")
				?? Environment.GetEnvironmentVariable(settingName)
				?? ConfigurationManager.AppSettings[settingName];
    }

    private static String getCommandLineArgument(String settingName) {
        return Environment.GetCommandLineArgs()
				.Where(arg => arg.StartsWith(settingName))
				.Select(arg => arg.Replace(settingName, string.Empty))
				.FirstOrDefault();
    }
}
