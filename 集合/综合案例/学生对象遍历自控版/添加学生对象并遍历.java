package 集合.综合案例.学生对象遍历自控版;

import java.util.Scanner;
import java.util.ArrayList;

public class 添加学生对象并遍历 {
    public static void main(String[] args) {
        /* 需求:
            定义一个集合, 添加一些学生对象, 并进行遍历
            学生类的属性为: 姓名, 年龄 
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true) {
            Student s = new Student();
            System.out.println("请输入学生的姓名:");
            s.setName(sc.next());
            System.out.println("请输入学生的年龄:");
            s.setAge(sc.nextInt());
            list.add(s);
            System.out.println("继续录入学生信息请按1, 否则请按任意键退出");
            String answer = sc.next();
            if (!answer.equals("1")) {
                break;
            }
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i).getName() + ", " + list.get(i).getAge());
            } else {
                System.out.print(list.get(i).getName() + ", " + list.get(i).getAge() + "; ");
            }
        }
        System.out.println("]");
    }
}
