package com.enmuser.basic.algorithm;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    //

      System.out.println(Arrays.toString(bubbleSort(new int[]{3,2,5,8,91,75,12})));

  }


  public static int[] bubbleSort(int[] arr){
      for(int i = arr.length - 1; i > 0; i--){
          for(int j = 0; j < i; j++){
              if(arr[j] > arr[j+1]) swap(arr,j,j+1);
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
