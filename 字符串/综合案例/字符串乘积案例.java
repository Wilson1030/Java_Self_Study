package 综合案例;

import java.util.Scanner;

public class 字符串乘积案例 {
    public static void main(String[] args) {
        /* 
        需求:
            给定两个以字符串形式表示的非负整数num1, num2, 返回num1和num2的乘积, 它们的乘积也表示为字符串的形式
        Ps: 不需要考虑乘积过大的结果
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("请输入第一个字符串非负整数:");
        String input1 = sc.next();
        System.out.println("请输入第二个字符串非负整数:");
        String input2 = sc.next();

        int result1 = 0;
        for (int i = 0; i < input1.length(); i++) {
            char c = input1.charAt(i);
            int num = ((int) c) - 48;
            result1 = 10 * result1 + num;
        }

        int result2 = 0;
        for (int i = 0; i < input2.length(); i++) {
            char c = input2.charAt(i);
            int num = ((int) c) - 48;
            result2 = 10 * result2 + num;
        }

        int result = result1 * result2;
        System.out.println(sb.append(result).toString());
    }
}
