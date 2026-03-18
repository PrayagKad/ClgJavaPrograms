package StringBuilderMethods;

public class StringBuilderMethods1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
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
