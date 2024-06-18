package singleton;

public class DataBaseConnection implements DBConnection {
    private static DataBaseConnection instance = null;

    private DataBaseConnection() {
    }

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    /**
     * Simula la conexión a la BD
     */
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