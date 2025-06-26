package String;

import java.util.HashMap;
import java.util.Map;

public class CharaterClass {

    public static void main(String a[]){
        countFrequency();
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

