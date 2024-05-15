package 编写带有抽象类的标准Javabean类;

public class Frog extends Animals{
    public Frog() {};

    public Frog(String name, int age) {
        super("Frog", age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
