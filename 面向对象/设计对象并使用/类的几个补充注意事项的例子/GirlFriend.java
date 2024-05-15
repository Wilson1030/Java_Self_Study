package 设计对象并使用.类的几个补充注意事项的例子;

/* 
编写女朋友类, 创建女朋友类的对象
给女朋友的属性赋值, 并调用女朋友类的方法
 */

import java.util.Scanner; 

public class GirlFriend {
    Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private int height;
    public void setName() {
        name = sc.next();
    }
    public String getName() {
        return name;
    }
    public void setAge() {
        age = sc.nextInt();
    }
    public int getAge() {
        return age;
    }
    public void setHeight() {
        height = sc.nextInt();
    }
    public int getHeight() {
        return age;
    }
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }
    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
