import java.util.Scanner;

public class 手机号屏蔽案例 {
    public static void main(String[] args) {
        /* 
        String substring(int beginIndex, int endIndex) 截取
        注意点: 包头不包尾, 包左不包右
        String substring(int beginIndex) 截取到末尾
        需求:
            屏蔽中间4位
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String phoneNumber = sc.next();
        if (phoneNumber.length() != 11) {
            System.out.println("Invalid input!");
        } else {
            String start = phoneNumber.substring(0, 3);
            String end = phoneNumber.substring(7);
            String result = start +"****"+ end;
            System.out.println(result);
        }
        
    }
}
