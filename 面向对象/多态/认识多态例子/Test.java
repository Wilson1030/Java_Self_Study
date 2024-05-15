package 多态.认识多态例子;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("wangjianguo");
        t.setAge(38);

        Adminstrator admin = new Adminstrator();
        admin.setName("lisi");
        admin.setAge(29);

        register(s);
        register(t);
        register(admin);
    }

    public static void register(Person p) {
        p.show();
    }
}
