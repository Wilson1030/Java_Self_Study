import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        /* 
        需求:
            将阿拉伯数字的金额转换为大写七位金额
            例如:
                2135 转换为 零佰零拾零万贰仟壹佰叁拾伍元
         */
        Scanner sc = new Scanner(System.in);    
        System.out.println("请输入金额:");
        int money = sc.nextInt();
        String result = "";
        while(true) {
            int temp = money % 10;
            String capitalNum = getCapitalNumber(temp);
            money /= 10;
            result = capitalNum + result;
            if (money == 0) {
                break;
            }
        }
        int count = 7 - result.length();
        for (int i = 0; i < count; i++) {
            result = "零" + result;
        }
        getResult(result);
    }

    public static String getCapitalNumber(int a) {
        String[] set = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return set[a];
    }
    public static void getResult(String s) {
        String[] set = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String finalMoney = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            finalMoney = finalMoney + c + set[i];
        }
        System.out.println(finalMoney);
    }
}
