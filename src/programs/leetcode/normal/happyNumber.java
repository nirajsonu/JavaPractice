package programs.leetcode.normal;

import java.util.HashSet;
import java.util.Set;

public class happyNumber {
    public static void main(String a[]){
        int n=55;
        Set<Integer> set=new HashSet<>();
        while (n!=1 && !set.contains(n)){
            set.add(n);
            int sum=0;
            while (n>0){
                sum= (int) (sum+Math.pow((n%10),2));
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not an happy number");
        }
    }
}
