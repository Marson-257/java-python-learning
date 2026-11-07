package com.learning.basic;

import java.util.Random;

public class quchong {
    //数组去重，生成随机数充入数组
    public static void main(String[] args) {

        int arr[] = new int[7];
        Random r = new Random();

        for (int i = 0; i < arr.length; ) {//先不i++,存下数字再i+1
            int num = r.nextInt(10) + 1;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                arr[i] = num;
                i++;//i++表示存下数字再i+1
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }




//    static void main(String[] args) {
//        int[] arr = new int[8];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int num = r.nextInt(10) + 1;
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (num != arr[j]) {
//                    count++;
//                }
//            }
//            if (count == arr.length) {
//                arr[i] = num;
//            }else{
//                i--;
//            }
//
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//
//    }
//
//
//
//
//
//
















}

