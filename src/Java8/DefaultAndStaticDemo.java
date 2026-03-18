package Java8;
interface facu{
    void sayHI();
    default void wishHeppyBorthday()
    {
        System.out.println(" janamdin mubarakho janab !!");
    }


    static String Wish(double time)
    {
        if(time>= 6 && time<=12)
            return " subha hogeli mamu !!";
        else if (time>=12 && time<16) {
            return " dopehr hogeli uth jao !!";
        }
        else
            return " soja hawle ratt hogeli";

        }
    }


public class DefaultAndStaticDemo {

    public static void main(String[] args) {
        facu fc = () ->{
            System.out.println("i am only abstract method .... akelach hai re mai one man army bolteee");
        };
        fc.sayHI();
        fc.wishHeppyBorthday();

        String mess = facu.Wish(6);
        System.out.println(mess);
    }
}
