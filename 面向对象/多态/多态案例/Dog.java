package 多态.多态案例;

public class Dog extends Animals {
    public Dog() {}
    
    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome() {
        System.out.println("看家");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "色的狗两只前腿死死的抱住" + something + "猛吃");
    }
}
