package leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;
public class SingleNumber {
    public static void main(String a[]){
        int [] numberArray={2,2,3,2};
        getSingleNumber(numberArray);
    }

    private static void getSingleNumber(int[] numberArray) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<numberArray.length;i++){
            hashMap.put(numberArray[i],hashMap.getOrDefault(numberArray[i],0)+1);
        }
        for(int key:hashMap.keySet()){
            if(hashMap.get(key)==1)
            {
                System.out.println(key);
            }
        }
    }
}
