package singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        String query = "Some query";

        System.out.println("Usando DataBaseConnection");
        DataBaseConnection dataBaseConnection = DataBaseConnection.getInstance();
        dataBaseConnection.connect();
        dataBaseConnection.execute(query);
        dataBaseConnection.close();
        System.out.println();

        System.out.println("Usando ThreadSafeDataBaseConnection");
        ThreadSafeDataBaseConnection threadSafeDataBaseConnection = ThreadSafeDataBaseConnection.getInstance();
        threadSafeDataBaseConnection.connect();
        threadSafeDataBaseConnection.execute(query);
        threadSafeDataBaseConnection.close();
        System.out.println();

        System.out.println("Usando EnumDataBaseConnection");
        EnumDataBaseConnection enumDataBaseConnection = EnumDataBaseConnection.INSTANCE;
        enumDataBaseConnection.connect();
        enumDataBaseConnection.execute(query);
        enumDataBaseConnection.close();
    }
}
