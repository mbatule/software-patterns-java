package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        DataBaseConnection conn = DataBaseConnection.getInstance();
        conn.connect();
        String query = "Some query";
        conn.execute(query);
        conn.close();
    }
}
