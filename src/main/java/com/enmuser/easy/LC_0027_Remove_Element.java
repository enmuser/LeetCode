package com.enmuser.easy;

import java.util.Arrays;

public class LC_0027_Remove_Element {

  public static void main(String[] args) {
      int[] nums = {0,1,2,2,3,0,4,2};
      System.out.println(removeElement(nums,2));
      System.out.println(Arrays.toString(nums));
  }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int step = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                step++;
            }else{
                nums[i-step] = nums[i];
            }
        }

        return nums.length - step;
    }

}
