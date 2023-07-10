package opps;

public class AbstactClassImplemetionExample extends AbstractClassExample{

    public static void main(String a[]){
        AbstactClassImplemetionExample abstactClassImplemetionExample=new AbstactClassImplemetionExample();
        abstactClassImplemetionExample.m1();
        abstactClassImplemetionExample.m2();
        AbstactClassImplemetionExample.m3();
        abstactClassImplemetionExample.m4();
        abstactClassImplemetionExample.m6();
        abstactClassImplemetionExample.m7();
        abstactClassImplemetionExample.m8();
        abstactClassImplemetionExample.m9();
        abstactClassImplemetionExample.m10();
        abstactClassImplemetionExample.m11();
        abstactClassImplemetionExample.m12();
    }


    @Override
    public void m10(){
        System.out.println("native method in abstract class");
    }

    @Override
    public void m1() {
        System.out.println("abstact m1 needs to provide body");
    }

    @Override
    public void m2() {
        System.out.println("abstact m2 method needs to provide body");
    }
}
