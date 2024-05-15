package static静态变量.static讲解;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(18);
        s1.setGender("Male");
        Student.teacherName = "阿伟老师";
        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(19);
        s2.setGender("Female");
        s2.study();
        s2.show();
    }
}
