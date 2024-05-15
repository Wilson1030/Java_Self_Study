/*
 需求:
     一座寺庙里住着三个和尚, 已知他们的身高分别为150cm. 210cm, 165cm
     请用程序实现获取这三个和尚的最高身高
 */

public class 三元运算符练习2 {
    public static void main(String[] args){
        int bonze1 = 150;
        int bonze2 = 210;
        int bonze3 = 165;
        int temp = bonze1 > bonze2 ? bonze1 : bonze2;
        int max = temp > bonze3 ? temp : bonze3;
        System.out.println(max);
    }
}
