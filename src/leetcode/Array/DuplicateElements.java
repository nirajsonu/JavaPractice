package leetcode.Array;

import java.util.*;

public class DuplicateElements {
    public static void main(String a[]){
        int x[]={1,2,3,4,1};
        Arrays.sort(x);
       System.out.println(checkDuplicates(x));
    }

    private static Boolean checkDuplicates(int[] x) {
        for(int i=0;i<x.length-1;i++){
            if(x[i]==x[i+1]){
                return true;
            }
        }
        return false;
    }


}
