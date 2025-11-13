package algorithms;

public class Recursion {
    public static void main(String[] a){
        int count=0;
        while (count< 3){                    // break condition
            printMessage("Neeraj");       // recursive function
            ++count;
        }
    }

    public static void printMessage(String s){
      System.out.println(s);
    }



}
