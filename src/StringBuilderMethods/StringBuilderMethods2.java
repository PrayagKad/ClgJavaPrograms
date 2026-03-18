package StringBuilderMethods;

public class StringBuilderMethods2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");
        System.out.println(sb.charAt(2));
        sb.setCharAt(0,'p');
        System.out.println(sb.substring(0,6));
        System.out.println(sb.subSequence(0,4));
        System.out.println(sb.indexOf("gram"));
        System.out.println(sb.lastIndexOf("m"));
        sb.setLength(5);
        sb.trimToSize();
        System.out.println(sb.codePointAt(1));
        System.out.println(sb.codePointBefore(2));
        System.out.println(sb.codePointCount(0, sb.length()));
    }
}
