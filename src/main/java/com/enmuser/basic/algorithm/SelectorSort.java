package com.enmuser.basic.algorithm;

import java.util.Arrays;
import java.util.jar.JarEntry;

public class SelectorSort {

  public static void main(String[] args) {

      System.out.println(Arrays.toString(selectSort(new int[]{3,2,5,8,91,75,12})));
  }

  public static int[] selectSort(int[] arr){

      for(int i = 0; i < arr.length - 1; i++){
          int index = i;
          for(int j = i + 1; j < arr.length; j++){
              if(arr[index] > arr[j])
              {
                  index = j;
              }
          }
          if(i == index) continue;
          swap(arr,i, index);
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
