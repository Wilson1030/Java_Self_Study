import java.util.Scanner;

public class 用户登录案例 {
    public static void main(String[] args) {
        /* 
        需求:
            已知正确的用户名和密码, 请用程序实现模拟用户登录
            总共3次机会, 登录之后, 给出相应的提示
         */
        String userName = "Wilson";
        String password = "Wilson2005721";

        Scanner sc = new Scanner(System.in);

        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名:");
            String inputUserName = sc.next();
            System.out.println("请输入密码:");
            String inputPassword = sc.next();
            if (userName.equals(inputUserName) && password.equals(inputPassword)) {
                System.out.println("欢迎登录!");
                break;
            } else {
                if (i == 1) {
                    System.out.println("账户" + userName + "被锁定");
                } else {
                    System.out.println("用户名或密码错误! 您还剩下" + (i - 1) + "次机会");
                }
            }
        }
    }
}
