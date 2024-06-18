package singleton;

public interface DBConnection {

    void connect();
    void execute(String query);
    void close();

}
