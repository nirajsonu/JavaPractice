package String;

import java.util.HashMap;
import java.util.Map;

public class CharaterClass {
    public static void main(String a[]){
        countFrequency();
    }

    private void characterClassDemo(){
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('a'));
        char c= 'd';
        String data="this is neeraj kumar keshri";
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<data.length();i++){
            char c1=data.charAt(i);
            char c2 = Character.toUpperCase(c1);
            stringBuffer.append(c2);
        }
        System.out.println(Character.toUpperCase(c));
        System.out.println(stringBuffer);
    }

    private static void countFrequency(){
        String test="Hello, World!";
        test = test.replaceAll("[^a-zA-Z]", "");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char c:test.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}

