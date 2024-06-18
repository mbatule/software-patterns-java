package singleton;

public class ThreadSafeDataBaseConnection implements DBConnection {
    private static ThreadSafeDataBaseConnection instance = null;

    private ThreadSafeDataBaseConnection() {
    }

    public static ThreadSafeDataBaseConnection getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeDataBaseConnection.class) {
                if (instance == null) {
                    instance = new ThreadSafeDataBaseConnection();
                }
            }
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