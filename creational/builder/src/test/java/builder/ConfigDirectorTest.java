package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigDirectorTest {

    @Test
    void constructConfig() {
        ConfigBuilder builder = new DevelopmentConfigBuilder();
        ConfigDirector director = new ConfigDirector(builder);
        ApplicationConfig config = director.constructConfig();

        assertEquals("jdbc:mysql://localhost:3306/mydb", config.getDatabaseUrl());
        assertEquals("my-user", config.getDatabaseUsername());
        assertEquals("my-password", config.getDatabasePassword());
        assertEquals(10, config.getMaxConnectionPoolSize());
        assertTrue(config.isLoggingEnabled());
        assertEquals("DEBUG", config.getLogLevel());
        assertFalse(config.isProduction());
    }
}