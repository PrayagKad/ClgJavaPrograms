package Java8;

import java.util.Arrays;
import java.util.List;

interface myDemo{

    public void info();


}

class Demo implements myDemo{
    public void info()
    {
        System.out.println(" mai demo se hu re kalu");
    }

    public  static void getName(String names)
    {
        System.out.println(names);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ramu kaka", " mia bhai" , " anzer " , "janab" );
        list.forEach(System.out::println);


        Demo d = new Demo();

        myDemo m = d::info;
        m.info();

        list.forEach(Demo::getName);
    }
}
