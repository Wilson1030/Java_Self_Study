package 集合.综合案例;

import java.util.ArrayList;
import java.util.Scanner;

public class 集合的遍历方式 {
    public static void main(String[] args) {
        /* 
        需求:
            定义一个集合, 添加字符串, 并进行遍历
            遍历格式:
                [元素1, 元素2, 元素3]
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true) {
            System.out.println("请添加一个字符串(如需终止请按0):");
            String input = sc.next();
            if (input.equals("0")) {
                break;
            } else {
                list.add(input);
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
