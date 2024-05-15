import java.util.Scanner;

public class 统计字符次数案例 {
    public static void main(String[] args) {
        /* 
        键盘录入一个字符串, 统计该字符串中大写字母字符, 小写字母字符, 数字字符出现的次数(不考虑其他字符)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = sc.next();
        int countBigCase = 0;
        int countSmallCase = 0;
        int countNum = 0;
        for (int i = 0;i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 48 && c <= 57) {
                countNum++;
            } else if (c >= 65 && c <= 90) {
                countBigCase++;
            } else if (c >= 97 && c <= 122) {
                countSmallCase++;
            }
        }
        System.out.println("大写字母个数是:" + countBigCase);
        System.out.println("小写字母个数是:" + countSmallCase);
        System.out.println("数字字符个数是:" + countNum);
    }
}
