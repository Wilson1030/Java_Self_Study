import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        /* 
        ==比较的是数值或地址值
        字符串比较的两种方法:
        1. boolean equals(要比较的字符串)方法
            完全一样为true, 否则为false
        2. boolean equalsIgnoreCase(要比较的字符串)方法
            忽略大小写的比较
         */
        Scanner sc = new Scanner(System.in);
        String s1 = new String("abc");
        String s2 = new String("ABC");
        boolean result1 = s1.equals(s2);
        System.out.println(result1);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("请输入一个字符串:");
        String str1 = sc.next();
        String str2 = "Wilson";
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
