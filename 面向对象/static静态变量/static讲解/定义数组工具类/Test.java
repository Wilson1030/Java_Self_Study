package static静态变量.static讲解.定义数组工具类;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {10, 20 , 50 , 34, 100};
        double[] arr2 = {1.5, 3.7, 4.9, 5.8, 6.6};

        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double result = ArrayUtil.getAverage(arr2);
        System.out.println(result);
    }
}
