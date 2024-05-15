package 综合案例;

/* 
需求:
    判断101 - 200之间有多少个质数, 并输出所有质数
 */

public class 综合案例2 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("当前范围中的质数有: ");
        for (int i = 100; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("一共有" + count + "个质数"); 
    }
}
