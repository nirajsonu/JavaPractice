package Thread;

public class HandleDeadLock {
    public static void main(String a[]){
        final String resource1="ratan jaiswal";
        final String resource2="vimal jaismal";

        Thread t1= new Thread(() -> {
            synchronized (resource1){
                System.out.println("Thread 1:locked resource 1");
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
                synchronized (resource2){
                    System.out.println("Thread 1:locked resource 2");
                }
            }
        });

        //t2 tries to lock resource 2 then resource1
        Thread t2= new Thread(() -> {
            synchronized (resource2){
                try{Thread.sleep(100);}catch (Exception e){
                }
                synchronized (resource1){
                    System.out.println("Thread 2:locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
