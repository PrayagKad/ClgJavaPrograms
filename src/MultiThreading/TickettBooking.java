package MultiThreading;


import java.util.Scanner;

class Train implements Runnable{
    int avlSeats  ;
    int reservedSeats;


    public Train(int avlSeat, int reservedSeat) {
        super();
        this.avlSeats = avlSeat;
        this.reservedSeats = reservedSeat;
    }



    @Override
    public synchronized void run() {
        try{
            System.out.println("Available Seats :" + avlSeats
                    + "\n Asking for Reserved" + reservedSeats);

            Thread t = Thread.currentThread();
            if(avlSeats >= reservedSeats)
            {
                Thread.sleep(5000) ; /// payment window
                System.out.println(reservedSeats + " Seats Booked for " + t.getName());
                avlSeats -= reservedSeats;
            }
            else
                System.out.println(" sorry ! sab bhar gaya maaam. Kal ana, kal ...."+t.getName());
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

public class TickettBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter total available seats : ");
        int avlSeats = sc.nextInt();
        System.out.println("enter seats u want to book :");
        int bookSeats = sc.nextInt();



        Train tr = new Train(avlSeats , bookSeats );
        Thread  t = new Thread(tr);
        t.setName(" dracu chicha ");
        t.start();



        avlSeats -= bookSeats;
        System.out.println("enter seats u want to book :");

        int bkseat = sc.nextInt();

        Train tr1 = new Train(avlSeats , bkseat);
        Thread t2 = new Thread(tr1);
        t2.setName(" mia bhai");
        t2.start();
        System.out.println("enter seats u want to book :");






    }

}
