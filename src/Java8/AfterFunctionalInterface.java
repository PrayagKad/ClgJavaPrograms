package Java8;


interface say{
    String Hello(String name);
}

public class AfterFunctionalInterface {

    public static void main(String[] args) {
        say say = (String Name) ->{
            System.out.println(" hellu frands ...." + Name);
            return Name.toUpperCase();
        };
       String s =  say.Hello(" mia bhai bolte chichaaaa...");

        System.out.println(s);
    }

}
