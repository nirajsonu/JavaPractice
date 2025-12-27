package Thread;

import java.util.concurrent.FutureTask;

// two ways to create thread extending a thread, implementing runnable interface, callable interface it return something
// using executor frameworks. Future and Computable future
// thread scheduler
// run() directly → no new thread, just a method call.
//start() → new thread is created, run() executes inside it.
// Runnable implementations run method
// thread priority default 5 min_priority, max_priority --> 10

public class ThreadMethods extends Thread{
    public static void main(String[] args) throws InterruptedException {
       // userDefineThread();
      //  waitMethod();
        //Prevent thread Execution temporarily
       // joinMethod();
       // yieldMethod();
       // sleepMethod();
        TheardDurga.createThread();
    }

    private static void userDefineThread() {
        Thread t=new Thread();
        t.setName("Neeraj Thread");
        t.start();
        System.out.println(t.getName());
    }

    private static void yieldMethod() {
        //Skip the current thread and give change to another thread... which have same priority
    }

    private static void joinMethod() {
        //
    }

    private static void waitMethod() {
        //
    }

    private static void sleepMethod() {
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                //Thread.sleep() sleep the thread to 1 second...
                Thread.sleep(1000);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        }
        System.out.println(currentThread().getName());
    }

// prevent thread exception yield() --> pause the current execution and give
// join() -->,sleep()-->
    static class TheardDurga extends Thread{
        public static void createThread() throws InterruptedException {
            Thread thread = new Thread(() -> System.out.println("Thread 1"));
            Thread.sleep(1000);
            thread.start();

            Thread thread1  = new Thread(()->System.out.println("Thread 2"));
            Thread.yield();
            thread1.start();

            thread.join();  // wait until t1 finishes
            thread1.join();  // wait until t2 finishes
            thread.interrupt();

            System.out.println("Both threads finished");

            // join() and yield()
            // join wait until thread is completed it will block other threads
            // yield() pause the thread and give priority to other thread to work;

            // wait() and notify,notify works in synchronization block
            // simple producer–consumer example
           // Deadlock: Two threads wait on each other → stuck forever.
          //  Starvation: A thread waits indefinitely because others keep getting resources.
            //  Interruption: A controlled way to stop or signal a thread.


            // synchronization
            // applicable from methods and blocks
            // it insure the order 1st thread work then another thread works and that's all
            // object level lock, class level lock
            // synchronized(this),synchronized(Student.class),it will be always either .class file or object,
            // primitive not allowed
            // if we don't use correctly synchronized keyword deadlock occur


            // inter-thread communication
            // wait(),notify(),notifyAll()
            // demon thread which is working on background
            // race condition executing each thread and it will create data inconsistent that is called race condition use
            // synchronized keyword
            // lock() --> lock the object
            // booleantryLock() -->
            // threadpool framework -->Executor framework

            // if parent class sealized then child also been serialized
            // externatization ,serlized uuid
        }

    }
}
