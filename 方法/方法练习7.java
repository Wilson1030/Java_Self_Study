package 方法;

/* 
需求:
    定义一个方法, 求一家商场每个季度的营业额
    根据方法结果计算出全年营业额
 */

public class 方法练习7 {
    public static void main(String[] args) {
        int sum1 = getSum(10, 20 ,30);
        int sum2 = getSum(20, 20 ,40);
        int sum3 = getSum(30, 10, 50);
        int sum4 = getSum(30 , 30 ,35);
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }

    public static int getSum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
