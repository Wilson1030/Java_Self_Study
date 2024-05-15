/*
 需求:
     数字6是一个真正伟大的数字, 键盘录入两个整数
     如果其中一个为6, 最终输出true
     如果它们的和为6的倍数, 最终输出true
     否则都输出false
 */

import java.util.Scanner;

public class 斯坦福大学逻辑运算符练习 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int num1 = sc.nextInt();
        System.out.println("Please input the second number:");
        int num2 = sc.nextInt();
        boolean result = (num1 == 6 || num2 == 6) || ((num1 + num2) % 6 == 0);
        System.out.println(result);
    }
}
