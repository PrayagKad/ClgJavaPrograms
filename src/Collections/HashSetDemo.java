package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 3 ; i++)
        {
            System.out.println("enter element to add");
            int j = sc.nextInt();
            hs.add(j);
        }

        System.out.println(hs);
    }
}
