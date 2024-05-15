public class 权限修饰符 {
    public static void main(String[] args) {
        /* 
        权限修饰符: 
            是用来控制一个成员能够被访问的范围
            可以修饰成员变量, 方法, 构造方法, 内部类
        有四种权限修饰符:
            (private < 空着不写 < protected < public) 
            private: 只能本类中用
            默认: 只能本包中用
            protected: 受保护的, 其他包的子类也能用
            public: 公共的
        实际开发中, 一般只用private和public
            1. 成员变量私有
            2. 成员方法公开
            特例:
                如果方法中的代码是抽取其他方法中共性代码, 这个方法一般也私有
         */
    }
}
