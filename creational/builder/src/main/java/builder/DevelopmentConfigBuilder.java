package builder;

public class DevelopmentConfigBuilder extends BaseConfigBuilder {
    public DevelopmentConfigBuilder() {
        this.maxConnectionPoolSize = 10;
        this.enableLogging = true;
        this.logLevel = "DEBUG";
        this.isProduction = false;
    }

    @Override
    public ApplicationConfig build() {
        return new ApplicationConfig(databaseUrl, databaseUsername, databasePassword,
                maxConnectionPoolSize, enableLogging, logLevel, isProduction);
    }
}