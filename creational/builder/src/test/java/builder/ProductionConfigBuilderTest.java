package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionConfigBuilderTest {

    @Test
    public void build() {

        String dataBaseUrl = "jdbc:mysql://prod-db.example.com:3306/mydb";
        String user = "prod-user";
        String password = "prod-password";
        int maxConnectionPoolSize = 20;
        String logLevel = "INFO";

        ConfigBuilder builder = new ProductionConfigBuilder();
        ApplicationConfig config = builder
                .withDatabaseUrl(dataBaseUrl)
                .withDatabaseUsername(user)
                .withDatabasePassword(password)
                .withMaxConnectionPoolSize(maxConnectionPoolSize)
                .withLoggingEnabled(false)
                .withLogLevel(logLevel)
                .forProduction(true)
                .build();

        assertEquals(dataBaseUrl, config.getDatabaseUrl(), "La URL debe coincidir con " + dataBaseUrl);
        assertEquals(user, config.getDatabaseUsername(), "El usuario debe coincidir con " + user);
        assertEquals(password, config.getDatabasePassword(), "La contraseña debe coincidir con " + password);
        assertEquals(maxConnectionPoolSize, config.getMaxConnectionPoolSize(), "El usuario debe coincidir con " + user);
        assertFalse(config.isLoggingEnabled(), "isLoggingEnabled debe ser false ");
        assertEquals(logLevel, config.getLogLevel(), "El usuario debe coincidir con " + user);
        assertTrue(config.isProduction(), "isProduction debe ser true ");
    }

}