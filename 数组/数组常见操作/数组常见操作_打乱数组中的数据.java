package 数组.数组常见操作;

/* 
需求:
    定义一个数组, 存入1-5, 要求打乱数组中所有数据的顺序
 */

import java.util.Random;

public class 数组常见操作_打乱数组中的数据 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
       }
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {        
            System.out.print(arr[i] + " ");
        }
    }
}
