package ExceptionHandling;

import java.util.Scanner;

public class TryCatchPair { // we can use multiple try catch eith the same block of code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your character index");

        int index = sc.nextInt();
        try
        {
            int arr[] = {10, 20 , 30 , 40,50};
            int num = arr[index];
        }catch (ArrayIndexOutOfBoundsException e)
        {

            e.printStackTrace();
        }
        try
        {
            String state = " MAHARASHTRA ";
            char ch = state.charAt(index);
            System.out.println("character :" + ch);

        }catch(StringIndexOutOfBoundsException e)
        {
            e.printStackTrace();

        }
    }
}
