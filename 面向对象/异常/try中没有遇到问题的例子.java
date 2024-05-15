package 异常;

public class try中没有遇到问题的例子 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            System.out.println(arr[0]);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗");
    }
}
