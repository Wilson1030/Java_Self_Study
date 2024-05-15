package 方法;

/* 
需求:
    定义方法, 比较两个长方形的面积
 */


import java.util.Scanner;

public class 方法练习8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first length:");
        int len1 = sc.nextInt();
        System.out.println("Please input the first width:");
        int width1 = sc.nextInt();
        System.out.println("Please input the second length:");
        int len2 = sc.nextInt();
        System.out.println("Please input the second width:");
        int width2 = sc.nextInt();
        double area1 = getArea(len1, width1);
        double area2 = getArea(len2, width2);
        if (area1 == area2) {
            System.out.println("Equal");
        } else if (area1 > area2) {
            System.out.println("The first one is bigger than second one");
        } else {
            System.out.println("The second one is bigger than the first one");
        }
    }

    public static double getArea(int a, int b) {
        double area = a * b;
        return area;
    }
}
