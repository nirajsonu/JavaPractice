package company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Aerolens {
    public static void main(String[] args) {
        int[] numbers = {44,33,44,33,44,33,22,44,22,11};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        HashMap<Integer,Integer> FrqMap= new HashMap<>();
        for(int x:numbers){
            FrqMap.put(x, FrqMap.getOrDefault(x,0)+1);
        }
        System.out.println(FrqMap);
    }
}
