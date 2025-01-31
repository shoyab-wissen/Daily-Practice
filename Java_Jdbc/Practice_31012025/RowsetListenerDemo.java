package Java_Jdbc.Practice_31012025;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowsetListenerDemo {
    public static void main(String[] args) throws SQLException {
        RowSetFactory rsf = RowSetProvider.newFactory();
        JdbcRowSet rs = rsf.createJdbcRowSet();
        rs.setUrl("jdbc:postgresql://localhost:5432/empdb");
        rs.setUsername("postgres");
        rs.setPassword("tiger");
        rs.addRowSetListener(new EmpListener());
        rs.addRowSetListener(new EmpListener2());
        rs.setCommand("select * from employee");
        rs.execute();
        ResultSetMetaData metadata = rs.getMetaData();
        int colCount = metadata.getColumnCount();
        while (rs.next()) {
            for (int i = 0; i < colCount; i++) {
                System.out.println(metadata.getColumnName(i + 1) + " : " + rs.getString(i + 1));
            }
        }
    }
}

class EmpListener implements RowSetListener {

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("--------CURSOR MOVED------------");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("--------ROW CHANGED------------");

    }

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("--------ROWSET CHANGED------------");

    }

}

class EmpListener2 implements RowSetListener {

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("........CURSOR MOVED............");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("........ROW CHANGED............");

    }

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("........ROWSET CHANGED............");

    }

}