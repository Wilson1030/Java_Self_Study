import java.util.Scanner;

public class 数值拆分案例 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a three-digit number: ");
        int num = sc.nextInt();
        int num1 = num % 10;
        num /= 10;
        int num2 = num % 10;
        num /= 10;
        int num3 = num % 10;
        System.out.println("The units digit is:" + num1);
        System.out.println("Please input a three-digit number: ");
        System.out.println("The ten digit is:" + num2);
        System.out.println("The hundred digit is:" + num3);
    }
}
