package 流程控制语句;

/* 
需求:
    世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)
    假如我有足够大的纸, 它的厚度是0.1毫米
    请问, 我折叠多少次, 可以折成珠穆朗玛峰的高度
 */

public class 循环结构2练习2 {
    public static void main(String[] args) {
        int count = 0;
        double i = 0.1;
        while (i <= 8844430) {
            count++;
            i *= 2;
        }
        System.out.println("需要折叠" + count + "次");
        
    }
}
