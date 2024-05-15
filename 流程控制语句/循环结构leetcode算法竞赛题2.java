package 流程控制语句;

/* 
需求:
    给定两个整数, 被除数和除数(都是正数, 且不超过int的范围)
    将两数相除, 要求不使用乘法、除法和%运算符
    得到商和余数
 */

import java.util.Scanner;

public class 循环结构leetcode算法竞赛题2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Please input the divident(positive):");
            int dividend = sc.nextInt();
            System.out.println("Please input the divisor(positive):");
            int divisor = sc.nextInt();
            if (dividend < 0 || divisor <= 0) {
                System.out.println("Invalid input! Please input again");
            } else {
                int count = 0;
                int remainder = dividend;
                while (remainder >= divisor) {
                    remainder -= divisor;
                    count++;
                }
                System.out.println("The result is " + count + ", the remainder is " + remainder);
                flag = true;
            }
        }
    }
}
