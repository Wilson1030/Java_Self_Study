//隐式转换: 取值范围小的转换为取值范围大的
//显示转换: 取值范围大的转换为取值范围小的

public class 算术运算符转换 {
    public static void main(String[] args) {
        //隐式转换
        int a = 10;
        double b = a;
        /*
         隐式转换总结:
             取值范围:
                 byte < short < int < long < float < double
            什么时候转换?
                数据类型不一样, 不能进行计算, 需要转换成一样的才可以进行计算
            转换规则1:
                取值范围小的, 和取值范围大的进行运算, 小的会先提升为大的, 再进行运算
            转换规则2:
                byte, short, char三种类型的数据在进行运算的时候, 都会直接先提升为int, 然后再进行计算
         */
        
         //强制转换
         double c = 12.3;
         int d = (int)c;
    }
}
