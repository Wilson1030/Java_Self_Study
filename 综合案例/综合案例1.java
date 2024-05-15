package 综合案例;

/* 
需求:
    机票按照淡季旺季, 头等舱和经济舱收费, 输入机票原价, 月份和头等舱或经济舱
    按照如下规则计算机票价格:
        旺季(5-10月)头等舱9折, 经济舱8.5折
        淡季(11-来年4月)头等舱7折, 经济舱6.5折
 */

import java.util.Scanner;

public class 综合案例1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your ticket price:");
        double price = sc.nextDouble();
        System.out.println("Please input the ticket take off month:");
        int month = sc.nextInt();
        System.out.println("Please input your seat (first class input 1, economy class input 2):");
        int seat = sc.nextInt();
        if (month < 1 || month > 12 || (seat != 1 && seat != 2)) {
            System.out.println("Invaild input! System will quit automatically.");
        } else {
            price = calculate(price, month, seat);
            System.out.println("According to your input, the final ticket price is " + price);
        }
    }
    public static double calculate(double price, int month, int seat) {
        if (month <= 10 && month >= 5) {
            if (seat == 1) {
                return (0.9 * price);
            } else {
                return (0.85 * price);
            }
        } else {
            if (seat == 1) {
                return (0.7 * price);
            } else {
                return (0.65 * price);
            }
        }
    }
}
