package opps;

public class ClassObject {

    public static int x=10;

    public static void main(String a[]){
        //static method call className.method name
        ClassObject.staticMethodDemo();
        System.out.println(ClassObject.x);
    }


    public static void staticMethodDemo()
    {
        System.out.println("This is static method called without object");
    }
}

