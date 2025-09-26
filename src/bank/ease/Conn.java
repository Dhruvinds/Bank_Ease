package bank.ease;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // 1. Register the Driver
            
            // 2. Create Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Dhruvin@6103");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
