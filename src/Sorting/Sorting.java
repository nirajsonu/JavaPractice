package Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String ars[]){
        int[] arr ={1,4,2,10,34,22,12};
        bubbleSortAlgorithm(arr);
        selectionSortAlgorithm();
        insertionSort();
        countingSort();
    }

    private static void countingSort() {
    }

    private static void insertionSort() {
    }

    private static void selectionSortAlgorithm() {
    }

    private static void bubbleSortAlgorithm(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j< (arr.length-1);j++){
                if(arr[j-1] >arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
