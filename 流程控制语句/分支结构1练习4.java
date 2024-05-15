package 流程控制语句;

/*
需求:
    键盘录入一个整数, 表示身上的钱。
    如果大于等于100块, 就吃网红餐厅。
    否则, 就吃经济实惠的沙县小吃。
 */

import java.util.Scanner;

public class 分支结构1练习4 {
    public static void main(String[] args) {
        System.out.println("请输入身上的现金数:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("吃网红餐厅!");
        } else {
            System.out.println("吃沙县小吃!");
        }
    }
}
