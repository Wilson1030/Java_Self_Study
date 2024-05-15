package 多态.认识多态例子;

public class Adminstrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息:" + getName() + ", " + getAge());
    }
}
