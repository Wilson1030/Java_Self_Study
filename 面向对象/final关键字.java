public class final关键字 {
    public static void main(String[] args) {
        /* 
        final:
            可以修饰方法, 类, 变量
            修饰方法: 表明该方法是最终方法, 不能被重写
            修饰类: 表明该类是最终类, 不能被继承
            修饰变量: 叫做常量, 只能被赋值一次
        常量: 实际开发中, 常量一般作为系统的配置信息, 方便维护, 提高可读性
        常量的命名规则:
            1. 单个单词: 全部大写
            2. 多个单词: 全部大写, 单词之间用下划线隔开
            细节: 
                1. final修饰的变量是基本类型: 那么变量存储的数据值就不能改变
                2. final修饰的变量是引用类型: 那么变量存储的地址值就不能改变, 对象内部的可以改变
            核心:
                常量记录的数据是不能改变的
         */
    }
}
