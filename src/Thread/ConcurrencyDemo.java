package Thread;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

// concurrency will deal with concurrency, multithreading, parallelism

// concurrency --> multiple events run(Thread) in same time.

// Process --> A process is a program in execution.
// Thread --> it is a lightweight process

public class ConcurrencyDemo{

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {


        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());

        Runtime.getRuntime().exec(new String[] {
                "open", "-a", "Google Chrome"
        });
        System.out.println("Google Chrome successfully started");




        // copyOnWriteArrayList
      /*  CopyOnWriteArrayList<programs.String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("Neeraj");
        copyOnWriteArrayList.add("Sonu");
        copyOnWriteArrayList.add("Keshri");

        // copyOnWriteSet
        CopyOnWriteArraySet<programs.String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("Neeraj");
        copyOnWriteArrayList.add("sonu");
        copyOnWriteArraySet.add("keshri");



        MyThered myThered = new MyThered();
        Thread thread1 = new Thread(myThered);
        thread1.start();

       /* MyThreadCallable callable =new MyThreadCallable();
        Thread thread2=new Thread(callable);
        thread2.start();*/


       // Executor
       /* ExecutorService service = Executors.newFixedThreadPool(3);
        Future<List<Integer>> future = service.submit(() ->{
            System.out.println("Thread"+Thread.currentThread().getName());
            delay(1);
            return programs.Arrays.asList(1,2,3,4);
        });






        System.out.println(future.isCancelled());
        List<Integer> list = future.get();
        System.out.println(future.isDone());
        System.out.println(list);
        future.cancel(true);*/
    }

    private static void delay(int i) {
        try{
            TimeUnit.SECONDS.sleep(i);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }

    // Synchronizes

    // Semaphore it will maintain permit count = 0 for sharad resources


    // CountDownLatch count of some value and before release count will be 0

    // cyclicBarrier thread will wait for each other

    // Exchanger
    Exchanger<Integer> exchanger = new Exchanger<>();


    // Future

    // Callable

    // ComputableFuture runAsync() and supplySync()
    /*
    it cannot be manually completed
    cannot channing together
    cannot combine multiple futures together
    no exception handling mechanism
     */



    // Concurrent Modification Exception

    // concurrent collection 1.5v



    // copyOnWriteArraySet

    //concurrentHashMap segment level locks  putIfAbsent replace

    //Locks it is interface java.util.concurrent.locks it is alternative for synchronized keyword more flexible than synchronized
    // void lock()  boolean tryLock()  void unlock()   ReentrantLock  same lock used by multiple times

    //don't return any value
    static class MyThered implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<5;i++){
                System.out.println("Creating thread by Runnable " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class MyThreadCallable implements Callable{

        @Override
        public Object call() throws Exception {
            for(int i=0;i<5;i++){
                System.out.println("Creating thread by callable interface "+i);
            }
            return null;
        }
    }



}
