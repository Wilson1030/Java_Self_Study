package 构造方法例子;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Zhangsan", 23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
