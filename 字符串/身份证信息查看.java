import java.util.Scanner;

public class 身份证信息查看 {
    public static void main(String[] args) {
        /* 
        根据已知身份证信息, 打印如下格式:
            人物信息为:
            出生年月日:
            性别:
        Ps: 1.第十七为奇数为男性, 偶数为女性
            2.七到十四位为出生年月日
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号:");
        String id = sc.next();
        if (id.length() != 18) {
            System.out.println("Invalid input!");
        } else {
            String year = id.substring(6, 10);
            String month = id.substring(10, 12);
            String date = id.substring(12, 14);
            char gender = id.charAt(16);
            System.out.println("人物信息:");
            if ((gender - 48) % 2 == 0) {
            System.out.println("出生年月日: " + year + "年" + month + "月" + date + "日");
            System.out.println("性别: 女");
            } else {
            System.out.println("出生年月日: " + year + "年" + month + "月" + date + "日");
            System.out.println("性别: 男");
            }
        }
        
    }
}
