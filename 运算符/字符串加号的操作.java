//当"+"操作中出现字符串时, 这个"+"是字符串连接符, 而不是算术运算符了, 会将前后的数据进行拼接, 并产生一个新的字符串
//连续进行"+"操作时, 从左到右连续操作

public class 字符串加号的操作 {
    public static void main(String[] args){
        System.out.println(3.7 + "abc"); //3.7abc
        System.out.println("abc" + true); //abctrue
        System.out.println('中' + "abc" + true); //中abctrue
        
        int age = 18;
        System.out.println("我的年龄是" + age + "岁"); //我的年龄是18岁
        System.out.println("我的年龄是" + "age" + "岁"); //我的年龄是age岁

        System.out.println(1 + 2 + "abc" + 2 + 1);
    }
}
