/* 
需求:
    您和您的约会对象在餐厅里面正在约会
    键盘录入两个整数, 表示你和你约会对象衣服的时髦度。(手动录入0-10之间的整数, 不能录其他)
    如果你是时髦度大于你对象的时髦度, 相亲就成功, 输出true。
    否则输出false。
*/

import java.util.Scanner;

public class 斯坦福大学比较运算符练习 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己的时髦度(1-10):");
        int a = sc.nextInt();
        System.out.println("请输入对象的时髦度(1-10):");
        int b = sc.nextInt();
        System.out.println(a > b);
    }
}
