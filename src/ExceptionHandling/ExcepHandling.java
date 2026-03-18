package ExceptionHandling;

public class ExcepHandling {

    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println(c);
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
         System.err.println(ae.getMessage());
        }
        catch (NumberFormatException ne)
        {
            System.err.println(ne);
        }
       catch (ArithmeticException ae)
       {
           ae.printStackTrace();
       }
    }
}
