package leetcode.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCodeArray {
    public static void main(String[] args) {
        containerWithMostWater();
        sortColors();
        maxProfileStock();
        majorityElements();
        plusOne();
        getpairsOfElement();
        twoSum();
        maximumProductSubArray();
        maxSubArrayUsingMathMax();
        maxSubArray();
        productOfArrayExceptSelf();
        containsDuplicate();
        findMedianSortedArrays();
    }

    public static double findMedianSortedArrays() {
        int nums1[] ={1,2};
        int nums2[] = {3};
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays();
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int left = 0, right = n1;
        while (left <= right) {
            int cut1 = (left + right) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                right = cut1 - 1;
            } else {
                left = cut1 + 1;
            }
        }
        return 0.0;
    }


    private static boolean containsDuplicate() {
        int[] nums = {2,4,5,6,7,8,2};
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

    private static int maxSubArray() {
        int nums[]={2,3,-2,4};
        int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }

    private static int[] productOfArrayExceptSelf() {
        int [] array = {2,3,-2,4};
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

    private static int maxSubArrayUsingMathMax() {
        int nums[]={2,3,-2,4};
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i=0;i<nums.length;i++){
            maxEndingHere=maxEndingHere+nums[i];
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
            maxEndingHere=Math.max(maxEndingHere,0);
        }
        return maxSoFar;
    }

    private static int maximumProductSubArray() {
        int nums[]={2,3,-2,4};
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

    private static int[] twoSum() {
        int array[] ={2,3,4,7,5};
        int target = 9;
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

    private static void majorityElements() {
        int element [] = {3,2,3};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<element.length;i++){
            map.put(element[i],map.getOrDefault(element[i],0) +1);
        }
    }

    private static void maxProfileStock() {
        int arr[]={7,1,5,3,6,4};
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
        System.out.println(maxProfit);
    }

    private static void containerWithMostWater() {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            // Use min, not max
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea); // Output: 49
    }


    private static void sortColors() {
        int nums [] = {2,0,2,1,1,0};
        int start =0;
        int mid=0;
        int end = nums.length-1;
        while (mid<=end){
            if(nums[mid] ==0){
                int temp =nums[start];
                nums[start] = nums[mid];
                nums[mid] =temp;
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }else{
                // swap
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] =temp;
                end--;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static int[] plusOne() {
        int digits[] = {9};
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits; // no carry, done
            }
            digits[i] = 0; // carry over
        }

        // if we reach here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; // e.g., 999 -> 1000
        return result;
    }

    private static void getpairsOfElement() {
        int a[] = {1, 3, 4, 5, 6};
        int n = a.length;
        int i = 0, j = 1;
        while (i < n - 1) {
            System.out.println(a[i] + " " + a[j]);
            j++;
            if (j == n) {
                i++;
                j = i + 1;  // reset j properly
            }
        }
    }
}


