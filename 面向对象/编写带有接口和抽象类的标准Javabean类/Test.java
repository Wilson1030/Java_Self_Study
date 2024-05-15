package 编写带有接口和抽象类的标准Javabean类;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        Dog d = new Dog("大黄", 3);
        Rabbit r = new Rabbit("小白", 2);

        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();

        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
    }
}
