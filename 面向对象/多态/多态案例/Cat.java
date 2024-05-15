package 多态.多态案例;

public class Cat extends Animals{
    public Cat() {}
    
    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "色的猫眯着眼睛侧着头" + "吃" + something );
    }
}
