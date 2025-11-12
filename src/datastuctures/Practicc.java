package datastuctures;

import java.util.concurrent.Callable;

public class Practicc {
    public static void main(String[] args) {
       i i = (a,b)->a+b;
       System.out.println(i.add(10,20));

       Runnable r = ()->{
          System.out.println("hello");
       };

       r.run();

        Callable c =()->{
           System.out.println("call");
           return "done";
        };

        c.call();
    }
}

@FunctionalInterface
interface i{
    int add(int a,int b);
}