package 方法;

import java.util.Scanner;

/* 
需求:
    定义一个方法, 求长方形的周长, 将结果在方法中打印
 */

public class 方法练习5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the length:");
        int num1 = sc.nextInt();
        System.out.println("Please input the width:");
        int num2 = sc.nextInt();
        perimeter(num1, num2);
    }

    public static void perimeter(int num1, int num2) {
        int sum = 2 * num1 + 2 * num2;
        System.out.println("The perimeter is " + sum);
    }
}
