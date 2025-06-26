package String;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class StringWithObject {
    public static void main(String[] args) {
        String s="Neerajj"; //string pool constant
        String p="Prince";
        String num="2";
        String num2="6";

        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s.replace('j','p'));
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(4));
        System.out.println(s.indexOf('r'));
        System.out.println(s.concat(p));
        System.out.println(num2+num);



        Integer x=10;
        System.out.println(String.valueOf(x));

        char[] charArray = s.toCharArray();
        System.out.println(Arrays.toString(charArray));

        String emptyString="";

        boolean empty = emptyString.isEmpty();
       // boolean black=emptyString.isBlank();
        System.out.println(empty);
      //  System.out.println(black);

        Map<Character,Integer> map=new HashMap<>();
        map.put('N',14);
        map.put('E',5);
        System.out.println(map.get('B'));




       /* StringBuffer sb=new StringBuffer(s);
        String x="Neeraj";
        String s1=new String("Prince"); //heap
        String s2=new String("ashis");
        s2=s1;
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(x.hashCode());
      //  System.out.println(s2);

        for(int i=s.length()-1;i>=0;i--){
          //  System.out.print(s.charAt(i));
        }

        String substring = s.substring(s.length() / 2);
        System.out.println("output---------");
        for(int i=s.length()/2-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

        for(int i=substring.length()-1;i>=0;i--){
            System.out.print(substring.charAt(i));
        }

        boolean n = s1.equalsIgnoreCase(s2);
        System.out.println("");
        System.out.println(n);

        //  System.out.println(substring);
      //  System.out.println("");
       // System.out.println(sb.reverse());*/


    }
}
