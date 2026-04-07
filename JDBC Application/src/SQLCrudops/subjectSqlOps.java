package SQLCrudops;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class subjectSqlOps {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zeal","root","");
        Statement stmt = con.createStatement();
       /*
        int row =   stmt.executeUpdate("insert into subject(id,name , marks , oral)values (102,'ramukaka', 300000, true)");
        System.out.println(row);

        */


        ResultSet rs = stmt.executeQuery("select * from subject");
        List<subjectModel> subs = new ArrayList<>();

        while(rs.next())
        {
            subs.add(new subjectModel(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getBoolean(4)));
        }

        for(subjectModel sub : subs  )
        {
            System.out.println(sub);
        }

       int  row = stmt.executeUpdate("delete from subject where id = 101");
        System.out.println(row);


        row= stmt.executeUpdate("update subject set marks = 5000 where id = 102");
        System.out.println(row);


    }
}
