package 综合案例;

import java.util.Scanner;

public class 调整字符串案例 {
    public static void main(String[] args) {
        /* 
        需求:
            给定两个字符串, A和B
            A的旋转操作就是将A最左边的字符移动到最右边
            例如:
                若A = 'abcde', 在移动一次之后结果就是'bcdea'
            如果在若干次调整操作之后, A能变成B, 那么返回True
            如果不能匹配, 则返回false
         */
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            System.out.println("请输入第一个字符串:");
            String input1 = sc.next(); 
            System.out.println("请输入第二个字符串:");
            String input2 = sc.next();
            if (input1.length() == input2.length()) {
                flag = false;
                 System.out.println(check(input1, input2));
            } else {
                System.out.println("请确保两次输入的字符串长度相同!");
                System.out.println("如需重新尝试, 请按1; 否则请按任意键");
                String input3 = sc.next();
                if (!input3.equals("1")) {
                    break;
                }
            }
        }
    }

    public static String convert(String s) {
        String str1 = s.substring(0, 1);
        String str2 = s.substring(1);
        return str2 + str1;
    }

    public static boolean check(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str1 = convert(str1);
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
