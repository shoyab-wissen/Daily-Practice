package Java_Jdbc.Practice_30012025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres",
                        "tiger");
                // This is default value
                Statement stmt = conn.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
            while (rs.previous()) {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
            rs.absolute(3);
            {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
            rs.relative(-2);
            {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
            rs.last();

            {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
            rs.first();
            {
                System.out.println("Name: " + rs.getString(1));
                System.out.println("Age: " + rs.getInt(2));
            }
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
