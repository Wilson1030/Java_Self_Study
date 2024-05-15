package 集合.综合案例.添加对象并判断是否存在返回索引;

import java.util.Scanner;
import java.util.ArrayList;

public class 添加对象并判断是否存在返回索引 {
    public static void main(String[] args) {
        /* 
        需求:
            键盘录入用户信息
                id, username, password
            要求:
                定义一个方法, 根据id查找对应的用户信息
                如果存在, 返回true
                如果不存在, 返回false
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>(); 

        while(true) {
            Student s = new Student();
            System.out.println("请输入ID:");
            s.setId(sc.next());
            System.out.println("请输入Username:");
            s.setUsername(sc.next());
            System.out.println("请输入Password:");
            s.setPassword(sc.next());
            list.add(s);
            System.out.println("继续输入请按1, 结束请按任意键");
            String str = sc.next();
            if (!str.equals("1")) {
                break;
                }
            }
            System.out.println("请选择您的操作(0-退出, 1-根据ID查询信息):");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("请输入想查询的ID:");
                    String id = sc.next();
                    int result = check(list, id);
                    System.out.println(result);
                    break;
                default:
                    break;
        }
    }

    public static int check(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
