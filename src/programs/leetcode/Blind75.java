package programs.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class Blind75 {
    public static void main(String[] args) {
        //int array[] = {2, 7, 11, 15};
       // int target = 9;
      /*  int[] result = twoSum(array, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution");
        }
*/
        //int[] prices ={7,1,5,3,6,4};
       // System.out.println(bestTimeToBuyStock(prices));

        // 3 contains duplicates
        //int[] nums={1,2,3,1};
        //System.out.println(containsDuplicate(nums));

        // 4 product of array itself
        /*int[] array = {1, 2, 3, 4};
        int[] result = productOfArrayExceptSelf(array);

        System.out.println("Product of Array Except Self:");
        for (int value : result) {
            System.out.print(value + " ");
        }*/

        // 5 Maximum Subarray
        //int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println(maxSubArray(nums));
       // System.out.println(maxSubArrayUsingMathMax(nums));


        //6 Maximum Product SubArray
        int nums[]={2,3,-2,4};
        System.out.println(maximumProductSubArray(nums));

        //7  Find Minimum in Rotated Sorted Array


        //8  Search in Rotated Sorted Array



    }

    private static int maximumProductSubArray(int[] nums) {
       int ans=Integer.MIN_VALUE;
       int leftToRight=1;
       int rightToLeft=1;
       for(int i=0;i<nums.length;i++){
           if(leftToRight==0) leftToRight=1;
           if(rightToLeft==0) rightToLeft=1;
           leftToRight = leftToRight * nums[i];
           rightToLeft= rightToLeft * nums[(nums.length-1) -i];
           ans=Math.max(Math.max(leftToRight,rightToLeft),ans);
       }
       return ans;
    }

    private static int maxSubArrayUsingMathMax(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i=0;i<nums.length;i++){
            maxEndingHere=maxEndingHere+nums[i];
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
            maxEndingHere=Math.max(maxEndingHere,0);
        }
        return maxSoFar;
    }

    private static int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }

    private static int[] productOfArrayExceptSelf(int[] array) {
        int n = array.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * array[i - 1];
        }
        int suffix = 1;
        for (int j = n - 1; j >= 0; j--) {
            ans[j] = ans[j] * suffix;
            suffix = suffix * array[j];
        }
        return ans;
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i])){
                return true;
            }else{
                hashSet.add(nums[i]);
            }
        }
        return false;
    }

    private static int bestTimeToBuyStock(int[] prices) {
        if (prices == null && prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                int profit=prices[i] - minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;

    }

    private static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (hashMap.containsKey(complement)) {
                return new int[]{hashMap.get(complement), i};
            }
            hashMap.put(array[i], i);
        }
        return new int[]{};
    }
}

