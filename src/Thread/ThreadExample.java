package Thread;

public class ThreadExample {
    public static void main(String args[]){
        Thread thread=new Thread();
        thread.setName("Neeraj Thread");
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());
        MyThread myThread=new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{
    
}


class MyRunnableThread implements Runnable{

    @Override
    public void run() {

    }
}
