package MultiThreading;


class Song extends Thread{

    @Override
    public void run()
    {
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + t.getPriority());
            Thread.sleep(3000);

        }catch (Exception e )
        {
            e.printStackTrace();
        }
    }

}

public class ThreadNameAndPriority {
    public static void main(String[] args) {

        Song song = new Song();
        Thread t1 = new Thread(song);
        t1.setName("vajle ki bara :");
        t1.setPriority(6);
        t1.start();

        Thread t2 = new Thread(song);
        t2.setName("chammak challo :");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
