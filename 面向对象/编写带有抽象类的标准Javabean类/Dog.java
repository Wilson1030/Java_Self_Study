package 编写带有抽象类的标准Javabean类;

public class Dog extends Animals{
    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
