import java.util.Scanner;

public class 敏感词替换 {
    public static void main(String[] args){
        /* 
        String replace(旧值, 新值)  替换
        只有返回值才是替换后的结果
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("请输入一句话:");
         String talk = sc.next();
         String[] arr = {"TMD", "TNND", "MLGB", "SB", "CNM"};
         for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");            
         }
         System.out.println(talk);
    }
}
