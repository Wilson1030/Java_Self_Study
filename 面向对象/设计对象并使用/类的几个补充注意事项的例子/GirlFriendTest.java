package 设计对象并使用.类的几个补充注意事项的例子;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setName();
        gf.setHeight();;
        gf.setAge();
        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getHeight());
        gf.sleep();
        gf.eat();
    }
}
