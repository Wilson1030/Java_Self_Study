package 流程控制语句.循环高级;

import java.util.Random;

public class 获取随机数 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        System.out.println(number);
        
        //用来生成任意的随机数 7 - 15
        //1.让这个范围头尾都减去一个值, 让这个范围从0开始  -7  0 - 8
        //2.尾巴 + 1,   8 + 1 = 9
        //3.最终的结果 + 第一步减去的值
        int test = r.nextInt(9) + 7;
        System.out.println(test);
    }
}
