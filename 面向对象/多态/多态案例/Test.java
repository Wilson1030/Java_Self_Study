package 多态.多态案例;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Person p1 = new Person();
        Person p2 = new Person();

        d.setAge(2);
        d.setColor("黑");
        
        c.setAge(3);
        c.setColor("灰");

        p1.setName("老王");
        p1.setAge(30);

        p2.setName("老李");
        p2.setAge(25);

        p1.keepPet(d, "骨头");
        p2.keepPet(c, "鱼");
    }
}
