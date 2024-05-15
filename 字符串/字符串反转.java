import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        /* 
        需求:
            定义一个方法, 实现字符串的反转
            键盘录入一个字符串, 调用该方法后, 在控制台输出结果
            例如:
                键盘录入abc, 输出结果cba
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String input = sc.next();
        String output = Reversal(input);
        System.out.println(output);
    }

    public static String Reversal(String s) {
        String result = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            result = result + c;
        }
        return result;
    }
}
