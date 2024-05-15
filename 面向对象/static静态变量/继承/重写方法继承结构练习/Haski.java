package static静态变量.继承.重写方法继承结构练习;

public class Haski extends Dog {
    @Override
    public void eat() {
        super.eat();
    }

    public void damageHouse() {
        System.out.println("拆家");
    }
}
