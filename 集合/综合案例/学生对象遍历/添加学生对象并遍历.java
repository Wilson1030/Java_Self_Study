package 集合.综合案例.学生对象遍历;

import java.util.ArrayList;

public class 添加学生对象并遍历 {
    public static void main(String[] args) {
        /* 
        需求:
            定义一个集合, 添加一些学生对象, 并进行遍历
            学生类的属性为: 姓名, 年龄
         */
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        list.add(s1);
        list.add(s2);
        list.add(s3);

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
