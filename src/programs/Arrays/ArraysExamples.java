package programs.Arrays;

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
        //programs.Arrays.sort(primitive arrays)
        //programs.Arrays.sort(object arrays)
        //programs.Arrays.sort(object arrays,comparator c)

        //binarySearch()

        //programs.Arrays to List
        //programs.Arrays.asList()

       // minElement();
       // leanearSearchWithFrequency();
      //  checkDuplicateElementOrNot();

       // evenOddElements();
       // bubbleSort();

        // Negative Array Size
        //int arr1[] = new int[-1];

        int[] x ={20,50,30,40};
        int[] y ={20,5,70,80};

        Object o = new Object();
        //Number number = new Integer(programs.String.valueOf(1));

        // programs.Arrays class it is a utility class that would be helpful to sorting,merging,copy the elements of the arrays
        int arr[]=new int[10];
        arr[0]=1;
        arr[1]=10;
        arr[2]=3;
        arr[4]=5;
        arr[5]=11;
        System.out.println(arr.length);

        //Copy Array with size
        int x1[]= Arrays.copyOf(arr, 12);
        x1[11]=22;

        //to convert programs.Arrays to the string
        System.out.println(Arrays.toString(arr));

        //to sort elements
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i);
        }

        //to sort by comparator
        /*programs.Arrays.sort(arr, new Comparator<>() {
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
        Set<Integer> hashSet=new HashSet<>();
        for(Integer in:arr){
            hashSet.add(in);
        }
        System.out.println(hashSet);
        System.out.println(hashSet.getClass().getName());

        List<Object> ArrayList=new ArrayList<>();
        for(Object obj:arr){
            ArrayList.add(obj);
        }
        System.out.println(ArrayList);
        System.out.println(ArrayList.getClass().getName());

        int []newArr=new int[2];
        newArr[0]=100;
        newArr[1]=101;

        Integer maxValue=Integer.MAX_VALUE;
        Integer minValue=Integer.MIN_VALUE;

        checkDuplicateElementOrNot();
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
