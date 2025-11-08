package Arrays;

import java.util.Arrays;


// in place
public class ArraysQuestions {
    public static void main(String[] args) {

        // find the 2nd largest element in an array
        int numbers[] = {90,15,9,80,7};
        int highest  = numbers[0];
        int smallest = numbers[0];
        int secondSmallest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if(numbers[i]<smallest){
                smallest = numbers[i];
                if(secondSmallest<smallest){
                    secondSmallest = smallest;
                }
            }
        }

        System.out.println("Highest number "+highest);
        System.out.println("Smallest number "+smallest);
        System.out.println("Second Smallest number "+secondSmallest);



        int x[] ={10,40,13,87};
        int element = 40;
        int moveZero [] ={1,56,4,0,4,0,5,0};
        int arr  [] = {10,45,35,18,10,40,50,40};
        int twoSumArr[] ={3,6,8,3,7};
        int target = 15;
        deleteElementFromArray(x,element);
        searchElementInArray(x,element);
        moveZeroFromRight(moveZero);
        nthHigeshElementInArray(moveZero,element);
        duplicateInArray(arr,element);
        pairofArray(x);
        twoSumProblem(twoSumArr,target);
        productOfArray(twoSumArr);
        
    }

    private static void productOfArray(int[] twoSumArr) {

    }

    private static void twoSumProblem(int[] twoSumArr, int target) {
        for(int i=0;i<twoSumArr.length-1;i++){
            if(twoSumArr[i] +twoSumArr[i+1] == target){
                System.out.println("match");
            }
        }
    }

    private static void duplicateInArray(int[] arr,int element) {
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==element){
                count = count +1;
            }
        }

        if(count>0){
            System.out.println("it is duplicate " + element +" count "+count);
        }
    }

    private static void pairofArray(int[] x) {
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                System.out.println(x[i]+","+x[j]);
            }
        }
    }

    private static void nthHigeshElementInArray(int[] moveZero, int element) {
        int nthHigesh =0;
        for (int i=0;i<moveZero.length;i++){
            if(moveZero[i]>element){
                nthHigesh = moveZero[i];
            }
        }
    }

    private static void moveZeroFromRight(int[] moveZero) {
        int index = 0; // Position to place the next non-zero element

        for (int i = 0; i < moveZero.length; i++) {
            if (moveZero[i] != 0) {
                // Swap only if i != index to avoid redundant operations
                if (i != index) {
                    int temp = moveZero[i];
                    moveZero[i] = moveZero[index];
                    moveZero[index] = temp;
                }
                index++;
            }
        }

        System.out.println(Arrays.toString(moveZero));
    }

    private static void searchElementInArray(int[] x, int element) {
        boolean isFound = false;
        int index = 0;
        for(int i=0;i<x.length;i++){
            if(x[i] == element){
                isFound = true;
                index = i;
                break;
            }
        }

        if(isFound){
            System.out.println("element found "+element +" with position "+index);
        }
    }

    private static void deleteElementFromArray(int[] x, int element) {
        int[] updatedArray = new int[x.length - 1];
        boolean found = false;
        int index = 0;

        for (int i = 0; i < x.length; i++) {
            if (!found && x[i] == element) {
                found = true;
                continue;
            }
            if (index < updatedArray.length) {
                updatedArray[index++] = x[i];
            }
        }

        if (found) {
            System.out.println("Updated Array: " + Arrays.toString(updatedArray));
        } else {
            System.out.println("Element not found in array.");
        }
    }

}
