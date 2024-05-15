import java.util.StringJoiner;

public class StringJoiner讲解 {
    public static void main(String[] args) {
        /* 
        StringJoiner跟StringBuilder一样, 也可以看作一个容器, 创建之后里面的内容是可变的
        作用: 提高字符串的效率, 而且代码编写特别简洁, 但是目前市场上很少有人用
        StringJoiner的构造方法:
            1. public StringJoiner(间隔符号)   创建一个StringJoiner对象, 指定拼接时的间隔符号
            2. public StringJoiner(间隔符号, 开始符号, 结束符号)   创建一个StringJoiner对象, 指定拼接时的间隔符号, 开始符号, 结束符号
        StringJoiner的成员方法:
            1. public StringJoiner add(添加的内容)   添加数据, 并返回对象本身
            2. public int length()   返回长度(字符出现的个数)
            3. public String toString()   返回一个字符串(该字符串就是拼接之后的结果)
         */
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
        sj1.add("aaa").add("bbb").add("ccc");
        int len = sj1.length();
        System.out.println(sj1);
        System.out.println(len);
        
        String str = sj1.toString();
        System.out.println(str);
    }
}
