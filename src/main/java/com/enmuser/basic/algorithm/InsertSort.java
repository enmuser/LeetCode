package com.enmuser.basic.algorithm;

import java.util.Arrays;

public class InsertSort {

  public static void main(String[] args) {
    //
      System.out.println(Arrays.toString(insertSort(new int[]{3,2,5,8,91,75,12})));
  }

  public static int[] insertSort(int[] arr){

      for (int i = 1; i < arr.length; i++){

          for(int j = i; j - 1>= 0&&arr[j-1]>arr[j]; j--){
              swap(arr,j-1,j);
          }
      }

      return arr;
  }

    public static void swap(int[] arr,int i,int j){
//      arr[i] = arr[i] ^ arr[j];
//      arr[j] = arr[i] ^ arr[j];
//      arr[i] = arr[i] ^ arr[j];
//      int tmp = arr[i];
//      arr[i] = arr[j];
//      arr[j] = tmp;

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
