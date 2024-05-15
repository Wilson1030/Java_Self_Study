package 综合训练.对象数组1;

/* 
需求:
    定义数组存储三个商品对象
    商品的属性:
        商品的id, 名字, 价格, 库存
        创建三个商品对象, 并把商品对象存入到数组中
 */

public class Array {
    private String id;
    private String name;
    private double price;
    private int count;

    public Array() {
    }

    public Array(String id, String name, double price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void ssetPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
