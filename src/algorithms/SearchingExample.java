package algorithms;

import java.util.Arrays;

public class SearchingExample {
    public static void main(String a[]){
        int nums[]={10,23,8,34,12,45};
        int number=34;
        //System.out.println(leanearSearch(nums,number));
        Arrays.sort(nums);
       System.out.println(binarySearchAlgo(nums,number));
    }

    //only for sorted array
    private static int binarySearchAlgo(int[] nums, int number) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == number) {
                return mid;
            } else if (nums[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    private static int leanearSearch(int[] nums, int number) {
        for(int i=0;i<nums.length;i++){
            if(number==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
