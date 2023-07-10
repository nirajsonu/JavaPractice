package leetcode.bitwise;

public class BitWiseOpearot {
    public static void main(String a[]){
        int x[]={10,20,30,40,30,20,40};
        getOneTimeElement(x);

        int number1=5;
        int number2=6;
        int min=number2&number1;
        System.out.println(min);
    }

    private static void getOneTimeElement(int[] x) {
        int ontimeRepeatedElement=0;
        for(int i=0;i<x.length;i++) {
            ontimeRepeatedElement = ontimeRepeatedElement ^ x[i];
        }
        System.out.println("one time Repeated Elements "+ontimeRepeatedElement);
    }
}
