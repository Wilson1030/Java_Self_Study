package 综合案例;

/* 
需求:
    某系统的数字密码(大于0), 比如1983, 采用加密方式进行传输
    规则如下:
        先得到每位数, 然后每位数都加上5, 再对10求余, 最后将所有数字反转, 得到一串新数
 */

import java.util.Scanner;

public class 综合案例6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the four-digit password:");
        int password = sc.nextInt();
        int[] save = new int[4];
        for (int i = 0; i < save.length; i++) {
            save[i] = password % 10;
            password /= 10;
        }
        for (int i = 0; i < save.length; i++) {
            save[i] += 5;
        }
        for (int i = 0; i < save.length; i++) {
            save[i] %= 10;
        }
        int result = 1000 * save[0] + 100 * save[1] + 10 * save[2] + save[3];
        System.out.println(result);
    }
}
