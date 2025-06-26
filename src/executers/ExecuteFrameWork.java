package executers;

import java.util.Calendar;
import java.util.concurrent.*;

//pool of threads to do tasks
//it is created blocking queue ,so it is thread safe operations.
//ideal pool size is
//callable method
public class ExecuteFrameWork {
    public static void main(String a[]) throws ExecutionException, InterruptedException {
        //fixed thread pool
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //Single thread pool
        ExecutorService executorServiceSingle= Executors.newSingleThreadExecutor();

        //Scheduled Thread pool delay
        ExecutorService executorServiceScheduled=Executors.newScheduledThreadPool(10);

        //CachedThread pool synchronous queue
        ExecutorService executorServiceCached=Executors.newCachedThreadPool();


        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(10);
      //  scheduledExecutorService.schedule(new CpuIntensiveTask(),10)

        for(int i=0;i<100;i++){
            executorService.execute(new CpuIntensiveTask());
        }
        System.out.println("Thread Name:"+Thread.currentThread().getName());
        executorService.shutdown();

        Future<Integer> future=scheduledExecutorService.submit(new Task());
        future.get();
    }
}

class Task implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return null;
    }
}


class CpuIntensiveTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Name:"+Thread.currentThread().getName());
    }
}
