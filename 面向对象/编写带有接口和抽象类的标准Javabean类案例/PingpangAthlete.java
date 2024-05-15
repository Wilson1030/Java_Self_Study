package 编写带有接口和抽象类的标准Javabean类案例;

public class PingpangAthlete extends Athlete implements IMP{
    public PingpangAthlete() {}

    public PingpangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void toDo() {
        System.out.println("会讲英语");
    }
}
