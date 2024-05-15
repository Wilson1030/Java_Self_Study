package 流程控制语句;

/*
需求:
    键盘录入星期数, 输出工作日、休息日
    (1-5)工作日, (6-7休息日)
 */

import java.util.Scanner;

public class 分支结构2练习2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数:");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入的星期错误");
        }
        /*
        switch穿透:
            switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入的星期错误");
        }
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入的星期错误");*/
    }
}
