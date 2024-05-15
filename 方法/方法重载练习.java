package 方法;

public class 方法重载练习 {
    public static void main(String[] args) {
        compare(10, 20);
    }
    public static void compare(byte a1, byte a2) {
        if (a1 < a2) {
            System.out.println(a1 + "<" + a2);
        } else if (a1 > a2) {
            System.out.println(a1 + ">" + a2);
        } else {
            System.out.println(a1 + "=" + a2);
        }
    }
    public static void compare(int a3, int a4) {
        if (a3 < a4) {
            System.out.println(a3 + "<" + a4);
        } else if (a3 > a4) {
            System.out.println(a3 + ">" + a4);
        } else {
            System.out.println(a3 + "=" + a4);
        }
    }
    public static void compare(short a5, short a6) {
        if (a5 < a6) {
            System.out.println(a5 + "<" + a6);
        } else if (a5 > a6) {
            System.out.println(a5 + ">" + a6);
        } else {
            System.out.println(a5 + "=" + a6);
        }
    }
    public static void compare(long a7, long a8) {
        if (a7 < a8) {
            System.out.println(a7 + "<" + a8);
        } else if (a7 > a8) {
            System.out.println(a7 + ">" + a8);
        } else {
            System.out.println(a7 + "=" + a8);
        }
    }
}
