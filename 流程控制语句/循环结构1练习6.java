package 流程控制语句;

/* 
需求:
    键盘录入两个数字, 表示一个范围
    统计这个范围中:
        既能被3整除, 又能被5整除的数字有多少个
 */

import java.util.Scanner;

public class 循环结构1练习6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始值:");
        int start = sc.nextInt();
        System.out.println("请输入终止值:");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println("一共有" + count + "个数字符合要求");
    }
}
