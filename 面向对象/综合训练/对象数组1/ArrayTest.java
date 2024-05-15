package 综合训练.对象数组1;

public class ArrayTest {
    public static void main(String[] args) {
        Array[] arr = new Array[3];

        Array g1 = new Array("2023", "Apple", 13999.00, 100);
        Array g2 = new Array("2022", "HUAWEI", 6499.00, 300);
        Array g3 = new Array("2021", "Galaxy", 8999.00, 1000);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Array goods = arr[i];
            System.out.println(
                    goods.getID() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
