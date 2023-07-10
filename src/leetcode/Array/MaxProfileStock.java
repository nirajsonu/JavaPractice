package leetcode.Array;

public class MaxProfileStock {
    public static void main(String a[]){
        int arr[]={7,1,5,3,6,4};
       System.out.println( calculateProfit(arr));
    }

    private static  int calculateProfit(int arr[]){
        int buy_price=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(buy_price < arr[i]){
                int profile=arr[i]-buy_price;
                maxProfit=Math.max(maxProfit,profile);
            }else{
                buy_price=arr[i];
            }
        }
        return maxProfit;
    }
}
