package Thread;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadMethods extends Thread{
    public static void main(String[] args) {
        userDefineThread();
        waitMethod();
        //Prevent thread Execution temporarily
        joinMethod();
        yieldMethod();
        sleepMethod();
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
}
