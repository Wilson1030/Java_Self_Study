package 流程控制语句;

import java.util.Scanner;

/*
需求:
    在实际开发中, 电影院的选座也会使用到if判断
    假设某影院售卖了100张票, 票的序号为1-100
    其中奇数票号坐在左侧, 偶数票号坐在右侧
    键盘录入一个整数表示电影票的票号
    根据不同的情况, 给出不同的提示:
        如果票号为奇数, 那么打印坐左边
        如果票号为偶数, 那么打印坐右边
 */

public class 斯坦福大学分支结构1练习2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的票号:");
        int number = sc.nextInt();
        if (number >= 1 && number <= 100) {
            if (number % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        } else {
            System.out.println("您的票号无效!");
        }
        
    }
}
