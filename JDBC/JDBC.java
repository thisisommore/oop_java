package JDBC;

import java.sql.*;

public class JDBC {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/students";
            String user = "om";
            String pass = "omvit@123";
            Connection sqlConnection = DriverManager.getConnection(url, user, pass);
            sqlConnection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
