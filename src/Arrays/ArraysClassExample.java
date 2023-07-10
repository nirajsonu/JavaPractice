package Arrays;

import java.util.*;

public class ArraysClassExample {
    public static void main(String args[]){
       // Arrays class it is a utility class that would be helpful to sorting,merging,copy the elements of the arrays
        int arr[]=new int[10];
        arr[0]=1;
        arr[1]=10;
        arr[2]=3;
        arr[4]=5;
        arr[5]=11;
        System.out.println(arr.length);

        //Copy Array with size
        int x[]= Arrays.copyOf(arr, 12);
        x[11]=22;

        //to convert Arrays to the string
        System.out.println(Arrays.toString(arr));

       //to sort elements
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i);
        }

        //to sort by comparator
        /*Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });*/

        //binarySearch
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("BinarySerch "+Arrays.binarySearch(arr,10));


        //arrays to set/list.....
        Set hashSet=new HashSet();
        for(Object o:arr){
            hashSet.add(o);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.getClass().getName());

        List ArrayList=new ArrayList();
        for(Object o:arr){
            ArrayList.add(o);
        }
        System.out.println(ArrayList);
        System.out.println(ArrayList.getClass().getName());

        int newArr[]=new int[2];
        newArr[0]=100;
        newArr[1]=101;

        Integer maxValue=Integer.MAX_VALUE;
        Integer minValue=Integer.MIN_VALUE;
    }
}
