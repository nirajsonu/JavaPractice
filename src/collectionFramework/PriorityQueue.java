package collectionFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueue {
    public static void main(String a[]){
        queuePriorityQueue();
        arrayQueque();
        blockingQueque();
    }

    private static void blockingQueque() {
        Queue<Integer> queue=new PriorityBlockingQueue<>();
        queue.add(10);
        queue.add(20);
    }

    private static void arrayQueque() {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.offer(20);

        for (Integer integer : queue) {
            System.out.println(integer);
        }
    }

    private static void queuePriorityQueue() {
        Queue<Integer> queue = new java.util.PriorityQueue<>();
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
        System.out.println(queue);
        //System.out.println(element);
        System.out.println(empty);
    }
}
