package Collections;

import java.util.PriorityQueue;

public class QueueDemo
{
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(100);
        pq.add(200);
        pq.add(300);
        pq.add(400);
        pq.add(500);
        pq.add(600);

        System.out.println(pq);

        System.out.println(
                pq.peek()
        );
        System.out.println(pq.poll());
        System.out.println(pq.isEmpty());
        System.out.println(pq.offer(160));


    }
}
