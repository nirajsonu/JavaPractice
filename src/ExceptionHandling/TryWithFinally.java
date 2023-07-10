package ExceptionHandling;

public class TryWithFinally{
    public static void main(String a[]){
        try{
            System.out.println("try block execute");
        }finally {
            System.out.println("try-finally flow...");
        }


        try{
            int x=10/0;
        }catch (ArithmeticException ar){
            ar.printStackTrace();
        }
        finally {
            System.out.print("Finally block execute always execute....");
        }
    }
}
