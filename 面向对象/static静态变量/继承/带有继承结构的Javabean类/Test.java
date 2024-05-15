package static静态变量.继承.带有继承结构的Javabean类;

public class Test {
    public static void main(String[] args) {
        Manager mn = new Manager("12345678", "zhangsan", 5000, 1500);
        Cook cook = new Cook("23456", "lisi", 4000);

        mn.eat();
        mn.work();
        System.out.println(mn.getId() + ", " + mn.getManageBonus() + ", " + mn.getName() + ", " + mn.getSalary());

        cook.eat();
        cook.work();
        System.out.println(cook.getId() + ", " + cook.getName() + ", " + cook.getSalary());
    }
}
