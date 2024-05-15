package static静态变量.继承.带有继承结构的Javabean类;

public class Cook extends Employ {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("炒菜");;
    }
}
