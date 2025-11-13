package programs.leetcode.Array;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String a[]){
        int x[]={34,23,24,67,88,22};
        int k=2;
        Arrays.sort(x);
        getSmallestNumberOfArray(x,k);
    }

    private static void getSmallestNumberOfArray(int[] x, int k) {
        int smallestElement=0;
        for(int i=0;i<x.length-1;i++){
            smallestElement=x[x.length-k];
        }
        System.out.println(smallestElement);
    }
}
