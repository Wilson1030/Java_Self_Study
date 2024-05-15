package static静态变量.继承.带有继承结构的Javabean类;

public class Employ {
    private String id;
    private String name;
    private double salary;

    public Employ() {
    }

    public Employ(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("开始上班");
    }

    public void eat() {
        System.out.println("吃饭时间");
        System.out.println("吃米饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
