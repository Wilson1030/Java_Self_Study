package 方法;

public class 方法的格式 {
    public static void main(String[] args) {
        /* 
        方法要先定义再调用
        方法的定义格式:
            public static 返回值类型 方法名 (参数) {
                方法体;
                return 返回值;
            }
        最简单的方法定义和调用:
            方法定义格式:
                public static void 方法名() {
                    方法体 (就是打包起来的代码);
                }
            方法调用格式:
                方法名();
        带参数的方法定义和调用:
            方法定义格式:
                public static void 方法名(参数) {
                    方法体;
                }
            方法调用格式:
                方法名(变量);   
        最完整的方法定义格式和调用:
                方法定义格式:
                    public static 返回值类型 方法名(参数) {
                        方法体;
                        return 返回值;
                    }
                方法调用格式:
                    1.直接调用:
                        方法名(实参)；
                    2.赋值调用:
                        整数类型 变量名 = 方法名(实参);
                    3.输出调用:
                        System.out.println(方法名(实参));
         */

        playgame();
        getSum(20, 30);
    }

    public static void playgame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
    public static void getSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
