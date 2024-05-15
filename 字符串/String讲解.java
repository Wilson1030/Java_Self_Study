public class String讲解 {
    public static void main(String[] args) {
        /* 
        java.lang.String类代表字符串, java程序中的所有字符串文字(例如"abc")都为此类的对象
        String name = "尼古拉斯.阿伟";
        String schoolName = "黑马程序员";
        字符串的内容是不能改变的 
        创建String对象的两种方式:
            1.直接赋值
                String name = "尼古拉斯阿伟";
            2.new
                public String()  创建空白字符, 不含任何内容
                public String(String original)  根据传入的字符串, 创建字符串对象
                public String(char[] chs)  根据字符数组, 创建字符串对象
                public String(byte[] chs)  根据字节数组, 创建字符串对象
            3.当使用双引号直接赋值时, 系统会检查该字符串在串池中是否存在
         */

        String s1 = "123";

        String s2 = new String();
        System.out.println("@" + s2 + "!");

        String s3 = new String("abc");
        System.out.println(s3);

        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
