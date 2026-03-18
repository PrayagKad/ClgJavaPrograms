package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(100);
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar);
        ar.add(2,900);
        System.out.println(ar);
        ar.addFirst(8000);
        ar.addLast(300);
        System.out.println(ar);
        Boolean check = ar.contains(100);
        System.out.println();

        ar.remove(2);

        List l = ar.subList(3,5);
        System.out.println(l);

        ListIterator<Integer> li = ar.listIterator(); // only works on list

        while(li.hasNext()) // forward iteration
        {
            System.out.println(li.next());
        }

        System.out.println("-----------------------------");

        while(li.hasPrevious()) // backward oteration of list
        {
            System.out.println(li.previous());
        }

    }
}
