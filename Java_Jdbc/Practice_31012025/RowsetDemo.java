package Java_Jdbc.Practice_31012025;

import java.net.URI;
import java.net.URLEncoder;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowsetDemo {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet rs = rsf.createJdbcRowSet();
        rs.setUrl("jdbc:postgresql://localhost:5432/empdb");
        rs.setUsername("postgres");
        rs.setPassword("tiger");

        rs.setCommand("select * from employee");
        rs.execute();
        ResultSetMetaData metadata = rs.getMetaData();
        int colCount = metadata.getColumnCount();
        while (rs.next()) {
            System.out.println("----------------------");
            for (int i = 0; i < colCount; i++) {
                System.out.println(metadata.getColumnName(i + 1) + " : " + rs.getString(i + 1));
            }
            System.out.println("----------------------");
        }
    }
}
