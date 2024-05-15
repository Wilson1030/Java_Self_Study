package 集合.综合案例;

import java.util.Scanner;
import java.util.ArrayList;

public class 添加数字并遍历 {
    public static void main(String[] args) {
        /* 
        需求:
            定义一个集合, 添加数字, 并进行遍历
            遍历格式:
                [元素1, 元素2, 元素3]
        额外知识:
            基本数据类型对应的包装类:
                1. byte   Byte
                2. short   Short
                3. char   Character
                4. int   Integer
                5. long   Long
                6. float   Float
                7. boolean   Boolean
         */
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            System.out.println("请输入数字:");
            int input = sc.nextInt();
            list.add(input);
            System.out.println("继续输入请按1, 终止请按任意键");
            String answer = sc.next();
            if (!answer.equals("1")) {
                break;
            }
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
