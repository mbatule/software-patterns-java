package singleton;

import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DataBaseConnectionTest {

    @Test
    public void testSingleton() {
        DataBaseConnection conn1 = DataBaseConnection.getInstance();
        DataBaseConnection conn2 = DataBaseConnection.getInstance();

        assertSame(conn1, conn2, "The objects must be the same");
    }


    @Test
    void connect() throws Exception {
        String expectedConnectingOutput = "Connecting to database ";
        String output = SystemLambda.tapSystemOut(() -> {
            DataBaseConnection conn = DataBaseConnection.getInstance();
            conn.connect();
        });
        assertTrue(output.contains(expectedConnectingOutput), "Output should contain the expected connection string");
    }

    @Test
    void execute() throws Exception {
        String query = "SELECT 1;";
        String output = SystemLambda.tapSystemOut(() -> {
            DataBaseConnection conn = DataBaseConnection.getInstance();
            conn.connect();
            conn.execute(query);
            conn.close();
        });
        assertTrue(output.contains(query), "Output should contain the query: " + query);
    }

    @Test
    void close() throws Exception {
        String expectedClosingOutput = "Closing database connection ";
        String output = SystemLambda.tapSystemOut(() -> {
            DataBaseConnection conn = DataBaseConnection.getInstance();
            conn.connect();
            conn.close();
        });
        assertTrue(output.contains(expectedClosingOutput), "Output should contain the expected closing string");
    }
}