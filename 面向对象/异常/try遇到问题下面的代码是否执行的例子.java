package 异常;

public class try遇到问题下面的代码是否执行的例子 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            System.out.println(arr[10]);
            System.out.println("看看我执行了吗---try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }
        System.out.println("看看我执行了吗");
    }
}
