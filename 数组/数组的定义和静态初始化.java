package 数组;

public class 数组的定义和静态初始化 {
    public static void main(String[] args) {
        /* 
        格式1:
            数据类型[] 数组名
        格式2:
            数据类型 数组名[]
        数组的初始化:
            就是在内存中, 为数组容器开辟空间, 并将数据存入容器中的过程
        数组的静态初始化:
            完整格式:
                数据类型[] 数组名 = new 数据类型[] {元素1, 元素2,.....};
            Example:
                int[] array = new int[]{11, 22, 33};
                double[] array2 = new double[]{11.1, 22.2, 33.3};
            简化格式:
                数据类型[] 数组名 = {元素1, 元素2,.....};
            Example:
                int[] array = {11, 22, 33};
                double[] array2 = {11.1, 22.2, 33.3};
         */

        //需求1: 定义数组存储5个学生的年龄
        int[] array0 = new int[]{18, 19, 17, 21, 20};
        int[] array1 = {18, 19, 17, 21, 20};
        
        //需求2: 定义数组存储3个学生的姓名
        String[] array2 = {"zhangsan", "lisi", "wangwu"};
        String[] array3 = new String[]{"zhangsan", "lisi", "wangwu"};

        //需求3: 定义数组存储4个学生的身高
        double[] array4 = {165.5, 178.4, 183.6, 158.9};
        double[] array5 = new double[]{165.5, 178.4, 183.6, 158.9};

        System.out.println(array5);   //[D@5caf905d

        /* 
        扩展:
            解释一下地址值的格式含义  [D@5caf905d
            [: 表示当前是一个数组
            D: 表示是double类型, I是int类型, 以此类推
            @: 间隔符号, 没有含义
            5caf905d: 才是数组的真正的地址值, (十六进制) 
            平常会习惯性的叫这个整体为数组的地址值
         */
    }
}
