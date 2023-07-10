package queue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String a[]){
        Queue<Integer> queue=new java.util.PriorityQueue<>();
        /*queue.add(100);
        queue.add(50);
        queue.add(150);*/
        //offer()
       queue.offer(10);
      queue.offer(20);
      queue.offer(5);
      queue.offer(5);

      //null not allowed
    //  queue.offer(null);
        //poll remove and head element of the same.
        //queue.poll();

        //remove and head element of the same.(No such exception)
      //  queue.remove();

        boolean empty = queue.isEmpty();
        //peek head element of the queue
        queue.peek();

        //element head element of the queue(No such element exception)
       // Integer element = queue.element();

        //

        System.out.println(queue);
       //System.out.println(element);
       System.out.println(empty);
    }
}
