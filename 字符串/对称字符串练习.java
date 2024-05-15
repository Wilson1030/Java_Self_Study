import java.util.Scanner;

public class 对称字符串练习 {
    public static void main(String[] args) {
        /*
        需求:
            键盘接受一个字符串, 程序判断出该字符串是否对称字符串, 并在控制台打印是或不是
         */
        Scanner sc = new Scanner(System.in);
        

        System.out.println("请输入一个字符串:");
        String input = sc.next();
        String result = new StringBuilder().append(input).reverse().toString();
        if (input.equals(result)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
