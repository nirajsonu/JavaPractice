package algorithms;

import java.util.Arrays;


// TimSort (Quick sort + insertion sort)
public class Sorting {
    public static void main(String ars[]){
        int[] arr ={1,4,2,10,34,22,12};

        //// compare neighbour element Iterative Swapping o(n^ 2)
        bubbleSortAlgorithm(arr);


        selectionSortAlgorithm();
        insertionSort();
        countingSort();

        // Divide & Conquer   (nlogn) wrost case quicksort o(n^2)
        quickSort(arr);
        mergeSortArray(arr);   // wrost case and best case (nlogn);
    }

    private static void mergeSortArray(int arr[]) {

    }

    private static void quickSort(int arr[]) {

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
