package 数组;

public class 数组元素访问 {
    public static void main(String[] args) {
        /* 
        格式:
            数组名[索引];   索引: 也叫做下标, 角标
            索引的特点: 从0开始, 逐个+1, 连续不间断
        把数据存储到数组当中的格式:
            数组名[索引] = 具体数据/变量;
         */

         int[] arr = {1, 2, 3, 4, 5};
         int num = arr[0];
         System.out.println(num);
         System.out.println(arr[1]);
         arr[0] = 100;
         System.out.println(arr[0]);
    }
}
