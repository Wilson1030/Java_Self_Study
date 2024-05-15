package 方法;

/* 
需求:
    设计一个方法求数组的最大值, 并将最大值返回
 */

import java.util.Scanner;

public class 方法练习10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        System.out.println("Please input your arr:");
        for (int i = 0; i < arr.length; i++) {
            double num = sc.nextDouble();
            arr[i] = num;
        }
        findBiggest(arr);
        System.out.println("The biggest number in array is " + findBiggest(arr));
    }
    public static double findBiggest(double[] arr) {
        double biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (biggest < arr[i]) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
