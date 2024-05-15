import java.util.Scanner;

public class StringBuilder讲解 {
    public static void main(String[] args) {
        /* 
        StringBuilder可以看作是一个容器, 创建之后的内容是可变的
        作用: 提高字符串的效率
        构造方法:
            1. public StringBuilder()   创建一个空白可变字符串对象, 不含任何内容
            2. public StringBuilder(String str)   根据字符串的内容, 来创建可变字符串对象
        成员方法:
            1. public StringBuilder append(任意类型)   添加数据, 并返回对象本身
            2. public StringBuilder reverse()   反转容器中的内容  
            3. public int length   返回长度(字符出现的个数)
            4. public String toString()   通过toString()就可以实现把StringBuilder转换为String
        链式编程:
            当我们在调用一个方法的时候, 不需要用变量接收他的结果, 可以继续调用其他方法
            依赖前一个方法的结果
         */

         StringBuilder sb = new StringBuilder("abc");

         sb.append(1).append(1.1).append(true);
         
         System.out.println(sb);

         sb.reverse();
         System.out.println(sb);

         int len = sb.length();
         System.out.println(len);

         String str = sb.toString();
         System.out.println(str);

         //链式编程
         int len2 = getString().substring(1).replace("A", "Q").length();
         System.out.println(len2);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        return str;
    }
}
