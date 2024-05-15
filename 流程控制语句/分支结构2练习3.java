package 流程控制语句;

/*
需求:
    在实际开发中, 如果我们需要在多种情况下选择其中一个, 就可以使用switch语句
    当我们拨打了某些服务电话, 一般都会有按键功能
    假设现在我们拨打了一个机票预定电话
    电话中语音提示:
        1. 机票查询
        2. 机票预定
        3. 机票改签
        4. 退出服务
        其他按键也是退出服务, 请使用switch模拟该业务 
 */

import java.util.Scanner;

public class 分支结构2练习3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("机票查询请按1, 机票预订请按2, 机票改签请按3, 退出服务请按4");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            //case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }

        /*
        switch (choice) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
            default:
                System.out.println("退出服务");
                break;
        }
        */
    }
}
