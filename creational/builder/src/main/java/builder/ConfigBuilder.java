package builder;

public interface ConfigBuilder {
    ConfigBuilder withDatabaseUrl(String url);
    ConfigBuilder withDatabaseUsername(String username);
    ConfigBuilder withDatabasePassword(String password);
    ConfigBuilder withMaxConnectionPoolSize(int size);
    ConfigBuilder withLoggingEnabled(boolean enabled);
    ConfigBuilder withLogLevel(String level);
    ConfigBuilder forProduction(boolean isProduction);
    ApplicationConfig build();
}
