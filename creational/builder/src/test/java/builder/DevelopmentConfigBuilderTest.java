package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevelopmentConfigBuilderTest {

    @Test
    void build() {

        String dataBaseUrl = "jdbc:mysql://localhost:3306/mydb";
        String user = "myuser";
        String password = "mypassword";
        int maxConnectionPoolSize = 10;
        String logLevel = "DEBUG";

        ConfigBuilder builder = new DevelopmentConfigBuilder();
        ApplicationConfig config = builder
                .withDatabaseUrl(dataBaseUrl)
                .withDatabaseUsername(user)
                .withDatabasePassword(password)
                .withMaxConnectionPoolSize(maxConnectionPoolSize)
                .withLoggingEnabled(true)
                .withLogLevel(logLevel)
                .forProduction(false)
                .build();

        assertEquals(dataBaseUrl, config.getDatabaseUrl(), "La URL debe coincidir con " + dataBaseUrl);
        assertEquals(user, config.getDatabaseUsername(), "El usuario debe coincidir con " + user);
        assertEquals(password, config.getDatabasePassword(), "La contraseña debe coincidir con " + password);
        assertEquals(maxConnectionPoolSize, config.getMaxConnectionPoolSize(), "El usuario debe coincidir con " + user);
        assertTrue(config.isLoggingEnabled(), "isLoggingEnabled debe ser true ");
        assertEquals(logLevel, config.getLogLevel(), "El usuario debe coincidir con " + user);
        assertFalse(config.isProduction(), "isProduction debe ser false ");

    }
}