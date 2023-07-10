package Arrays;

import java.util.HashSet;

public class intersectionArray {
    public static void main(String a[]){
        int[] x ={20,50,30,40};
        int[] y ={20,5,70,80};
        interSectionOfBothArrays(x,y);
        uniounOfBothArrays(x,y);
    }

    private static void uniounOfBothArrays(int[] x, int[] y) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i:x){
            hashSet.add(i);
        }
        for(int i:y){
            hashSet.add(i);
        }
        System.out.println(hashSet);

    }

    private static void interSectionOfBothArrays(int[] arr1, int[] arr2) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hashSet.contains(arr2[i])){
                System.out.println(arr2[i]);
            }

        }

    }
}
