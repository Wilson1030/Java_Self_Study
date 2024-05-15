package 流程控制语句;

/* 
需求:
    键盘录入一个x
    如果x是一个回文整数, 打印true, 否则, 返回false
    解释:
        回文数是指正序和倒序读都是一样的整数
 */

import java.util.Scanner;

public class 循环结构leetcode算法竞赛题1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input integer x:");
        int x = sc.nextInt();
        int num = 0;
        int m = x;
        while (x != 0) {
            int ge = x % 10;
            x /= 10;
            num = num * 10 + ge;
        }
        if (num == m) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
