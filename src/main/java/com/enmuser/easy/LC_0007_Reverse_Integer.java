package com.enmuser.easy;

public class LC_0007_Reverse_Integer {

  public static void main(String[] args) {

      System.out.println(reverse_plus(-123));

  }


    // 数字转字符数组 ===>倒叙，再转数字
    public static int reverse(int x) {

      String strX = "";
      boolean flag = false;
      if(x < 0){
          x = -x;
          flag = true;
      }

        strX += x;
        char[] ArrX = strX.toCharArray();
        strX = "";
        for (int i = ArrX.length-1; i >=0; i--){
            strX += ArrX[i];
        }

        try{
            return  flag? -Integer.parseInt(strX):Integer.parseInt(strX);
        }catch (NumberFormatException e){
            return 0;
        }
    }

    //纯数字游戏  倒着数数
    public static int reverse_plus(int x) {

      long n = 0;
      while (x!=0){
          n = n * 10 + x%10;
          x = x / 10;
      }
      return (int)n == n? (int) n : 0;

    }
}
