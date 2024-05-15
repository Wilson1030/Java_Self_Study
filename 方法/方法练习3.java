package 方法;

/* 
需求:
    看代码说结果2
 */

public class 方法练习3 {
   public static void main(String[] args) {
        System.out.println("a");
        method1();
        System.out.println("b");
   } 
   public static void method1() {
        method2();
        System.out.println("c");
   }
   public static void method2() {
        System.out.println("d");
        System.out.println("e");
   }
}
