import java.util.Scanner;

public class 键盘录入练习 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("两数之和是：");
        System.out.println(num1 + num2);
    }
}
