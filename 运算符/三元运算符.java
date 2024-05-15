import java.util.Scanner;

public class 三元运算符 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int num1 = sc.nextInt();
        System.out.println("Please input the second number:");
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
