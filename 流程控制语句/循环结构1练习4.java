package 流程控制语句;

/* 
需求:
    在实际开发中, 如果要获取一个范围的每一个数据时, 也会用到循环
    比如: 求1-5之间的和
 */

public class 循环结构1练习4 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 1; i <= 5; i++){
            total += i;
        }
        System.out.println("1-5之间的和是" + total);
    }
}
