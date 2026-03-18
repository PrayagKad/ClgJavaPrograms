import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLOperation {

    public static void main(String[] args) {
        // register Driver
        try {
            // register driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded successfully");

            // connect the driver
            Connection connectDriver = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            System.out.println(" Connection successful");

            // create statement object
            Statement stmt = connectDriver.createStatement();
            System.out.println(" statement object created successfully");

            //new query
            String query = "create database zeal";
            stmt.execute(query); // return true if statement executed
            System.out.println("database created successfully");

        }
        catch (Exception e)
        {

            e.printStackTrace();
        }
    }
}
