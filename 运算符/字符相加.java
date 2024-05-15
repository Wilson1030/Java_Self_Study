//当字符 + 字符时, 会把字符通过ASCII码表查询到对应的数字再进行计算
//当字符 + 数字时, 会把字符通过ASCII码表查询到对应的数字再进行计算

public class 字符相加{
    public static void main(String[] args){
        char c = 'a';
        int result = c + 0;
        System.out.println(result); //97
        System.out.println(1 + 'a'); //98
        System.out.println('a' + "abc"); //aabc
    }
}