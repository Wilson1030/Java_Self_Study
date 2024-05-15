package 综合案例;

import java.util.Scanner;

public class 返回最后一个单词的长度案例 {
    public static void main(String[] args) {
        /* 
        需求:
            键盘录入一个字符串s, 由若干个单词组成, 单词前后用一些空格字符隔开
            返回字符串中最后一个单词的长度
            单词是指, 仅有字母组成, 不包含任何空格字符的最大子字符串
            示例:
                输入: s = "Hello World"  输出: 5
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        String input = sc.nextLine();

        int count = 0;
        for (int i = input.length() - 1; i > 0; i--) {
            char c = input.charAt(i);
            if (c ==' ') {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
