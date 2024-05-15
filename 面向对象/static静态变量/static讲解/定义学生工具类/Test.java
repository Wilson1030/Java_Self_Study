package static静态变量.static讲解.定义学生工具类;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        Student s1 = new Student("zhangsan", 18, "Male");
        Student s2 = new Student("lisi", 19, "Female");
        Student s3 = new Student("wangwu", 29, "Male");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxStudentAge(list);
        System.out.println(maxAge);
    }
}
