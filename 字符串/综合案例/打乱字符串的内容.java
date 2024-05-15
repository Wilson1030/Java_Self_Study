package 综合案例;

import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class 打乱字符串的内容 {
    public static void main(String[] args) {
        /* 
        需求:
            键盘输入任意字符串, 打乱里面的内容
         */
        Scanner sc = new Scanner (System.in);
        Random r = new Random();
        StringJoiner sj = new StringJoiner(", ");
        StringBuilder sb = new StringBuilder();

        System.out.println(("请输入一个字符串:"));
        String input = sc.next();

        char[] arr = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            int num = r.nextInt(input.length());
            arr[i] = arr[num];
        }

        for (int i = 0; i < input.length(); i++) {
            sb.append(arr[i]);
        }
        sj.add(sb.toString());
        System.out.println(sj.toString());
    }
}
