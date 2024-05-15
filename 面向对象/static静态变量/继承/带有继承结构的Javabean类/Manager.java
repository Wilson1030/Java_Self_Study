package static静态变量.继承.带有继承结构的Javabean类;

public class Manager extends Employ {
    private double manageBonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double manageBonus) {
        super(id, name, salary);
        this.manageBonus = manageBonus;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理其他人");
    }

    public double getManageBonus() {
        return manageBonus;
    }

    public void setManageBonus(double manageBonus) {
        this.manageBonus = manageBonus;
    }
}
