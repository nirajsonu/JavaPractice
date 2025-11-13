package Thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;



// Introduce in a java 8 advance version of future
// Asynchronous programming in a java
// chain together multiple future, combine future, Exception Handling, it manually completed.
// Exception Handling

// RejectedExecutionException if we shut down executor after use any operation.
public class ComputableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // submit takes Runnable interface it return future object
        Future<List<Integer>> listFuture = executorService.submit(() -> {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
                return Arrays.asList(10, 20, 30, 40);
        });


        List<Integer> integers = listFuture.get();
        System.out.println(integers);

        // doesn't return anything.
        //executorService.execute();
        executorService.execute(()->{
            System.out.println("Execute method");
        });
        executorService.shutdown();


        // CompletableFuture supplyAsync takes supplier argument
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Worker");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return "ok";
        });

        stringCompletableFuture.get();
        stringCompletableFuture.complete("dummy Data");
        System.out.println("main");


        // runAsync don't return anything take argument Runnable
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->System.out.println("Run Async"));


        // thenAccept(Consumer)
        CompletableFuture<String> futureSupply = CompletableFuture.supplyAsync(() -> {
            return "Hello from supplyAsync";
        });
        futureSupply.thenAccept(System.out::println); // Prints: Hello from supplyAsync



        // thenApply(Function)
        CompletableFuture<Integer> integerFuture = CompletableFuture.supplyAsync(() -> 42);
        integerFuture.thenApply(result -> result * 2)
                .thenAccept(finalResult -> System.out.println("Final result: " + finalResult));


        //thenRun(Runnable) for mutiple tasks
        CompletableFuture<Void> thenRunFuture = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("First task");
                    return "Result";
                })
                .thenRun(() -> System.out.println("Second task (no input needed)"));

    }
}
