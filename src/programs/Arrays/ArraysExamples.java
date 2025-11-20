package programs.Arrays;

import java.util.Arrays;
import java.util.*;

public class ArraysExamples {
    public static void main(String a[]) {
        // programs.Arrays class it is a utility class that would be helpful to sorting,merging,copy the elements of the arrays
        int arr[] = new int[10];
        arr[0] = 1;
        System.out.println(arr.length);

        //Copy Array with size
        int x1[] = Arrays.copyOf(arr, 12);
        x1[11] = 22;

        //to convert programs.Arrays to the string
        System.out.println(Arrays.toString(arr));

        //to sort elements
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i);
        }

        //binarySearch
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("BinarySerch " + Arrays.binarySearch(arr, 10));


        //arrays to set/list.....
        Set<Integer> hashSet = new HashSet<>();
        for (Integer in : arr) {
            hashSet.add(in);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.getClass().getName());

        List<Object> ArrayList = new ArrayList<>();
        for (Object obj : arr) {
            ArrayList.add(obj);
        }
        System.out.println(ArrayList);
        System.out.println(ArrayList.getClass().getName());

        //copyElementsOfTheArray();
        //   sumOftheElements();
        //  insertElementOftheArrays();
        //   checkDuplicateElementOrNot();
        // minElement();
        // leanearSearchWithFrequency();
        //  checkDuplicateElementOrNot();
        // evenOddElements();
        // bubbleSort();
        // checkDuplicateElementOrNot();
        //interSectionOfBothArrays(x,y);
        // uniounOfBothArrays(x,y);
        //checkDuplicates();

        int x[] = {10, 40, 13, 87};
        int element = 40;
        int moveZero[] = {1, 56, 4, 0, 4, 0, 5, 0};
        int arr1[] = {10, 45, 35, 18, 10, 40, 50, 40};
        int twoSumArr[] = {3, 6, 8, 3, 7};
        int target = 15;
        int kth[]={34,23,24,67,88,22};
        int k=2;

        deleteElementFromArray(x, element);
        searchElementInArray(x, element);
        moveZeroFromRight(moveZero);
        nthHigeshElementInArray(moveZero, element);
        duplicateInArray(arr1, element);
        pairofArray(x);
        twoSumProblem(twoSumArr, target);
        getSmallestNumberOfArray(kth,k);
        missingnumber();
        pallimdropNumber();
    }

    private static void pallimdropNumber() {
        int x=121;int r=0,sum=0;
        int temp=x;
        while (x>0){
            r=x%10;
            x=x/10;
            sum=(sum*10)+r;
        }
        if(temp==sum){
            System.out.println("Palimdrom Number");
        }
        else{
            System.out.println("Not a plaimdrom Number");
        }
        digitsOfSum(123);
    }

    private static void digitsOfSum(int x) {
        int sum=0,r=0;
        while (x>0){
            r=x%10;
            x=x/10;
            sum=sum+r;
        }
        System.out.println("Sum of digits of the number is "+sum);
    }

    public static void missingnumber(){
        int a[] ={-1,1,5};  // 0 2 3 4
        // step 1 convert -ve to +ve
        for(int i=0;i<a.length-1;i++) {
            if (a[i] < 0) a[i] = Math.abs(a[i]);
        }

        // find a max element
        int max = Arrays.stream(a).max().getAsInt();
        boolean[] present = new boolean[max +1];
        for(int num:a){
            present[num] = true;
        }
        for(int i=0;i<max;i++){
            if(!present[i]){
                System.out.println(i);
            }
        }
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


    private static void pairofArray(int[] x) {
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                System.out.println(x[i]+","+x[j]);
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

    private static void nthHigeshElementInArray(int[] moveZero, int element) {
        int nthHigesh =0;
        for (int i=0;i<moveZero.length;i++){
            if(moveZero[i]>element){
                nthHigesh = moveZero[i];
            }
        }
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

    public static void checkDuplicates(){
        int duplicateElementArray[] = {10,78,14,14,23,56,10,78,99,56,124};
        HashSet<Integer> duplicateElements = new HashSet<>();
        for(int i=0;i<duplicateElementArray.length;i++){
            for(int j=i+1;j<duplicateElementArray.length;j++){
                if(duplicateElementArray[i]==duplicateElementArray[j]){
                    duplicateElements.add(duplicateElementArray[i]);
                }
            }
        }
        for(Integer i:duplicateElements){
            System.out.println(i);
        }
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
        for (int j : arr1) {
            hashSet.add(j);
        }
        for (int j : arr2) {
            if (hashSet.contains(j)) {
                System.out.println(j);
            }

        }

    }

    private static void evenOddElements(){
        int[] arrayofElements ={10,20,30,45,50};
        for (int arrayofElement : arrayofElements) {
            if (arrayofElement % 2 == 0) {
                System.out.println("even elements -> " + arrayofElement);
            } else {
                System.out.println("Odd elemments -> " + arrayofElement);
            }
        }
    }

    private static void leanearSearchWithFrequency() {
        int[] arr ={10,12,13,45,67,89,22,22};
        int elementToSerch=22;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(elementToSerch==arr[i]){
                System.out.println("elements is found at "+i + " location");
                count=count+1;
            }
        }
        System.out.println("with frequency-->"+count);
    }

    private static void checkDuplicateElementOrNot() {
        int[] arr1 ={10,15,20,25,30,35,10,15};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<i;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println("duplicate elements are "+arr1[j]);
                }
            }
        }

    }

    private static void insertElementOftheArrays() {

    }

    private static void sumOftheElements() {
        int arr1[]=new int[3];
        int sum=0;
        System.out.println("Enter the elements the arrays");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scanner.nextInt();
        }
        System.out.println("The sum of the elements of the array");
        for (int j : arr1) {
            sum = sum + j;
        }
        System.out.println(sum);
    }

    private static void copyElementsOfTheArray() {
        int[] arr1 =new int[3];
        int[] arr2 =new int[3];
        System.out.println("Enter the element of 1st array elements");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the elements of 2nd array");
        for(int j=0;j<arr2.length;j++){
            arr2[j]=in.nextInt();
        }
        System.out.println("Element of 1st arrays are...");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+"");
        }

        System.out.println("Elements of 2nd arrays are..");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+" ");
        }

        System.out.println("Coping 1st array elements to the 2nd arrays elements");
        for(int z=0;z<arr1.length;z++){
            arr2[z]=arr1[z];
            System.out.println(arr2[z]+" ");
        }
    }

    public static void minElement(){
        int x[]={10,12,14,15};
        int min=x[0];
        int max=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<min){
                min=x[i];
            }
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println("max number\n"+max);
        System.out.println("min number\n "+min);
    }


    private static void getSmallestNumberOfArray(int[] x, int k) {
        Arrays.sort(x);
        int smallestElement=0;
        for(int i=0;i<x.length-1;i++){
            smallestElement=x[x.length-k];
        }
        System.out.println(smallestElement);
    }
    private static void bubbleSort(){
        int arrayOfElements[]={80,23,34,45,1,67,49};
        int temp=0;
        for(int i=0;i<arrayOfElements.length;i++){
            for(int j=0;i<i;j++){
                if(arrayOfElements[i]>arrayOfElements[i+1]){
                    temp=arrayOfElements[i];
                    arrayOfElements[j]=temp;
                    arrayOfElements[i]=temp;
                    System.out.println(arrayOfElements[i]);
                }

            }
        }

    }
}
