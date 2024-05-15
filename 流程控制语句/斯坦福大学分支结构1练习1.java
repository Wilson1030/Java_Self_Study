package 流程控制语句;

import java.util.Scanner;

/*
需求:
    在实际开发中, 如果要根据两种不同的情况来执行不同的代码, 就需要用到if的第二种格式
    假设用户在超市实际购物商品总价为600元
    键盘录入一个整数表示用户实际支付的钱
    如果付款大于等于600, 表示付款成功, 否则付款失败
 */

public class 斯坦福大学分支结构1练习1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("总价格为600元, 请付款:");
        int money = sc.nextInt();
        if (money >= 600) {
            System.out.println("付款成功, 期待您下次光临!");
        } else {
            System.out.println("付款失败!");
        }
    }
}
