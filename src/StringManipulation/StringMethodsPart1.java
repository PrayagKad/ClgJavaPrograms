package StringManipulation;

public class StringMethodsPart1
{

    public static void main(String[] args)
    {
        String s = "  Hello Java Programming  ";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(2,7));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.equals("Hello"));
        System.out.println(s.equalsIgnoreCase("  hello java programming  "));
        System.out.println(s.compareTo("Hello"));
        System.out.println(s.contains("Java"));
        System.out.println(s.startsWith(" "));
        System.out.println(s.endsWith(" "));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.replace("Java","World"));
    }
}
