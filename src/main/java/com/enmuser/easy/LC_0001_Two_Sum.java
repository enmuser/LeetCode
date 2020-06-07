package com.enmuser.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_0001_Two_Sum {

  public static void main(String[] args) {
    int[] nums = {-1,-2,-3,-4,-5};
    int[] sum = twoSum_hash(nums, -8);
    System.out.println(Arrays.toString(sum));
  }

    public static int[] twoSum(int[] nums, int target) {

    int[] reNums = new int[2];
    for (int i = 0; i < nums.length;i++) {
        if(target - nums[i] >= 0){
          for (int j = i + 1; j < nums.length; j++) {
              if(target -nums[i] - nums[j] < 0) continue;
              if((nums[i] + nums[j]) == target){
                  reNums[0] = i;
                  reNums[1] = j;
                  break;
              }
          }
        }
    }
      return reNums;

    }

    public static int[] twoSum_hash(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tempR = target - nums[i];
           if(map.containsKey(tempR)){
               return new int[]{map.get(tempR),i};
           }
           map.put(nums[i],i);
        }
        return null;
    }
}
