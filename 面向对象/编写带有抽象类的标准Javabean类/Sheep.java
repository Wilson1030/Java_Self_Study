package 编写带有抽象类的标准Javabean类;

public class Sheep extends Animals{
    public Sheep() {}

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
