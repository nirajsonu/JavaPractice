package leetcode.Array;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String a[]){
        int x[]={3,2,4};
        int target=9;
        TwoSum twoSum=new TwoSum();
        twoSum.twoSum(x,target);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int outputArray[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                outputArray[1]=i;
                outputArray[0]=map.get(target-nums[i]);
                return outputArray;
            }
            map.put(nums[i],i);
        }
        return outputArray;
    }

}
