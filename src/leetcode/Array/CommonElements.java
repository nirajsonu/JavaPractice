package leetcode.Array;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String a[]){
        String first="Sounu".toLowerCase();
        String second="Neerajo".toLowerCase();
        char[] c =first.toCharArray();
        char[] c1 =second.toCharArray();
        ArrayList<String> arrayList=new ArrayList<>();

        for (char value : c) {
            for (char item : c1) {
                if (value == item) {
                    arrayList.add(String.valueOf(value));
                }
            }
        }
        arrayList.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);


        int[] ageOfGirls ={10,20,23,35,45};
        int[] age1OfBoys ={20,18,21,10,34,23};
        System.out.println();
        System.out.println("Common age of two arrays");
        commonElementInIntegerArray(ageOfGirls,age1OfBoys);
    }

    private static void commonElementInIntegerArray(int[] ageOfGirls, int[] age1OfBoys) {
        ArrayList<Integer> commonAge=new ArrayList<>();
        for(int age:ageOfGirls){
            for(int ageb:age1OfBoys){
                if(age==ageb){
                    commonAge.add(age);
                }
            }
        }
        commonAge.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }


}
