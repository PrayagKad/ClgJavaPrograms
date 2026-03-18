package MultiThreading;


class Addition implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            int sum = 10 + 20;
            System.out.println("result :"+ sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Addition ad = new Addition();
        for(int i = 0 ; i<500;i++)
        {
            Thread t = new Thread(ad);
            // t.run() the programs executes as single thread compile at each iteraion
            t.start(); // is we direct use .run() it works as single Thread process
        }
    }

}
