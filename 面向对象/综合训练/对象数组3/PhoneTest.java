package 综合训练.对象数组3;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            System.out.println("请输入手机品牌:");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入价格:");
            double price = sc.nextDouble();
            p.setPrice(price);
            System.out.println("请输入颜色:");
            String color = sc.next();
            p.setColor(color);
            arr[i] = p;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            System.out.println(phone.getBrand() + ", " + phone.getPrice() + ", " + phone.getColor());
            sum += phone.getPrice();
        }
        int avg = sum / arr.length;
        System.out.println("The average is " + avg);
    }
}
