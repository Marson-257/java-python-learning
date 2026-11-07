package com.learning.entity;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        setAge(age);        // 复用 setter 里的校验逻辑
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("  [警告] 年龄不合法，已设为 0");
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("  [警告] 成绩不合法，已设为 0");
            this.score = 0;
            return;
        }
        this.score = score;
    }

    public void printInfo() {
        System.out.printf("  姓名：%-6s 年龄：%-4d 成绩：%.1f%n", name, age, score);
    }

    // %-6s = 字符串占 6 格，左对齐
    // %-4d = 整数占 4 格，左对齐
    // %.1f = 小数保留 1
    // %n = 换行
}
