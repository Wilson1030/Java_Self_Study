package 流程控制语句;

public class 循环结构1 {
    public static void main(String[] args) {
        /*
        for循环:
        for (初始化语句; 条件判断语句; 条件控制语句) {
            循环体语句;
        }
        执行流程:
            1. 执行初始化语句 (只执行一次)
            2. 执行条件判断语句, 看其结果是true还是false
                如果是false, 循环结束 
                如果是true, 执行循环体语句
            3. 执行条件控制语句
            4. 回到2继续执行条件判断语句
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World!");
        }
    }
}
