package 设计对象并使用.类和对象例子;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Apple";
        p.price = 13999.00;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();
    }
}
