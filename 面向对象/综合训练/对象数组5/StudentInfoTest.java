package 综合训练.对象数组5;

import java.util.Scanner;

/* 
需求:
    定义一个长度为3的数组, 数组存储1-3名学生对象作为初始数据, 学生对象的学号, 姓名各不相同
    学生的属性:
        学号, 姓名, 年龄
    要求1:
        再次添加一个学生对象, 并在添加的时候进行学号唯一性判断
    要求2:
        添加完毕后, 遍历所有学生信息 
    要求3:
        通过id删除学生信息
        如果存在, 则删除, 如果不存在, 则提示删除失败
    要求4:
        删除完毕之后, 遍历所有学生信息
    要求5:
        查询数组id为"186"的学生, 如果存在, 则将他的年龄+1岁
 */

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo[] arr = new StudentInfo[3];
        Scanner sc = new Scanner(System.in);

        StudentInfo stu1 = new StudentInfo(186, "Wilson", 18);
        StudentInfo stu2 = new StudentInfo(185, "Thomas", 19);
        arr[0] = stu1;
        arr[1] = stu2; 
        StudentInfo stu3 = new StudentInfo(201, "David", 18);
        boolean flag = contains(arr, stu3.getID());
        if (flag) {
            System.out.println("当前ID重复, 请修改ID之后再进行添加");
        } else {
            //1.存满
            //2.没存满
            int count = getCount(arr);
            if (count == arr.length) {
                StudentInfo[] newArr = createNewArr(arr);
                newArr[count] = stu3;
                printArr(newArr);
            } else {
                arr[count] = stu3;
                printArr(arr);
            }
        }
        int index = getIndex(arr, 1);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("当前ID不存在, 删除失败");
        }
        printArr(arr);
        int index_age = getIndex(arr, 186);
        if (index_age >= 0) {
            StudentInfo stu = arr[index_age];
            int age = stu.getAge();
            age++;
            stu.setAge(age);
        } else {
            System.out.println("当前ID不存在, 修改失败");
        }
        printArr(arr);
    }

    //唯一性判断
    public static boolean contains(StudentInfo[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            //获取数组中学生对象的id
            if (stu != null) {
                int sid = stu.getID();
                if(sid == id) {
                    return true;
                }
            } 
        }
        return false;
    }

    //判断数组是否存满
    public static int getCount(StudentInfo[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建新数组, 新数组=老数组+1
    public static StudentInfo[] createNewArr(StudentInfo[] arr) {
        StudentInfo[] newArr = new StudentInfo[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //遍历数组
    public static void printArr(StudentInfo[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getID() + ", " + stu.getName() + ", " + stu.getAge());
            }
        }
    }

    //找到ID索引
    public static int getIndex(StudentInfo[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            StudentInfo stu = arr[i];
            if (stu != null) {
                int sid = stu.getID();
                if(sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }

}
