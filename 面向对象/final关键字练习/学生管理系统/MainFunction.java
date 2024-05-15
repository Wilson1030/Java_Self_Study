package final关键字练习.学生管理系统;

import java.util.Scanner;
import java.util.ArrayList;

public class MainFunction {
    private static final int ADD_STUDENT = 1;
    private static final int DELETE_STUDENT = 2;
    private static final int MODIFY_STUDENT = 3;
    private static final int INQUIRE_STUDENT = 4;
    private static final int EXIT = 5;

    static ArrayList<Student> list = new ArrayList<>();
    
    static {
        list.add(new Student("2330026186", "Wilson", 18, "DS"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        
        while(flag) {
            System.out.println("---------------Welcome to UIC Student Management System---------------");
            System.out.println("                    1. Add Student Information                        ");
            System.out.println("                    2. Delete Student Information                     ");
            System.out.println("                    3. Modify Student Information                     ");
            System.out.println("                    4. Inquire Student Information                    ");
            System.out.println("                    5. Exit                                           ");
            System.out.println("----------------------------------------------------------------------");

            System.out.println("Please input your choice:");
            int choice_1 = sc.nextInt();

            switch(choice_1) {
                case ADD_STUDENT:
                    addStuInfo(list);
                    printList(list);
                    break;
                case DELETE_STUDENT:
                    delStuInfo(list);
                    break;
                case MODIFY_STUDENT:
                    printList(list);    
                    modStuInfo(list);
                    printList(list);
                    break;
                case INQUIRE_STUDENT:
                    inqStuInfo(list);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void addStuInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Please input Student's ID:");
        String id = sc.next();
        s.setId(id);
        System.out.println("Please input Student's name:");
        String name = sc.next();
        s.setName(name);
        System.out.println("Please input Student's age:");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("Please input Student's major:");
        String major = sc.next();
        s.setMajor(major);
        list.add(s);
    }

    public static void printList(ArrayList<Student> list) {
        System.out.println("    ID              Name                Age             Major");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ".  " + list.get(i).getId() + "      " + list.get(i).getName() + "              " + list.get(i).getAge() + "              " + list.get(i).getMajor());
        }
    }

    public static void delStuInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Delete Student Information---------------");
        System.out.println("      1. Delete Specific Student's Information         ");
        System.out.println("      2. Delete all Student's Information               ");
        System.out.println("------------------------------------------------------=");
        System.out.println("Please input your choice:");
        int choice_2 = sc.nextInt();
        switch(choice_2) {
            case 1:
                printList(list);    
                delSSI(list);
                printList(list);
                break;
            case 2:
                delAll(list);
                break;
            default:
        }
    }

    public static void delSSI(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the student's ID or name you want to delete:");
        String answer1 = sc.next();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(answer1) || list.get(i).getId().equals(answer1)) {
                list.remove(i);
                System.out.println("Delete successfully");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Your input is not exist");
        }
    }

    public static void delAll(ArrayList<Student> list) {
        for (int i = 0; i < list.size();) {
            list.remove(i);
        }
        System.out.println("All information have been deleted");
    }

    public static void modStuInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the student's ID or name:");
        String choice_3 = sc.next();       
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(choice_3) || list.get(i).getId().equals(choice_3)) {
                System.out.println("Please input the ID you want to modify:");
                String answer_1 = sc.next();
                System.out.println("Please input the Name you want to modify:");
                String answer_2 = sc.next();
                System.out.println("Please input the Age you want to modify:");
                int answer_3 = sc.nextInt();
                System.out.println("Please input the Major you want to modify:");
                String answer_4 = sc.next();
                Student stu = new Student(answer_1, answer_2, answer_3, answer_4);
                list.set(i, stu);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Your input is not exist");
        }
    }

    public static void inqStuInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        printList(list);
        System.out.println("Please input the number taht you want to inquire:");
        int answer_5 = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (answer_5 == i + 1) {
                System.out.println(list.get(i).getId() + "  " + list.get(i).getName() + "   " + list.get(i).getAge() + "    " + list.get(i).getMajor());
            }
        }
    }
}