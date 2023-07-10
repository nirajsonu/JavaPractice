package Searching;


import java.util.Arrays;

public class SearchingExample {
    public static void main(String args []){
        int arr[]={10,20,34,11,2,33,55};
        int key=33;
        System.out.println("Using Binary Search");
        System.out.println("----------------");
        System.out.println(binarySearch(arr,key));
        linearSearch(arr,key);
        binarSerchByCollectionClass(arr,key);
    }

    private static Boolean linearSearch(int arr[],int key) {
        System.out.println("Using Linear Search");
        System.out.println("-----------------------");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("key "+key+" is found at " +i+" position");
                System.out.println("-----------------------");
                return true;
            }
        }
        System.out.println("element not present in the array");
        return false;
    }

    private static int binarySearch(int arr[],int key) {
        int mid=0;
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }

            //right
            if(arr[mid]<key){
                start=mid+1;
            }
            //left
            if(arr[mid]>key){
                end=mid-1;
            }
        }
        return -1;
        }


    private static void binarSerchByCollectionClass(int arr[],int key){
        System.out.println("Using Arrays class");
        System.out.println("-----------------------");
       System.out.println(Arrays.binarySearch(arr,key));
    }
}
