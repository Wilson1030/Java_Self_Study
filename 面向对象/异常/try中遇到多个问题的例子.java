package 异常;

public class try中遇到多个问题的例子 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界了");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("看看我执行了吗");
    }
}
