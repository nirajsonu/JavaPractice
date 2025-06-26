package opps;

import java.io.Serializable;

public class ClassObject  implements Serializable {

    public static int x=10;

    static {
        System.out.println("This is a static block called very first...");
    }
    public static void main(String a[]){
        //static method call className.method name
       // ClassObject.staticMethodDemo();
        staticMethodDemo();
        System.out.println(ClassObject.x);

        //Ananomus object
        new B().m2();

        B b=new B();
        b.m2();


    }


    public static void staticMethodDemo()
    {
        System.out.println("This is static method called without object");
    }
}


class B{
    public void m2(){
        System.out.println("M2 called..");
    }
}