package MethodSyntax;
class E /// syntax 5
{
    int E1(int num)
    {
        num++;
        System.out.println(" increment input and return the input as output from Method E" + num);
        return num;
    }
    static int E2(int num)
    {
        num += 10;
        System.out.println(" return num from E2 static" + num);
        return num;
    }
}

class F /// syntax 6
{
     int F1(E obj)
    {
        return obj.E1(200);
    }
    
    static int F2(E obj)
    {
        return E.E2(100);
    }

}
public class Syntax_call_5_6 {


    public static void main(String[] args) {

        ///  syntax 5
        int i = E.E2(100); // static function call
        E obje = new E();
        obje.E1(200); // non-static method call
        
        ///  syntax 6

        int j = F.F2(new E());
        F objf = new F();
        objf.F1(new E());
    }
}
