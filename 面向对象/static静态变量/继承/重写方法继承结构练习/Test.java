package static静态变量.继承.重写方法继承结构练习;

public class Test {
    public static void main(String[] args) {
        Haski H = new Haski();
        H.eat();

        Shapi sh = new Shapi();
        sh.drink();
        sh.eat();

        Zhonghua zh = new Zhonghua();
        zh.eat();
        zh.drink();
    }
}
