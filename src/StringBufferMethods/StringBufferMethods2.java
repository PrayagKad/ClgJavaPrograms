package StringBufferMethods;

public class StringBufferMethods2 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Programming"); // creates a new string buffer

        System.out.println(sb.charAt(2));

        sb.setCharAt(0,'p'); // the char at given index gets changed

        System.out.println(sb.substring(0,6)); // print the required substring from given index

        System.out.println(sb.subSequence(0,4));

        System.out.println(sb.indexOf("g"));

        System.out.println(sb.lastIndexOf("g"));
        sb.setLength(5);
        sb.trimToSize();
        System.out.println(sb.codePointAt(1));
        System.out.println(sb.codePointBefore(1));
        System.out.println(sb.codePointCount(0,sb.length()));

        // isBlank();
        //trin 3 methods;
        //lines();
        //repeat();
        //strip();
    }
}
