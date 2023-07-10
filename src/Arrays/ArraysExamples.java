package Arrays;

import java.util.Arrays;
import java.util.*;

public class ArraysExamples {
    public static void main(String a[]){
       //copyElementsOfTheArray();
     //   sumOftheElements();
      //  insertElementOftheArrays();
     //   checkDuplicateElementOrNot();
        
        //Several's utility methods for arrays.
        //int [],byte[],char[]
        //Arrays.sort(primitive arrays)
        //Arrays.sort(object arrays)
        //Arrays.sort(object arrays,comparator c)

        //binarySearch()

        //Arrays to List
        //Arrays.asList()

       // minElement();
       // leanearSearchWithFrequency();
      //  checkDuplicateElementOrNot();

        evenOddElements();
        bubbleSort();

    }

    private static void evenOddElements(){
        int arrayofElements[]={10,20,30,45,50};
        for (int i=0;i<arrayofElements.length;i++){
            if(arrayofElements[i]%2==0){
                System.out.println("even elements -> "+arrayofElements[i]);
            }
            else {
                System.out.println("Odd elemments -> "+arrayofElements[i]);
            }
        }
    }

    private static void leanearSearchWithFrequency() {
        int arr[]={10,12,13,45,67,89,22,22};
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
        int arr1[]={10,15,20,25,30,35,10,15};
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
        for(int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        System.out.println(sum);
    }

    private static void copyElementsOfTheArray() {
        int arr1[]=new int[3];
        int arr2[]=new int[3];
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
