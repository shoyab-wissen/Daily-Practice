package Java_Jdbc.Practice_30012025;

import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetadataDemo {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres",
                        "tiger");
                Statement stmt = conn.createStatement();) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of the table");
            String table = br.readLine();
            ResultSet rs = stmt.executeQuery("select * from " + table);
            ResultSetMetaData metadata = rs.getMetaData();
            int count = metadata.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= count; i++) {
                    System.out.println(metadata.getColumnName(i) + " : " + rs.getString(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
