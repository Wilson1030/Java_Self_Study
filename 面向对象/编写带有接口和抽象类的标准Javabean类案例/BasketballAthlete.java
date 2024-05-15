package 编写带有接口和抽象类的标准Javabean类案例;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {}

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }
}
