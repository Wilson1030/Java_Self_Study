package 编写带有抽象类的标准Javabean类;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        Sheep s = new Sheep("小白", 5);
        Dog d = new Dog("小黑", 3);

        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();

        System.out.println(s.getName() + ", " + s.getAge());
        s.eat();

        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
    }
}
