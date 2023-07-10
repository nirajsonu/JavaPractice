package opps;

public abstract class AbstractClassExample {
    public abstract void m1();
    public abstract void m2();
    public static void m3()
    {
        System.out.println("m3 is a static method");
    }

     void m4(){
        System.out.println("m4 is a defalut method");
    }


    private void m5(){
        System.out.println("m5 is a private method");
    }

    public void m9(){
        System.out.println("execute private method using public method");
        m5();
    }

    protected void m6(){
        System.out.println("m6 is protected method");
    }

    public void m7(){
        System.out.println("m7 is public method");
    }

    public final void m8(){
        System.out.println("m8 is final method");
    }

    public native void m10();

    public strictfp void m11(){
        System.out.println("stictfp method");
    }

    public synchronized void m12(){
        System.out.println("synchronized method");
    }

}
