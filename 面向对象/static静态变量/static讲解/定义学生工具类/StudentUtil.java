package static静态变量.static讲解.定义学生工具类;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxStudentAge(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }
        }
        return max;
    }
}
