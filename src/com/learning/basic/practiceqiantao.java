package com.learning.basic;

public class practiceqiantao {
    static void main(String[] args) {
        //打印平行四边形
        for (int j = 1; j <= 3; j++) {
            for (int k = j; k <= 2; k++) {
                System.out.print(" #");
            }
            for (int i = 1; i <= 4; i++) {
                System.out.print("*");

            }
            System.out.println();
        }


        //打印三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
