package 编写带有接口和抽象类的标准Javabean类案例;

public class PingpangCoach extends Coach implements IMP{
    public PingpangCoach() {}

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教学生打乒乓球");
    }

    @Override
    public void toDo() {
        System.out.println("会讲英语");
    }
}
