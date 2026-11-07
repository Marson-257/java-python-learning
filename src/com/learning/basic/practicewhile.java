package com.learning.basic;

import java.util.Random;
import java.util.Scanner;

public class practicewhile {
    static void main(String[] args) {

        //猜数字
        //1.生成随机数
        Random r = new Random();
        int num = r.nextInt(101);
        System.out.println(num);

        //2.输入
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请猜一个0-100的整数：");
            int guess= sc.nextInt();

        //3.判断

            if (guess > num) {
                System.out.println("猜大了");
            } else if (guess < num) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }


    }
}
