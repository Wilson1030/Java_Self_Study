package 方法;

/* 
需求:
    定义一个方法copyOfRange(int[] arr, int from, int to)
功能:
    将数组arr中从索引from(包含from)开始, 到索引to(不包含to)结束的元素复制到新数组中, 将新数组返回
 */

import java.util.Random;
import java.util.Scanner;

public class 方法练习12 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(67) + 17;
            arr[i] = num;
        }
        System.out.println("Please input the start number(0 - 29):");
        int from = sc.nextInt();
        System.out.println("Please input the end number:");
        int to = sc.nextInt();
        if (to < from || from < 0 || from > 29) {
            System.out.println("Invalid input, the system will quit automatically!");
        } else {
            int[] copyArr = copyOfRange(arr, from, to);
            System.out.print("The origin array is: ");
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();
            System.out.print("The finall array is: ");
            System.out.print("[");
            for (int i = 0; i < copyArr.length; i++) {
                if (i == copyArr.length - 1) {
                    System.out.print(copyArr[i]);
                } else {
                    System.out.print(copyArr[i] + ", ");
                }
            }
            System.out.print("]");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] copyArr = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            copyArr[index] = arr[i];
            index++;
        }
        return copyArr;
    }
}
