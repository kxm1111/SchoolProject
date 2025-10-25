//package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

//学生管理系统
public class StudentManager {
    public static void main(String[] args) {
//        创建集合
        ArrayList<Student> array = new ArrayList<Student>();

// 循环
        while (true) {
//            输出语句
            System.out.println(" 学号：2024125030244 姓名：卫民安 ");
            System.out.println("--------学生管理系统--------");
            System.out.println(" 学号：2024125030244 姓名：卫民安 ");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

// 实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

// 完成操作的选择
            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }


    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        String sid;

        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

//        将学生对象添加到集合
        array.add(s);

//        添加成功提示
        System.out.println("添加学生成功");
    }

//        判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    // 查看学生
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
//            不再执行
            return;
        }

//        显示表头信息
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

//        将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }


//    删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();

// 在删除/修改学生操作前，对学号是否存在进行判断
//        不存在，显示提示信息
//        存在，执行删除/修改操作
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
//            提示删除成功
            System.out.println("删除学生成功");
        }
    }

// 修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要修改的学生的学号：");
        String sid = sc.nextLine();

//        键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

//        创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

//        遍历集合修改对应的学生信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

//        修改成功提示
        System.out.println("修改学生成功");
    }
}
