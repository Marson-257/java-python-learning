package com.learning.basic;

public class panduansushu {
    //判断素数
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " 是素数");
        } else {
            System.out.println(num + " 不是素数");
        }
    }
}
