package com.learning.basic;

public class testzhaozhi {
    //给定一个整数数组 nums 和一个整数目标值 target，
    // 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int target = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    count++;
                    System.out.println(i + " " + j);
                    System.out.println("因为" + arr[i] + "+" + arr[j] + "=" + target);
                }
            }
        }
        if (count == 0) {
            System.out.println("不存在");
        }
    }

}
