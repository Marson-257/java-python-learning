package com.learning.basic;

import java.util.Scanner;

public class fangfa {

    //方法格式
    public static int sumTo(int n) {
//  ↑      ↑     ↑      ↑
// 访问  静态  返回类型  方法名(参数)
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;      // 有返回值，必须 return
    }

    //方法重载
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
    public static double max(double a, double b) {
        return a > b ? a : b;
    }




    //    作业3：计算快递邮费
    //
//    某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算）：
//    首重1kg：10元；
//    超出1-5kg：每kg加2元；
//    超出5kg以上：每kg加1.5元。
//    键盘录入小数，表示用户快递的重量，计算最终的结果
//    要求1：快递重量必须大于0，否则重新输入
//    要求2：不同价位的计算，单独定义一个方法
    public static void weight1(){
        System.out.println("10元");
    }
    public static void weight2(int a){
        System.out.println(10+a*2+"元");
    }
    public static void weight3(int b){
        System.out.println(10+5*2+b*1.5+"元");
    }
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            System.out.println("请输入重量:");
            double weight = sc.nextDouble();
            int ceilWeight=(int) Math.ceil(weight);//向上取整
            if (weight<=0){
                System.out.println("输入错误");
            }else if (ceilWeight<=1){
                weight1();
            }else if (weight<=6){
                weight2((int) weight);
            }else  {
                weight3((int)weight-5);

            }
        }


    }




















}
