package 流程控制语句.循环高级;

/* 
需求:
    程序自动生成1-100之间的一个随机数, 实用程序猜出数字
 */

import java.util.Random;
import java.util.Scanner;

public class 练习4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int num = r.nextInt(100) + 1;
        int count = 0;
        while(flag) {
            System.out.println("Please input your guess number:");
            int guess = sc.nextInt();
            if (guess == num) {
                System.out.println("Congratulation!");
                flag = false;
            } else if (guess < num) {
                System.out.println("Small");
            } else {
                System.out.println("Big");
            }
            count++;
            if (count >= 6) {
                System.out.println("The correct number is " + num);
                flag = false;
            }
        }
    }
}
