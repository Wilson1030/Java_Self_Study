package 编写带有接口和抽象类的标准Javabean类案例;

public class BasketballCoach extends Coach{
    public BasketballCoach() {}

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教学生打篮球");
    }
}
