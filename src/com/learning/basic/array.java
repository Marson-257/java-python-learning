package com.learning.basic;

import java.util.Scanner;

public class array {
    static void main(String[] args) {
        //int[] arr={1,2,3,4,5};//静态初始化

//        int[] arr2 = new int[5];//1.动态初始化
//        Scanner sc = new Scanner(System.in);//调用键盘输入
//        for (int i = 0; i < arr2.length; i++){
//            System.out.println("请输入一个数字：");
//            arr2[i]=sc.nextInt();
//
//        }
//        for(int i=0;i<arr2.length;i++){
//            System.out.println(arr2[i]);




        //定义5个成绩的数组，求和
        int[] scores= {88,92,75,90,85};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        System.out.println("总分是："+sum);
        System.out.println("平均分是："+sum/scores.length);
        }

    }

