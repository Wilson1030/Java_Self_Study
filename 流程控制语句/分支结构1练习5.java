package 流程控制语句;

/*
需求:
    根据不同的分数送不同的礼物
    如果是95-100分, 送自行车一辆
    如果是90-94分, 游乐场玩一天
    如果是80-89分, 送变形金刚一个
    如果是80分以下, 揍一顿
 */

import java.util.Scanner;

public class 分支结构1练习5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your grade:");
        int grade = sc.nextInt();
        if(grade <= 100 && grade >= 95) {
            System.out.println("Send you a bike");
        } else if (grade <= 94 && grade >= 90) {
            System.out.println("A day at the amusement Park");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("Send you a Transformer");
        } else if (grade >= 0 && grade < 80) {
            System.out.println("Take a beating");
        } else {
            System.out.println("Invalid grade!");
        }
    }
}
