package Collections;

import com.sun.source.tree.ConstantCaseLabelTree;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Nitin");
        s.push("suhas ");
        s.push("ramukaka");

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());

        Enumeration<String> em = s.elements();
        while(em.hasMoreElements())
        {
            System.out.println(em.nextElement());
        }


    }
}
