package 多态;

public class 认识多态 {
    public static void main(String[] args) {
        /* 
        多态:
            同类型的对象, 表现出的不同形态
        多态的表现形式:
            父类类型 对象名称 = 子类类型;
        多态的前提:
            1. 有继承或实现关系
            2. 有父类引用指向子类对象
            3. 有方法重写
        多态的好处:
            使用父类型作为参数, 可以接收所有子类对象
            体现多态的扩展性与便利
        多态调用成员的特点:
            成员变量调用: 编译看左边, 运行也看左边
            成员方法调用: 编译看左边, 运行看右边
        多态的优势:
            1. 在多态形势下, 右边对象可以实现解耦合, 便于扩展和维护
            2. 定义方法的时候, 使用父类型作为参数, 可以接收所有子类对象, 体现多态的扩展性与便利
        多态的弊端:
            不能调用子类的特有功能
        解决方案:
            变回子类类型
            instanceof关键字判断是不是一个类型
            if (a instanceof Dog d) {
                代码;
            } else if (a instanceof Cat c) {
                代码;
            } else {
                System.out.println("没有这个类型, 无法转换")
            }
            或者
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                代码;
            } else if (a instance of Cat) {
                Cat c = (Cat) a;
                代码;
            } else {
                System.out.println("没有这个类型, 无法转换")
            }
         */
    }
}
