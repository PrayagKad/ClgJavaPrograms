package MethodSyntax;


import java.time.LocalDate;

class A /// syntax 1
{
    void m1()
    {
        System.out.println("m1  ");
    }
    static void m2()
    {
        System.out.println(" m2 of static");
    }
}

class B /// syntax 2
{
    void m1(int num)
    {
        System.out.println("m1 : "+ num);
    }
    static void m2(boolean flag)
    {
        if(flag)
        System.out.println(" m2 of static with condition true");
        else {
            System.out.println(" m2 of static with condition false");

        }
    }
}

class C
{
    void C1(LocalDate id)
    {
        System.out.println(" im c1 with today's date" + id);
    }

    static void c2(A oa)
    {
        oa.m1();
        System.out.println(" im c2 of static with object of A ");
    }

}

class D
{
    int D1()
    {
        int x = 100;
        System.out.println(" returning value of x from D1 ");
        return x;
    }

    static int D2()
    {
        int a = 200;
        System.out.println(" returning value from static D2 without any input  ");
        return a;

    }
}

public class Syntax_Call_1_4 {

    public static void main(String[] args) {

        A obj = new A(); // syntax 1
        obj.m1(); // non-static method
        A.m2(); // static method

        B objb = new B(); // syntax 2
        objb.m1(1000);// non-static
        B.m2(true); // static method

        C.c2(new A()); // static method, also can use above object of A  // C.c2(obj)
        C objc = new C();
        LocalDate id = LocalDate.now(); // assign today's date to variable id
        objc.C1(id); // non-static method

        int a = D.D2();
        System.out.println(" im from D2 static : " +a);
        D objd = new D();
        int i = objd.D1();

    }
}
