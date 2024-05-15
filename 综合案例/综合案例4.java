package 综合案例;

/* 
需求:
    把一个数组中的元素替换到另一个新数组去
 */

import java.util.Random; 
import java.util.Scanner;

public class 综合案例4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;    
        int num1 = r.nextInt(91) + 10;
        int num2 = r.nextInt(91) + 10;
        int[] arr1 = new int[num1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(100) + 1;
        }
        System.out.println("Please input a number you want to choose(<" + num1 + "):");
        int choice1 = sc.nextInt();
        if (choice1 < 0 || choice1 >= num1) {
            System.out.println("Invalid input! System will quit automatically.");
        }
        int[] arr2 = new int[num2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(100) + 1;
        }
        System.out.println("Please input a number you want to instead(<" + num2 + "):");
        int choice2 = sc.nextInt();
        if (choice2 < 0 || choice2 >= num2) {
            System.out.println("Invalid input! System will quit automatically.");
        }
        System.out.println("The first array is:");
        printArr(arr1);
        System.out.println();
        System.out.println("The second array is:");
        printArr(arr2);
        System.out.println();
        arr2[choice2] = arr1[choice1];
        System.out.println("After the operation, the second array exchange to:");
        printArr(arr2);
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
