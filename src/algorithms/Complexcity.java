package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Complexcity {
    public static void main(String[] args) {
        // complexity square root n
        for(int i=0;i*i<10;i++){
            System.out.println(i);
        }

        // complexity n
        for(int j=0;j/2<10;j++){
            System.out.println(j);
        }

        // log n
        for (int i = 1; i < 10; i *= 2) {
            System.out.println(i);
        }
        for (int i = 10; i > 1; i = i/ 2) {
            System.out.println(i);
        }

        // o(1)
        int x[] = new int[5];
        int a = 10;
        int b=12;
        int sum = a+b;
        System.out.println(sum);
        Map<Integer,Integer> numbers = new HashMap<>();
        numbers.put(1,1);
        numbers.get(1);


        // n log n
        for (int i = 1; i < 10; i *= 2) {
            System.out.println(i);
            for (int j = 0; j < 10; j++) {
                // Empty inner loop
            }
        }

        // Recursion functional calling itself

        Complexcity complexcity =new Complexcity();
        System.out.println(complexcity.factorial(5));
    }

    int factorial(int n){
        // base case if base case not add stackoverflow problem comes
        if(n<=1) return 1;
         // recursive case
            return n *factorial(n-1);
        }
}
