public class 注释 {
    public static void main(String[] args) 
    {
        //输出HelloWorld
        System.out.println("HelloWorld");
        //求数组中的最大值
        int[] arr = {10, 20, 50, 70, 200, 90};
        int max = arr[0];
        for (int i = 0; i < arr.length; i ++) 
        {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
