package static静态变量.static讲解;

public class static讲解 {
    public static void main(String[] args) {
        /* 
        static表示静态, 是java中的一个修饰符, 可以修改成员方法, 成员变量
        1. 被static修饰的成员变量, 叫做静态变量
            特点:
                被该类所有对象共享
            调用方法:
                1. 类名调用 (推荐)
                2. 对象名调用
        2. 被static修饰的成员方法, 叫做静态方法
            特点:
                多用在测试类和工具类中
                Javabean类中很少使用
            调用方式:
                1 类名调用 (推荐)
                2. 对象名调用
        
        工具类:
            帮助我们做一些事情, 但是不描述任何事物的类
            规则:
                1. 类名要见名知意
                2. 私有化构造方法
                3. 方法定义为静态
        Javabean类:
            描述一类事物的类
        测试类:
            用来检查其他类是否书写正确, 带有main方法, 是程序的入口
         */
    }
}
