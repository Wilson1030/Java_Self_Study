package 流程控制语句;

/*
汽车无人驾驶的时候, 会涉及到大量的判断
当汽车行驶的时候遇到了红绿灯, 就会进行判断
如果红灯亮, 就停止
如果黄灯亮, 就减速
如果绿灯亮, 就行驶
 */

public class 分支结构1练习3 {
    public static void main(String[] arga) {
        boolean isLightRed = true;
        boolean isLightYellow = false;
        boolean isLightGreen = false;

        if (isLightRed) {
            System.out.println("Stop!");
        }

        if (isLightYellow) {
            System.out.println("Slow!");
        }

        if (isLightGreen) {
            System.out.println("Go!");
        }
    }
}
