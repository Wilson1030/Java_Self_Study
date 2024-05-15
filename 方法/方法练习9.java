package 方法;

/* 
需求:
    设计一个方法用于遍历数组, 要求遍历的结果是在一行上的, 结果: [11, 22, 33, 44, 55]
 */

public class 方法练习9 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
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
