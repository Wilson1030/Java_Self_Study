package 集合.综合案例.添加手机对象并返回要求的数据;

import java.util.ArrayList;
import java.util.Scanner;

public class 添加手机对象并返回要求的数据 {
    public static void main(String[] args) {
        /* 
        定义javabean类: Phone
        Phone属性: 品牌, 价格
        main方法中定义一个集合, 存入三个手机对象
        分别为: 小米, 1000; 苹果, 8000; 锤子, 2999
        定义一个方法, 将价格低于3000的手机返回
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Phone> list = new ArrayList<>();

        while(true) {
            Phone p = new Phone();
            System.out.println("请输入品牌:");
            p.setBrand(sc.next());
            System.out.println("请输入价格:");
            p.setMoney(sc.nextInt());
            list.add(p);
            System.out.println("继续输入请按1, 结束请按任意键");
            String str = sc.next();
            if (!str.equals("1")) {
                break;
            }
        }  
        
        System.out.println("想要查询请按1, 退出请按任意键");
        String answer = sc.next();
        if (answer.equals("1")) {
            check(list);
        }
    }

    public static void check(ArrayList<Phone> list) {
        int count = 0;
        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i).getMoney() < 3000) {
                count++;
                System.out.println(list.get(i).getBrand() + ", " + list.get(i).getMoney());
            }
        }
        System.out.println("符合要求的总共有:" + count + "个");
    }
}
