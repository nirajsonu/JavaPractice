package opps;

public class OverloadingClass {
    public void area(int radius){
        System.out.println("1st method invoked ");
    }

    public void area(int len,int breath){
        System.out.println("2nd method invoked ");
    }

    public void area(int side,float height){
        System.out.println("3rd  method invoked ");
    }

    public void area(int ...x){
        System.out.println("var args");
    }


    //static method can be overloaded..
    public static void area(int x,double d)
    {
        System.out.println("Static methods with int and double");
    }

    public static void area(int x,double d,float c){
        System.out.println("Static methods with int double and float");
    }

    public static void main(String a[]){
        OverloadingClass overloadingClass=new OverloadingClass();
        overloadingClass.area(1);
        overloadingClass.area(10,12);
        overloadingClass.area(1,10f);
        overloadingClass.area(1,2,3,3);
        overloadingClass.area('a');
        OverloadingClass.area(10,1d);
        OverloadingClass.area(10,1d,3f);
    }
}
