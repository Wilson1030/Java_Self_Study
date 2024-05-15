package 异常.异常的综合案例升级版;

public class Girlfriend {
    private String name;
    private int age;
    
    public Girlfriend() {}

    public Girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameformatException{
        if (name.length() > 10 || name.length() < 2) {
            throw new NameformatException("名字输入有误");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeIndexOutOfBoundsException{
        if (age > 40 || age < 18) {
            throw new AgeIndexOutOfBoundsException("年龄输入有误");
        }
        this.age = age;
    }
}
