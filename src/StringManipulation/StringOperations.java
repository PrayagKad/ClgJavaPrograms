package StringManipulation;

public class StringOperations {

    public static void main(String[] args) {

        String str = new String("java");
        String str1 = str.concat(" is a prog lang.");
        System.out.println(str1);

        String[] arr = str1.split(" ");
        System.out.println(arr.length);

       /* String str1 = new String("Java");
        if(str.equals(str1))
            System.out.println(" both are same");
        else System.out.println(" both are diff");

        String a = " hello";
        String b = " hello";
        if(a==b)
        {
            System.out.println("same");
        }
        else
            System.out.println(" different ");*/

    }
}
