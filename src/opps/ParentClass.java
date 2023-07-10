package opps;

public class ParentClass {
    public void show(){
        System.out.println("parent class show method");
    }



   // public abstract void display();

    //static method cannot override
    public static void print(){
        System.out.println("this is static method");
    }
}
