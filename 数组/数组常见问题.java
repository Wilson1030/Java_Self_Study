package 数组;

public class 数组常见问题 {
    public static void main(String[] args) {
        /* 
        当访问了数组中不存在的索引, 就会引发索引越界异常
         */

         //定义一个数组
         int[] arr = {1, 2, 3, 4, 5};
         //长度5
         //最小索引0
         //最大索引4
         System.out.println(arr[2]);

         //小结
         //索引越界异常
         //原因: 索引的范围
         //避免: 索引的范围
            //最小索引: 0
            //最大索引: 数组长度-1 
    }
}
