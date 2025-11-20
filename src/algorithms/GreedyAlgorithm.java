package algorithms;


import java.util.Arrays;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        // coin problem
        int coins[]= {1,2,3,5};
        int demonations = 19;
        Arrays.sort(coins);
        for(int n=coins.length-1;n>=0;n--){
            while (demonations>=coins[n]){
                demonations = demonations - coins[n];
                System.out.print(coins[n] +" ");
            }
        }

    }




}
