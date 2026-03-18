package StringBufferMethods;

public class StringBufferMethods1 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0,5,"Hi");
        sb.delete(2,4);
        sb.deleteCharAt(1);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.length());
    }
}
