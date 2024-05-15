package 流程控制语句.循环高级;

//在循环的过程中, 跳到其他语句上执行

public class 跳转控制语句 {
    public static void main(String[] args) {
        //1. 跳过某一次循环
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        //2. 结束整个循环
        for (int m = 1; m <= 5; m++) {
            if (m == 3) {
                break;
            }
            System.out.println(m); 
        }
    }
}
