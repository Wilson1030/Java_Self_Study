package 流程控制语句;

/*
需求:
    键盘录入女婿的酒量, 如果大于2斤, 老丈人给出回应, 反之不回应
 */

import java.util.Scanner;

public class 分支结构1练习1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量:");
        int temp = sc.nextInt();
        if (temp > 2) {
            System.out.println("小伙子, 不错呦");
        }
    }
}
