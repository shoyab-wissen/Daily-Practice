package Java_Jdbc.Practice_29012025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres",
                        "tiger");
                Statement stmt = conn.createStatement();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            stmt.addBatch("insert into emp values('Aman', 22)");
            stmt.addBatch("insert into emp values('Amar', 22)");
            stmt.addBatch("insert into emp values('Akbar', 22)");
            stmt.addBatch("insert into emp values('Anthony', 22)");
            stmt.addBatch("insert into emp values('Birju', 22)");
            stmt.addBatch("insert into emp values('Bhavandar Bihari', 22)");
            int[] affected = stmt.executeBatch();
            for (int i = 0; i < affected.length; i++) {
                System.out.printf("%d row(s) affected in %d query\n", affected[i], i + 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
