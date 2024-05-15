package 流程控制语句.循环高级;

/* 
需求:
    键盘录入一个正整数x, 判断该整数是否为一个质数
 */

import java.util.Scanner;

public class 练习3leetcode算法竞赛题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input x:");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
