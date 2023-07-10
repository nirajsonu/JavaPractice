package ExceptionHandling;



public class ExceptionReTrown {
public static void main(String args[]){
    try{
        int x=10;
        System.out.println(x/0);
    }catch (ArithmeticException e){
        e.printStackTrace();
       throw e;
    }
}
}
