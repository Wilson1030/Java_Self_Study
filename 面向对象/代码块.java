public class 代码块 {
    public static void main(String[] args) {
        /* 
        代码块:
            1. 局部代码块
            2. 构造代码块
            3. 静态代码块
        局部代码块:
            缩短变量周期
        构造代码块:
            1. 写在成员位置的代码块
            2. 作用: 把多个构造方法中重复的代码抽取出来
            3. 执行时机: 创建本类对象的时候会先执行构造代码块再执行构造方法
        静态代码块:
            格式:
                static{}
            特点:
                需要通过static关键字修饰, 随着类的加载而加载, 并且自动触发, 只执行一次
            使用场景:
                在类加载的时候, 做一些数据初始化的时候使用
         */
    }
}
