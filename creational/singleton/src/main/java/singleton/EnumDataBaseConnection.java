package singleton;

public enum EnumDataBaseConnection {

    INSTANCE;

    private EnumDataBaseConnection() {
    }

    public void connect() {
        System.out.println("Connecting to database ");
    }

    public void execute(String query) {
        System.out.printf("Executing query: %s%n", query);
    }

    public void close() {
        System.out.println("Closing database connection ");
    }

}
