package 流程控制语句.循环高级;

/* 
需求:
    键盘录入一个大于等于2的整数x, 计算并返回x的平方根
    结果只保留整数部分, 小数部分将被舍去
 */

import java.util.Scanner;

public class 练习2leetcode算法竞赛题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int result = 0;
        while (!flag) {
            System.out.println("Please input a integer equal or bigger than 2:");
            int num = sc.nextInt();
            if (num < 2) {
                System.out.println("Do you want to continue(0) or quit(1)?");
                int answer = sc.nextInt();
                if (answer == 0) {
                    continue;
                } else if (answer == 1) {
                    break;
                } else {
                    System.out.println("Invalid input! System will automatically quit!");
                    break;
                }
            } else {
                flag = true;
                int i = 1;
                while (i <= num) {
                    if (((i + 1) * (i + 1) > num) && (i * i <= num)) {
                        result = i;
                        break;
                    }
                    i++;
                }
            }
            System.out.println("The square root of x is " + result);
        }
    }
}
