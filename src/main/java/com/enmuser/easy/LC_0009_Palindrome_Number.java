package com.enmuser.easy;

public class LC_0009_Palindrome_Number {

  public static void main(String[] args) {
      System.out.println(isPalindrome_Double_Direction(-121));
  }

    //根据0007 Reverse_integer的经验 讲整数逆序与原整数比较大小
    public static boolean isPalindrome(int x) {
      //多加判读减少执行时间
      if( x < 0) return false;
      if( x < 10) return true;
      if (x % 10 == 0) return false;

      int n = 0,init = x;
      while(x != 0){
          n = n * 10 + x % 10;
          x = x / 10;
      }

      return init == n;
    }

    //回文序列检查
    public static boolean isPalindrome_Double_Direction(int x) {
        if( x < 0){
            return false;
        }
        char[] ArrX = String.valueOf(x).toCharArray();
        int middleIndex = ArrX.length / 2 - 1;
        for(int i = 0; i <= middleIndex;i++){
            if(ArrX[i] != ArrX[ArrX.length-1-i])
                return false;
        }
        return true;
    }
}
