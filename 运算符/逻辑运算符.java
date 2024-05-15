public class 逻辑运算符 {
    public static void main(String[] args) {
        //1.&, 并且
        //两边都为真, 才是真
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(true & true);
        System.out.println(false & true);

        //2.|, 或者
        //两者都为假, 才是假
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(true | true);
        System.out.println(false | true);

        //3.^, 异或
        //相同为false, 不同为true
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ true);

        //4.!, 逻辑非, 取反
        System.out.println(!false);
        System.out.println(!true);

        //短路运算符
        //1.&&
        //运行结果跟单个&是一样的
        //表示两边都为真, 结果才是真
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //2.||
        //运行结果跟单个|是一样的
        //表示两边都为假, 结果才是假
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //3.短路运算符具有短路效果
        //简单理解: 当左边的表达式能确定最终的结果, 那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        //注意事项:
            //&和|, 无论左边true还是false, 右边都会执行
            //&&和||, 如果左边能确定整个表达式的结果, 右边不执行
            //&&: 左边为false, 右边不管是真是假, 整个表达式的结果一定是false
            //||: 左边为true, 右边不管是真是假, 整个表达式的结果一定是true
        
        //最常用的逻辑运算符: && || !
    }
}
