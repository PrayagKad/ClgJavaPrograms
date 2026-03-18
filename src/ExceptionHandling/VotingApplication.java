package ExceptionHandling;

public class VotingApplication {
    String checkAge(int age) throws CustomeExceAge
    {
        if (age< 18)
            throw new CustomeExceAge(" age below 18 ");
        else
           return " you can vote";


    }

    public static void main(String[] args) {

        VotingApplication obj= new VotingApplication();

        try {
           String msg =  obj.checkAge(20);
            System.out.println(msg);
        }
        catch (CustomeExceAge e)
        {
            e.printStackTrace();
        }

    }
}
