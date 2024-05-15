package 编写带有接口和抽象类的标准Javabean类案例;

public abstract class Coach extends Person{
    public Coach() {}

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void work();
}
