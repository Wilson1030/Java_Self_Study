package 综合训练.对象数组2;

/* 
需求:
    定义三个数组存储3部汽车信息
    汽车的属性:
        品牌, 价格, 颜色
    创建三个汽车对象, 数据通过键盘录入, 并把数据存储到数组当中
 */

public class Car {
    private String name;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
