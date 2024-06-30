package builder;

public class ProductionConfigBuilder extends BaseConfigBuilder {
    public ProductionConfigBuilder() {
        this.maxConnectionPoolSize = 20;
        this.enableLogging = false;
        this.logLevel = "INFO";
        this.isProduction = true;
    }

    @Override
    public ApplicationConfig build() {
        return new ApplicationConfig(databaseUrl, databaseUsername, databasePassword,
                maxConnectionPoolSize, enableLogging, logLevel, isProduction);
    }
}