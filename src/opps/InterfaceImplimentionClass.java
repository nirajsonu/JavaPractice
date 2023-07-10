package opps;

public class InterfaceImplimentionClass implements MyInteface {
    public static void main(String a[]){
        InterfaceImplimentionClass interfaceImplimentionClass=new InterfaceImplimentionClass();
        interfaceImplimentionClass.m1();
        interfaceImplimentionClass.m2();
    }

    @Override
    public void m1() {
        System.out.println("m1 method..");
    }

    @Override
    public void m2() {
        System.out.println("m2 method..");
    }
}
