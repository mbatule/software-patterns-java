package builder;

public abstract class BaseConfigBuilder implements ConfigBuilder {
    protected String databaseUrl;
    protected String databaseUsername;
    protected String databasePassword;
    protected int maxConnectionPoolSize;
    protected boolean enableLogging;
    protected String logLevel;
    protected boolean isProduction;

    @Override
    public ConfigBuilder withDatabaseUrl(String url) {
        this.databaseUrl = url;
        return this;
    }

    @Override
    public ConfigBuilder withDatabaseUsername(String username) {
        this.databaseUsername = username;
        return this;
    }

    @Override
    public ConfigBuilder withDatabasePassword(String password) {
        this.databasePassword = password;
        return this;
    }

    @Override
    public ConfigBuilder withMaxConnectionPoolSize(int size) {
        this.maxConnectionPoolSize = size;
        return this;
    }

    @Override
    public ConfigBuilder withLoggingEnabled(boolean enabled) {
        this.enableLogging = enabled;
        return this;
    }

    @Override
    public ConfigBuilder withLogLevel(String level) {
        this.logLevel = level;
        return this;
    }

    @Override
    public ConfigBuilder forProduction(boolean isProduction) {
        this.isProduction = isProduction;
        return this;
    }
}