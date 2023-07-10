package java8;

import java.util.Arrays;

public class Anagram {
    public static void main(String a[]){
        String s1="silent";
        String s2="listen";
            char c[]=s1.toCharArray();
            char c1[]=s2.toCharArray();

            Arrays.sort(c);
            Arrays.sort(c1);

            boolean results=Arrays.equals(c,c1);
            if(results){
                System.out.println("Anagram String..");
            }
            else {
                System.out.println("not Anagram...");
            }
        }

}
