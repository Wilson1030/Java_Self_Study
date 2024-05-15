package 综合案例;

/* 
需求:
    在唱歌比赛中, 有6名评委给选手打分, 分数范围是[0-100]之间的整数。
    选手最后的得分为:
        去掉最高分, 最低分后的4个评委的平均分, 请完成上述过程并计算出选手的得分
 */

import java.util.Random;

public class 综合案例5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mark = new int[6];
        for (int i = 0; i < mark.length; i++) {
            mark[i] = r.nextInt(101);
        }
        int max = mark[0];
        for (int i = 1; i < mark.length; i++) {
            if (mark[i] > max) {
                max = mark[i];
            }
        }
        int min = mark[0];
        for (int i = 1; i < mark.length; i++) {
            if (mark[i] < min) {
                min = mark[i];
            }
        }
        System.out.println("6位评委的评分如下:");
        printArr(mark);
        System.out.println();
        double finalMark = (mark[0] + mark[1] + mark[2] + mark[3] + mark[4] + mark[5] - min - max) / 4;
        System.out.println("最终得分为:");
        System.out.println(finalMark);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
