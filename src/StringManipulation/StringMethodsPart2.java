package StringManipulation;

import java.util.Arrays;

public class
StringMethodsPart2
{
    public static void main(String[] args)
    {
        String s = "one,two,three";
        String s2 = "";
        System.out.println(s.replaceAll(",", "-"));
        System.out.println(s.replaceFirst(",", "-"));
        System.out.println(Arrays.toString(s.split(",")));
        System.out.println("Hello".concat(" World"));
        System.out.println(s2.isEmpty());
        System.out.println(String.valueOf(123));
        System.out.println(Arrays.toString("Java".toCharArray()));
        System.out.println(String.join("-", "A","B","C"));
        System.out.println("Java".intern());
        System.out.println("abc".matches("[a-z]+"));
        System.out.println("ha".repeat(3));
        System.out.println("Programming".subSequence(0,6));
        System.out.println("  hi  ".strip());
        System.out.println("  hi  ".stripLeading());
        System.out.println("  hi  ".stripTrailing());
    }
}
