//需求: 键盘录入一个三位数, 将其拆分为个位、十位、百位后, 打印在控制台
import java.util.Scanner;

public class 算术运算符练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a three-digit number: ");
        int num = sc.nextInt();
        int num1 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num3 = num % 10;
        System.out.println("The units digit is:");
        System.out.println(num1);
        System.out.println("The ten digit is:");
        System.out.println(num2);
        System.out.println("The hundred digit is:");
        System.out.println(num3);
    }
}
