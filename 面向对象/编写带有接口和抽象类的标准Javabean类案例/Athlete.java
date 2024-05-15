package 编写带有接口和抽象类的标准Javabean类案例;

public abstract class Athlete extends Person{
    public Athlete() {}

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
