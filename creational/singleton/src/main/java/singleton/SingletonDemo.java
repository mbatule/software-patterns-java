package singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        String query = "Some query";

        System.out.println("Usando DataBaseConnection");
        useDBConnection(DataBaseConnection.getInstance(), query);

        System.out.println();
        System.out.println("Usando ThreadSafeDataBaseConnection");
        useDBConnection(ThreadSafeDataBaseConnection.getInstance(), query);

        System.out.println();
        System.out.println("Usando EnumDataBaseConnection");
        useDBConnection(EnumDataBaseConnection.INSTANCE, query);
    }

    private static void useDBConnection(DBConnection dbConnection, String query) {
        dbConnection.connect();
        dbConnection.execute(query);
        dbConnection.close();
    }
}
