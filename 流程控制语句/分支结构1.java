package 流程控制语句;

public class 分支结构1 {
    public static void main(String[] args) {
        /*
        if语句的第一种格式:
            if (关系表达式) {
                语句体;
            }
        Example:
            if (酒量 > 2) {
                System.out.println("小伙子, 不错!");
            }
        执行流程:
            1. 首先计算关系表达式的值
            2. 如果关系表达式的值为true就执行语句体
            3. 如果关系表达式的值为false就不执行语句体
            4. 继续执行后面的其他语句
        if的注意点:
            1. 大括号的开头可以另起一行书写, 但是建议写在第一行的末尾
            2. 在语句体中, 如果只有一句代码, 大括号可以省略不写
            3. 如果对一个布尔类型的变量进行判断, 不要用==号, 直接把变量写在小括号即可

        if语句的第二种格式:
            if (关系表达式) {
                语句体1;
            } else {
                语句体2;
            }
        执行流程:
            1. 首先计算关系表达式的值
            2. 如果关系表达式的值为true就执行语句体1
            3. 如果关系表达式的值为false就执行语句体2
            4. 继续执行后面的其他语句

        if语句的第三种格式:
            if (关系表达式1) {
                语句体1;
            } else if(关系表达式2) {
                语句体2;
            } 
              ...
              else {
                语句体 n + 1;
            }
        执行流程:
            1. 首先计算关系表达式1的值
            2. 如果为true就执行语句体1; 如果为false就计算关系表达式2的值;
            3. 如果为true就执行语句体2; 如果为false就计算关系表达式3的值
            4. ...
            5. 如果所有关系表达式结果都为false, 就执行语句体n + 1
         */
    }
}
