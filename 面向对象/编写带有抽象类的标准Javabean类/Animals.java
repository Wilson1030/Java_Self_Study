package 编写带有抽象类的标准Javabean类;

public abstract class Animals {
    private String name;
    private int age;

    public Animals() {}

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public void drink() {
        System.out.println("动物在喝水");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
