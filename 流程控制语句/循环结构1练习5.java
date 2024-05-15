package 流程控制语句;

/* 
需求:
    在实际开发中, 如果要获取一个范围中的每一个数据时, 会用到循环
    但是此时, 大多数情况下, 不会获取所有的数据, 而是获取其中符合要求的数据
    此时就需要循环和其他语句结合使用了
    求1-100之间的偶数和
 */

public class 循环结构1练习5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-100之间的偶数和是" + sum);
    }
}
