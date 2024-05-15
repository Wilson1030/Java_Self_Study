package 综合案例;

import java.util.Scanner;

public class 转换罗马数字案例 {
    public static void main(String[] args) {
        /* 
        需求:
            键盘录入一个字符串
            要求1:
                长度为小于等于9
            要求2:
                只能是数字
            将内容转变为罗马数字
            下面是阿拉伯数字跟罗马数字的对比关系:
                Ⅰ - 1, Ⅱ - 2, Ⅲ - 3, Ⅳ - 4, Ⅴ - 5, Ⅵ - 6, Ⅶ - 7, Ⅷ - 8, Ⅸ - 9
            注意点:
                1. 罗马数字没有0;
                2。 如果录入的数字包含0, 可以转变成" "
         */
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        System.out.println("请输入一个字符串:");
        String input = sc.next();

        if (input.length() > 9) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int num = c - 48;
                String str = changeToRoman(num);
                sb.append(str);
            }
            System.out.println(sb.toString());
        }
    }

    public static String changeToRoman(int num) {
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[num];
    }
}
