/*
 需求:
     动物园里有两只老虎, 体重分别为通过键盘录入获得
     请用程序实现判断两只老虎的体重是否相同
 */

 import java.util.Scanner;

public class 三元运算符练习1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please input first tiger's weight(kg):");
      int weight1 = sc.nextInt();
      System.out.println("Please input second tiger's weight(kg):");
      int weight2 = sc.nextInt();
      String result = weight1 == weight2 ? "相同" : "不同";
      System.out.println(result);
    }
}
