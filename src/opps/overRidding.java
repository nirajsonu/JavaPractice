package opps;

public class overRidding implements MyInteface{

    static int x=10;
    public static void main(String ...a){
        overRidding overloading=new overRidding();
        overloading.m1();
        overloading.m2();
        Runnable m3 = MyInteface::m3;

        m3.run();
      //  System.out.println(overloading);
        overRidding.m3();
    }

    static void m3(){
        System.out.println("Parent static.."+x);
    }

    @Override
    public ParentClass addParent() {
        return null;
    }

    @Override
    public void m1() {
        System.out.println("m1 overloaded method...");
    }

    @Override
    public void m2() {
        System.out.println("m2 overloaded method..");
    }
}


