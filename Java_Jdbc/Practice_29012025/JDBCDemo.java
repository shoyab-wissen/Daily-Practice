package Java_Jdbc.Practice_29012025;

import java.sql.Statement;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres",
                        "tiger");
                Statement stmt = conn.createStatement();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // Class.forName("org.postgres.Driver");

            // int affected = stmt.executeUpdate("insert into emp values('Sanjana Panda',
            // 22)");
            System.out.print("Enter the name: ");
            String name = br.readLine();
            System.out.print("Enter the age: ");
            int age = Integer.parseInt(br.readLine());
            PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?)");
            ps.setString(1, name);
            ps.setInt(2, age);
            boolean affected = ps.execute();
            System.out.println(affected + " row(s) affected");
            ResultSet rs = stmt.executeQuery("select * from emp");
            System.out.println("NAME\t\tAGE");
            while (rs.next()) {
                System.out.println(rs.getString("Name") + "\t\t" + rs.getInt("Age"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}