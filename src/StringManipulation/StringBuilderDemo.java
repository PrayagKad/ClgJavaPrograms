package StringManipulation;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(" java");
        sb.append(" new programming lang");
        StringBuilderDemo sb1 = new StringBuilderDemo();
        sb1.reverseS(sb);
    }

    void reverseS(StringBuilder s)
    {

        StringBuilder rs = new StringBuilder("");

        /*for(int i =s.length()-1 ; i >=0 ;i--)
        {
            rs.append(s.charAt(i));
        }
        System.out.println(rs);
*/





    }
}
