package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Demo {
    public static void main(String a[]){

        //way 1st
        i i=(x,y)->(x^y);
        i.m2();
        System.out.println(i.m1(10,20));

        //way 2nd
        i i1=Integer::sum;
        System.out.println(i1.m1(100,200));

        //Second largest element in java8
        int x[]={100,19,11,45,69,45};
        int y[]={100,45,1,32,31};
        String fruit[]={"Apple","Banana","Awacado"};


        //Find first element
        OptionalInt first = Arrays.stream(x).findFirst();

        //findAny
        OptionalInt last=Arrays.stream(x).findAny();
        System.out.println(first.getAsInt());
        System.out.println(last.getAsInt());
        Arrays.stream(x).distinct().forEach(System.out::print);
        System.out.println();
        fetchTheSammlestElement(x);
        commonElementofArray(x,y);
        reverseTheArray(x);
        lenghthLongestString(fruit);

        //groupBy()


        //anyMatch()
        //allMatch()

    }

    private static void lenghthLongestString(String[] fruit) {
        int i = Arrays.stream(fruit).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("longest fruit is "+i);
    }

    private static void reverseTheArray(int[] x) {
        IntStream.range(0,x.length/2).forEach(i->{
            int temp=x[i];
            x[i]=x[x.length-i -1];
            x[x.length-i-1]=temp;
        });

        System.out.println(Arrays.toString(x));
    }

    private static void commonElementofArray(int[] x, int[] y) {
        //boxed to wrapper to int
        List<Integer> l=Arrays.stream(x).filter(number->Arrays.stream(y).anyMatch(arr2number->arr2number==number)).boxed().collect(Collectors.toList());
        System.out.println(l);
    }

    private static void fetchTheSammlestElement(int[] x) {
        //skip to skip elements
       int secondSmallestElement = Arrays.stream(x).distinct().sorted().skip(0).findFirst().orElseThrow(()->new IllegalArgumentException("Element not found"));
       System.out.println("Second laregst element of the Stream "+ secondSmallestElement);
    }


    @FunctionalInterface
    public interface  i{
        int m1(int a,int b);

        default void  m2(){
            System.out.println("deafult method");
        }
    }
}
