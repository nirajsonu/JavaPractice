package datastuctures.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringMethods {
    public static void main(String[] args) {
        String name="Neerajj"; //string pool constant
        String p="Prince";
        String num="2";
        String num2="6";
        char[] charArray = name.toCharArray();
        String emptyString="";
        emptyString.isEmpty();
        emptyString.isBlank();
        name.startsWith("N");
        name.endsWith("J");
        name.toUpperCase();
        name.toLowerCase();
        name.trim();
        name.charAt(0);
        name.replace('j','p');
        name.substring(0,4);
        name.indexOf('r');
        name.concat(p);
        name.length();
        name.split("");
        String.valueOf(name);
        name.compareTo(p);


        // thread safe
        StringBuffer sb = new StringBuffer(name);
        StringBuffer sb1= new StringBuffer(p);
        char [] c = {'a','b','c','d'};
        sb.append("Keshri");
        sb.reverse();
        sb.replace(0,1,name);
        sb.compareTo(sb1);
        sb.delete(0,1);
        sb.getChars(1,3,c,1);


        // no thread safe
        StringBuilder sbu = new StringBuilder();
        sbu.append("n");
    }
}
