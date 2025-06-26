package Thread;

public class ThreadExample {
    public static void main(String args[]){
        Thread thread=new Thread();
        thread.setName("Neeraj Thread");
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());
        MyThread myThread=new MyThread();
        myThread.start();
        Thread demonThread=new Thread();
        demonThread.setDaemon(true);
        if(demonThread.isDaemon()){
            System.out.println("Yes it is demon thread...");
        }else{
            System.out.println("No it is not demon thread...");
        }

        if(thread.isDaemon()){
            System.out.println("it is demon thread..");
        }else{
            System.out.println("it is not a demon thread..");
        }

        twoTimesStartThread();
    }

    private static void twoTimesStartThread() {
        Thread t=new Thread(); //java.lang.IllegalThreadStateException
       // t.run();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
       t.start();
    }
}

class MyThread extends Thread{
    
}


class MyRunnableThread implements Runnable{

    @Override
    public void run() {

    }
}
