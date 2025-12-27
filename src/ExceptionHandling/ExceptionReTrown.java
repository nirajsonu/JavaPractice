package ExceptionHandling;

// throw keyword from throw exception customized exception
// throws keyword gives control to jvm to handle exception
// An abnormal condition that disrupts the normal flow of a program.
// checked--> Compile time exception and unchecked --> Runtime exception

// stack frame will store an exception information
// default exception handler handle by jvm
// object --> Throwable class --> Exception and Error.
// RuntimeException and its child Error and its child called uncheck rest checked.
// try with multiple catch block should be written in order in child first then parent.
// try catch finally
// try finally
// finally block return value always wins
// one try have one finally.
// mutilpe catch but one fianlly nesting allowed try catch try catch

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionReTrown {
public static void main(String args[]){
   /* try{
        int x=10;
        System.out.println(x/0);
    }
    catch (ArithmeticException e){
        e.printStackTrace();
       throw e;
    }
    finally {
        System.out.println("finally code always exceeded");
    }*/

 // try finally
 // try catch finally
 // catch finally if execution occur in try before printing
 // catch when finally block have System.exit(0); // terminates the JVM immediately.
  /*  try{
        System.out.println(10/0);
        System.out.println("try");
        System.out.println(10/0);
    }catch (Exception e){
        System.out.println("catch");  // when exception occurs
    }
    finally {
        System.exit(0);
        System.out.println("finally");
    }*/

    System.out.println(ExceptionReTrown.m1());
    try{System.out.println("try");
    }finally {
        System.out.println("finally");
    }

    try{
        System.out.println("try");
        return;
    }catch (Exception e){
        System.out.println("catch");
    }
    finally {
        System.out.println("finally");
    }

   /* try {
        // risky code
    } catch (IOException | SQLException e) {
        // handle either IOException or SQLException
    }*/

    // try with resources which have AutoCloseable interface
    // files, streams, sockets, database connections




}

    public static int m1() {
        try {
            System.out.println(10/0);  // Line A
            return 777;                // Line B
        } catch (ArithmeticException e) {
            return 888;                // Line C
        } finally {
            return 999;                // Line D
        }
    }

}


