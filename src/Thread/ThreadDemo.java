package Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        // Start the thread
        t1.start();
        try {
            // Waits for a thread to finish execution of another thread
            t1.join(2000);
        }catch (InterruptedException i){
            System.out.println(i.getMessage());
        }

        t2.start();

        try {
            t2.join(2000);
        }catch (InterruptedException i){
            System.out.println(i.getMessage());
        }

        t3.start();

        try {
            t3.join(2000);
        }catch (InterruptedException i){
            System.out.println(i.getMessage());
        }

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // wait() , notify(), notifyAll() used on synchronized block inter-thread communication

    // yiled() pause the current thread execution.
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Stated... "+Thread.currentThread().getName());
        try{
            Thread.sleep(4000);
        }catch (InterruptedException interruptedException){
            System.out.println(interruptedException.getMessage());
        }
        System.out.println("Thread ended: "+Thread.currentThread().getName());
    }
}
