package builder;

public class ApplicationConfig {
    private final String databaseUrl;
    private final String databaseUsername;
    private final String databasePassword;
    private final int maxConnectionPoolSize;
    private final boolean enableLogging;
    private final String logLevel;

    private final boolean isProduction;

    public ApplicationConfig(String databaseUrl, String databaseUsername, String databasePassword,
                             int maxConnectionPoolSize, boolean enableLogging, String logLevel,
                             boolean isProduction) {
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
        this.maxConnectionPoolSize = maxConnectionPoolSize;
        this.enableLogging = enableLogging;
        this.logLevel = logLevel;
        this.isProduction = isProduction;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public int getMaxConnectionPoolSize() {
        return maxConnectionPoolSize;
    }

    public boolean isLoggingEnabled() {
        return enableLogging;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public boolean isProduction() {
        return isProduction;
    }

}
