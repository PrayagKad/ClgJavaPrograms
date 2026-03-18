package Day2;

import java.util.Scanner;

public class PremachaChaha {

    public static void main(String[] args) {

        ramukaka ramu = new ramukaka();

        Scanner sc = new Scanner(System.in);

        String choice = "";
        do {
            System.out.println("enter choice 1. milktea , 2. blacktea 3.coffee");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ramu.getOrder("Day2.BlackTea");
                    break;
                case 2 :
                    ramu.getOrder("Day2.milktea");
                    break;
                case 3 :
                    ramu.getOrder("Day2.Coffee");
                    break;
                default:
                    System.out.println("this order is not present rightnow!" );
                    break;
            }

            System.out.println("to continue enter yes ");
            choice = sc.next();

        }while
        (choice.equals("yes"));
    }
}
