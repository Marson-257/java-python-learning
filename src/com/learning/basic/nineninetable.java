package com.learning.basic;

public class nineninetable {


    static void main(String[] args) {
        for (int j = 9; j >= 1; j--) {
            for (int i = 9; i >= j; i--) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

    }
}
