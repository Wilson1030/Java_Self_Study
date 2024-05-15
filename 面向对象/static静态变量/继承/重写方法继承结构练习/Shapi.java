package static静态变量.继承.重写方法继承结构练习;

public class Shapi extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
