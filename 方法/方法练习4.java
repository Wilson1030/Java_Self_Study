package 方法;

/* 
需求:
    定义一个方法, 在方法内部定义两个变量
    求出它们的和并进行打印
 */

import java.util.Scanner;

public class 方法练习4 {
    public static void main(String[] args) {
        getSum();
    }
    public static void getSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number:");
        int a = sc.nextInt();
        System.out.println("Please input another number:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    } 
}
