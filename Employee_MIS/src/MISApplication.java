import com.pk.controller.EmployeeController;
import com.pk.dto.request.EmployeeRequestDTO;

import java.sql.SQLException;
import java.util.Scanner;


public class MISApplication {

    public static void main(String[] args) {

        String choice = "";
        Scanner sn = new Scanner(System.in);
        EmployeeController controller = null;

        controller = new EmployeeController();

        do {
            System.out.println("Welcome to Employee Management system");
            System.out.println("1. Add Employee");
            System.out.println("2. Display all Employee");
            System.out.println("3.Update Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Find Employee");
            System.out.println("6.Custom Employee operation");
            System.out.println("________");
            System.out.println("Enter The choice");
            int ch = sn.nextInt();
            switch (ch) {
                case 1:
                    controller.addEmployee();
                    break;
                case 2:
                    controller.display();
                    break;
                case 3:
                    controller.update();
                    break;
                case 4:
                    controller.deleteEmployee();
                            break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Request");
                    break;
            }
            System.out.println("Do u want to continue..(yes/YES)");
            choice = sn.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thank You....!");
    }

}