package 多态.认识多态例子;

public class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生的信息:" + getName() + ", " + getAge());
    }
}
