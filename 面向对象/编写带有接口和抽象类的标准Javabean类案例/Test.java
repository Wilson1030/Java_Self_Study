package 编写带有接口和抽象类的标准Javabean类案例;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("老谭", 39);
        PingpangAthlete pa = new PingpangAthlete("小马", 19);
        BasketballAthlete ba = new BasketballAthlete("小库", 20);
        PingpangCoach pc = new PingpangCoach("老刘", 41);

        System.out.println(bc.getName() + bc.getAge());
        bc.work();

        System.out.println(pa.getName() + pa.getAge());
        pa.toDo();
        pa.study();

        System.out.println(ba.getName() + ba.getAge());
        ba.study();

        System.out.println(pc.getName() + pc.getAge());
        pc.toDo();
        pc.work();
    }
}
