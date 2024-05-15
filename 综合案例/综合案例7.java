package 综合案例;


/* 
需求:
    将案例6中加密的数字进行解密
    加密方式:
         先得到每位数, 然后每位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数
 */

 import java.util.Scanner;

 public class 综合案例7 {
     public static void min(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[4];
         int password = sc.nextInt();
         for(int i = 0; i < arr.length; i++) {
             arr[i] = password % 10;
             password /= 10;
         }
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < 5) {
                 arr[i] += 10;
             }
             arr[i] -= 5;
         }
         int result = 1000 * arr[0] + 100 * arr[1] + 10 * arr[2] + arr[3];
     }
 }