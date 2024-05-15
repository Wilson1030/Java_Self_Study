package 数组.数组常见操作;

/*
需求:
    生成10个1 - 100之间的随机数存入数组
        1.求出所有数据的和
        2.求所有数据的平均数
        3.统计有多少个数据比平均值小
 */

import java.util.Random;

public class 数组常见操作_遍历数组求和 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            sum += arr[i];      
        }
        int average = sum / arr.length;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("所有数据的和: " + sum);
        System.out.println("所有数据的平均数: " + average);
        System.out.println("一共有" + count +"数据比平均数小");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
