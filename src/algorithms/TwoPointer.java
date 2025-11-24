package algorithms;

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        int start =0;
        int end = arr.length -1;
        while (start<=end){
            if(start == end){
                System.out.println(arr[start]);
            }else{
                System.out.println(arr[start]);
                System.out.println(arr[end]);
            }
            start++;
            end--;
        }
    }
}
