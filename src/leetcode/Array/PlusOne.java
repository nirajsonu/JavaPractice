package leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String a[]){
        int x[]={9,1,3};
        int last=0;
        int rem=0;
        int finalNumber=22;
        ArrayList<Integer> arrayList=new ArrayList<>();
        String ans="";
        last=x[x.length-1]+1;
        for(int i=0;i<x.length-1;i++){
            arrayList.add(x[i]);
        }
        arrayList.add(last);
        System.out.println(arrayList);
        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
        for(int i:arr){
            System.out.print(i);
        }
        ans = (char) (101) + ans;
    //    System.out.println(ans);
     //   System.out.println(rem);
    //    System.out.println(last);

        Arrays.sort(x);
        int min=x[0];
        int max=x[x.length-1];
      //  System.out.println(min);
      //  System.out.println(max);
        for(int i=0;i<x.length;i++){
            if(x[i]==max || x[i]==min){

            }else{
         //       System.out.println(x[i]);
            }


        }
    }
}
