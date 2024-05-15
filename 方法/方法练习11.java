package 方法;

import javax.crypto.spec.RC2ParameterSpec;

/* 
需求:
    定义一个方法判断数组中的某一个数是否存在, 将结果返回给调用处
 */

import java.util.Random;
import java.util.Scanner;

public class 方法练习11 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(20) + 1;
            arr[i] = num;
        }
        System.out.println("Please input a number that you want to check:");
        int checkNum = sc.nextInt();
        System.out.println("The check answer is " + check(arr, checkNum));
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
    public static boolean check(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}
