package 编写带有接口和抽象类的标准Javabean类;

public class Dog extends Animals implements Swim{
    public Dog() {}

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
