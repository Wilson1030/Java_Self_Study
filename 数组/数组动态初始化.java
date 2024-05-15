package 数组;

public class 数组动态初始化 {
    public static void main(String[] args) {
        /* 
        动态初始化: 初始化时只指定数组长度, 由系统为数组分配初始值
        格式:
            数据类型[] 数组名 = new 数据类型[数组长度]
        范例:
            int[] arr = new int[3];
         */

         //定义一个数组, 用来存储班级中50个学生的姓名
         //姓名未知, 等学生报道之后, 再进行添加

         String[] arr = new String[50];
         //添加学生
         arr[0] = "zhangsan";
         arr[1] = "list";
         //获取
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);

         //数组默认初始化的规律
         //整数类型: 默认初始化值0
         //小数类型: 默认初始化值0.0
         //字符类型: 默认初始化值'/u0000'
         //布尔类型: 默认初始化值 false
         //引用数据类型: 默认初始化值 null

         int[] arr1 = new int[3];
         System.out.println(arr1[0]);
         System.out.println(arr1[1]);
         System.out.println(arr1[2]);
    }
}
