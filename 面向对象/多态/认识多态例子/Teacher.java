package 多态.认识多态例子;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息:" + getName() + ", " + getAge());
    }
}
