package MultiThreading;

class SynchronizedCounter{
    int cnt = 0;
    public synchronized void increment()
    {
        cnt++;
    }
    public int getCnt()
    {
        return  cnt;
    }
}

public class CountingDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread[]  t = new Thread[1000];
        SynchronizedCounter counter = new SynchronizedCounter();
        for(int i = 0; i<1000 ; i++)
        {
            t[i] = new Thread(counter::increment);
            t[i].start();
        }
        for(int i =  0; i<1000 ; i++)
        {
            t[i].join();
        }
        System.out.println("Final count " + counter.getCnt());


    }
}
