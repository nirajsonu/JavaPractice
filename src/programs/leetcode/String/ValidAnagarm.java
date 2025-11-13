package programs.leetcode.String;

import java.util.Arrays;

public class ValidAnagarm {
    public static void main(String a[]){
        String s="rat";
        String t="cat";
        char [] c=s.toCharArray();
        char[] c1=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(Arrays.equals(c,c1)){
           System.out.println("Anagram");
        }
        else {
            System.out.println("Non Anagram");


       }
    }
}
