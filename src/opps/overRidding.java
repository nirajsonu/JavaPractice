package opps;

public class overRidding implements MyInteface{

    public static void main(String ...a){
        overRidding overloading=new overRidding();
        overloading.m1();
        overloading.m2();
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
