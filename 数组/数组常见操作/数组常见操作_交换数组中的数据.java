package 数组.数组常见操作;

/* 
需求:
    定义一个数组, 存入1, 2, 3, 4, 5。按照要求交换索引对应的元素
    交换前: 1, 2, 3, 4, 5
    交换后: 5, 4, 3, 2, 1
 */

public class 数组常见操作_交换数组中的数据 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
