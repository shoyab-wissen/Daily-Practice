package Java_Jdbc.Practice_29012025;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres",
                        "tiger");
                PreparedStatement pstmt = conn.prepareStatement("insert into employee values(?, ?)");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            conn.setAutoCommit(false);
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter Your Name");
                String name = br.readLine();
                System.out.println("Enter Age:");
                int age = Integer.parseInt(br.readLine());
                pstmt.setString(1, name);
                pstmt.setInt(2, age);
                pstmt.execute();
                if (i == 5)
                    conn.rollback();
                if (i == 10)
                    conn.commit();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
