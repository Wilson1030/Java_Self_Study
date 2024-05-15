package 流程控制语句.循环高级;

/* 
需求:
    朋友聚会的时候可能会玩一个游戏: 逢七过
    游戏规则:
        从任意一个数字开始报数, 当你要报的数字是包含7或者是7的倍数的时候都要说过
    使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
 */

import java.util.Scanner;

public class 练习1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("Please input the number between 1 and 100:");
            int num = sc.nextInt();
            if (num <= 0 || num > 100) {
                System.out.println("Invalid input!");
            } else {
                flag = true;
                while (num <= 100) {
                    if (num % 7 == 0 || num % 10 == 7 || (num / 10) % 7 == 7) {
                        System.out.println("过");
                        num++;
                        continue;
                    } else {
                        System.out.println(num);
                        num++;
                    }
                }
            }
        }
    }
}
