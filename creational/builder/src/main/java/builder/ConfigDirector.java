package builder;

public class ConfigDirector {
    private final ConfigBuilder builder;

    public ConfigDirector(ConfigBuilder builder) {
        this.builder = builder;
    }

    public ApplicationConfig constructConfig() {
        return builder.withDatabaseUrl("jdbc:mysql://localhost:3306/mydb")
                .withDatabaseUsername("my-user")
                .withDatabasePassword("my-password")
                .build();
    }

}