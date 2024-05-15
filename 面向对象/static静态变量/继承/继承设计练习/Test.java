package static静态变量.继承.继承设计练习;

public class Test {
    public static void main(String[] args) {
        Haski H = new Haski();
        H.damageHouse();
        H.drink();
        H.eat();
        H.lookHouse();

        Lihua lh = new Lihua();
        lh.catchMouse();
        lh.drink();
        lh.eat();

        Teddy T = new Teddy();
        T.cengyiceng();
        T.drink();
        T.eat();
        T.lookHouse();

        Buou bo = new Buou();
        bo.catchMouse();
        bo.drink();
        bo.eat();
    }
}
