package 综合训练.对象数组4;

import java.util.Scanner;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4]; 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = new GirlFriend();
            System.out.println("请输入女朋友的名字:");
            String name = sc.next();
            gf.setName(name);
            System.out.println("请输入女朋友的年龄:");
            int age = sc.nextInt();
            gf.setAge(age);
            System.out.println("请输入女朋友的性别:");
            String gender = sc.next();
            gf.setGender(gender);
            System.out.println("请输入女朋友的爱好:");
            String hobby = sc.next();
            gf.setHobby(hobby);
            arr[i] = gf;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend GF = arr[i];
            sum += GF.getAge();
        }
        int avg = sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend GF = arr[i];
            if (GF.getAge() < avg) {
                count++;
                System.out.println(GF.getName() + ", " + GF.getAge() + ", " + GF.getGender() + ", " + GF.getHobby());
            }
        }
        System.out.println("The average is " + avg + ", and " + count + " girl under the average");
    }
}
