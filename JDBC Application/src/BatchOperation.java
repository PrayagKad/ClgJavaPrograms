import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOperation {

    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zeal","root","");
            Statement stmt = con.createStatement();


            con.setAutoCommit(false); // if anything in batch does not execute, whole batch doesn't execute when false

          /// batch
            stmt.addBatch("insert into employee(id, name , salary , department )values(104,'kunal',34000,'dev')");
            stmt.addBatch("insert into employee(id, name , salary , department )values(105,'rahul',35000,'hr')");
            stmt.addBatch("insert into employee(id, name , salary , department )values(106,'ramu',3600,'kamgar')");
            stmt.addBatch("update employee set salary = 1000 where id = 104");

            int[] rows = stmt.executeBatch();
            System.out.println(rows.length);
            con.commit();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
