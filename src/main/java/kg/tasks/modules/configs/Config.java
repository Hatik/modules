package kg.tasks.modules.configs;

public class Config {
    static String apiKey = "BEENeA23zW6sh08JBEAMEvcZYxKSsHJo";
    static String language = "en-us";
    static boolean details = false;
    static boolean metric = true;

    public static String getApiKey() {
        return apiKey;
    }

    public static String getLanguage() {
        return language;
    }

    public static boolean isDetails() {
        return details;
    }
    public static String getIsDetailsString() {
        return booleanToString(details);
    }
    public static String getIsMeticString() {
        return booleanToString(metric);
    }

    public static boolean isMetric() {
        return metric;
    }

    public static String booleanToString(boolean item){
        return item ? "true" : "false";
    }
}
