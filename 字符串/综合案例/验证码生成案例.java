package 综合案例;

import java.util.Random;

public class 验证码生成案例 {
    public static void main(String[] args) {
        /* 
        需求:
            生成验证码
            可以是小写字母, 也可以是大写字母, 还可以是数字
            规则:
                长度为5
                内容中是四位字母, 一位数字
                其中数字只有一位, 但是可以出现在任意的位置
         */
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char)(97 + i);
            } else {
                arr[i] = (char)(65 + i - 26);
            }
        }
        
        String str = "";
        
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(52);
            str += arr[num];
        }
        
        str += r.nextInt(10);
        
        char[] result = str.toCharArray();

        char temp = result[4];
        int num = r.nextInt(str.length() - 1);
        result[4] = result[num];
        result[num] = temp;

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }

        String code = sb.toString();
        System.out.println(code);
    }
}
