package 综合案例;

/* 
需求:
    定义方法实现随机产生一个五位验证码
    验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字
 */

import java.util.Random;

public class 综合案例3 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] code = new char[52];
        for (int i = 0; i < code.length; i++) {
            if (i < 26) {
                code[i] = (char)(97 + i);
            } else {
                code[i] = (char)(65 + i - 26);
            }
        }
        char[] vert_code = new char[4];
        for (int i = 0; i < vert_code.length; i++) {
            int num = r.nextInt(52);
            vert_code[i] = code[num];
        }
        System.out.println("Your vertification code is:");
        for (int i = 0; i < vert_code.length; i++) {
            System.out.print(vert_code[i]);
        }
        System.out.print(r.nextInt(10));
    }
}
