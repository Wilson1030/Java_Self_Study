package 数组;

public class 数组的遍历 {
    public static void main(String[] args) {
        /* 
        数组的遍历:
            将数组中所有的内容取出来, 取出来之后可以(打印, 求和, 判断....)  遍历是取出数据的过程
         */

         int[] arr = {1, 2, 3, 4, 5};
         for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
         }

         //在Java当中, 关于数组的一个长度属性length
         //调用方式: 数组名.length
         for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
         }
    }
}
