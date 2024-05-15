package 流程控制语句;

/*
需求:
    在实际开发中, 多种情况的判断中, 会用到if的第三种格式
    商场都会有VIP会员制, 根据不同的会员会有不同的折扣
    假设商品总价为1000元
    键盘录入会员级别, 并计算出实际支付的钱
    会员一级: 打九折
    会员二级: 打八折
    会员三级: 打七折
    非会员: 不打折
 */

 import java.util.Scanner;

public class 斯坦福大学分支结构1练习3 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("商品总价为1000元, 请输入您的会员等级:");
        int level = sc.nextInt();
        if (level == 1) {
            System.out.println("实际支付的价格为" + (price * 0.9));
        } else if (level == 2) {
            System.out.println("实际支付的价格为" + (price * 0.8));
        } else if (level == 3) {
            System.out.println("实际支付的价格为" + (price * 0.7));
        } else {
            System.out.println("实际支付的价格为" + price);
        }
    }
}
