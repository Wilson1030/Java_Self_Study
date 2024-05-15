package 集合.综合案例.添加手机对象并返回要求的数据;

public class Phone {
    private String brand;
    private int money;

    public Phone() {
    }

    public Phone(String brand, int money) {
        this.brand = brand;
        this.money = money;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
