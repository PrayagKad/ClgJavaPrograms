package Java8;


interface Myface{
    void hello();
}

class myfaceimpl implements Myface
{
    @Override
    public void hello()
    {
        System.out.println("hello frands , chai pi loo......!!!");
    }
}

public class BeforeFUnctionalInterface    {                    // without functional interface (before java 8)

    public static void main(String[] args) {
        Myface myf = new myfaceimpl();
        myf.hello();

    }
}
