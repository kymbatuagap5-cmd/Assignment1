package fitness;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            System.out.println("Connected to database!");
        } else {
            System.out.println("Connection failed.");
        }
    }
}
