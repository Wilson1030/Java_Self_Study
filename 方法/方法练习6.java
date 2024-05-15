package 方法;

/* 
需求:
    定义一个方法, 求圆的面积, 将结果在方法中打印
 */

import java.util.Scanner;

public class 方法练习6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the radius:");
        int radius = sc.nextInt();
        area(radius);
    }

    public static void area(int a) {
        double sum = 3.14 * a * a;
        System.out.println("The area is " + sum); 
    }
}
