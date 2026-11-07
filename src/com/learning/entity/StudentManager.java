package com.learning.entity;

import java.util.Scanner;

public class StudentManager {
    private static final int MAX = 100;                      // 最多存 100 人
    private static Student[] students = new Student[MAX];    // 数组：固定长度
    private static int count = 0;                            // 已录入人数
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("请选择：");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    deletName();
                    break;
                case 0:
                    running = false;
                    System.out.println("再见！");
                    break;
                default:
                    System.out.println("  没有这个选项，请重新输入");
            }
        }
        sc.close();
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("===== 学生信息管理 =====");
        System.out.println("1. 录入学生");
        System.out.println("2. 显示所有学生");
        System.out.println("3. 查找学生（按姓名）");
        System.out.println("0. 退出");
    }

    private static void addStudent() {
        if (count >= MAX) {
            System.out.println("  存储已满，无法继续录入");
            return;
        }

        System.out.print("  姓名：");
        String name = sc.next();
        int age = readInt("  年龄：");
        double score = readDouble("  成绩：");

        students[count] = new Student(name, age, score);
        count++;

        System.out.println("  录入成功，当前共 " + count + " 名学生");
    }

    private static void showAll() {
        if (count == 0) {
            System.out.println("  还没有录入任何学生");
            return;
        }

        System.out.println("  ---- 共 " + count + " 名学生 ----");
        for (int i = 0; i < count; i++) {
            System.out.print("  " + (i + 1) + ". ");
            students[i].printInfo();
        }
    }

    private static void findByName() {
        if (count == 0) {
            System.out.println("  还没有录入任何学生");
            return;
        }

        System.out.print("  请输入要查找的姓名：");
        String key = sc.next();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(key)) {
                System.out.println("  找到：");
                students[i].printInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("  没有找到名为「" + key + "」的学生");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {//检查用户输入的是不是一个有效的整数。
                return sc.nextInt();
            }
            System.out.println("  输入有误，请输入数字");
            sc.next();          // 把非法输入吃掉，否则会死循环
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            }
            System.out.println("  输入有误，请输入数字");
            sc.next();
        }
    }

    private static void deletName(){
        System.out.println("请输入要删除学生的姓名");
        String name2=sc.next();

    }
}
