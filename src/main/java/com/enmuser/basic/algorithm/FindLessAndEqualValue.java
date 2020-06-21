package com.enmuser.basic.algorithm;

public class FindLessAndEqualValue {

  public static void main(String[] args) {
    //
      System.out.println(findLessValue(new int[]{1,3,4,5,5,5,8,9,11,11,11,12,15,19},11));
  }

    public static int findLessValue(int[] arr,int value){

        int L = 0;
        int R = arr.length - 1;
        int index = -1;
        while(L <= R){
            int mid = L + ((R - L) >> 1);
            if(arr[mid]<=value){
                index = mid;
                L = mid + 1;
            }else{
                R = mid - 1;
            }

        }
        return index;
    }
}
