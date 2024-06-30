package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        ConfigBuilder builder = getConfigBuilder(args);
        ConfigDirector director = new ConfigDirector(builder);
        ApplicationConfig config = director.constructConfig();
        printConfig(config);
    }

    private static ConfigBuilder getConfigBuilder(String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("production")) {
            return new ProductionConfigBuilder();
        } else {
            return new DevelopmentConfigBuilder();
        }
    }

    private static void printConfig(ApplicationConfig config) {
        System.out.println("Database URL: " + config.getDatabaseUrl());
        System.out.println("Database Username: " + config.getDatabaseUsername());
        System.out.println("Database Password: " + config.getDatabasePassword());
        System.out.println("Max Connection Pool Size: " + config.getMaxConnectionPoolSize());
        System.out.println("Logging Enabled: " + config.isLoggingEnabled());
        System.out.println("Log Level: " + config.getLogLevel());
        System.out.println("Is Production: " + config.isProduction());
    }
}

