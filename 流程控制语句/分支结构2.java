package 流程控制语句;

public class 分支结构2 {
    public static void main(String[] args) {
        /*
        switch语句格式:
            switch(表达式) {
                case 值1:
                    语句体1;
                    break;
                case 值2:
                    语句体2;
                    break;
                ...
                default:
                    语句体n + 1;
                    break;
            }
        执行流程:
            1. 首先计算表达式的值
            2. 依次和case后面的值进行比较, 如果有对应的值, 就会执行相应的语句, 在执行的过程中给, 遇到break就会结束
            3. 如果所有的case后面的值和表达式的值都不匹配, 就会执行default里面的语句体, 然后结束整个switch语句
        
            switch的其他知识点:
            1. default的位置和省略
                省略: 可以省略, 但不建议
                位置: 可以是任意位置, 但建议在最下面
            2. case穿透
                语句体中没有写break导致的
                执行流程:
                    1. 首先还是拿着小括号表达式的值跟每一个case进行匹配
                    2. 如果匹配上了, 就会执行对应的语句体, 如果此时发现break, 那么结束整个switch语句
                    3. 如果没有发现break, 那么程序会继续执行下一个case的语句体, 一直遇到break结束
                使用场景:
                    如果多个switch的语句体重复了, 那么我们考虑利用case穿透去简化代码
            3. switch的新特性 (jdk12以上)
                新特性的语句表格格式:
                    switch (表达式) {
                        case -> 1 {
                            语句体1;
                        }
                        case -> 2 {
                            语句体2;
                        }
                        ...
                        default -> {
                            语句体n + 1;
                        }
                    }
                新特性的优点:
                    1. 不需要break
                    2. 不会出现case穿透
                    3. 一行代码可以省略括号
        
        switch和if第三种格式各自的使用场景:
            if的第三种格式: 一般用于对范围的判断
            switch: 把有限个数据一一列举出来, 让我们任选其一
         */
         String noodles = "兰州拉面";

         switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
         }
    }
}
