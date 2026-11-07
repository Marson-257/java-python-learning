package com.learning.basic;



import java.util.Arrays;

public class shanchushuju {
    //删除数据
    //输入：[1, 2, 2, 3, 3, 3]
    //输出：[1, 2, 3]
    //方法：冒泡排序+去重
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        // 原时数据
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println("原数组: " + Arrays.toString(arr));

        // 调用做法
        int[] resultB = method(arr);
        System.out.println("去重后: " + Arrays.toString(resultB));
    }

    public static int[] method(int[] arr) {
        // 边界判断
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        //  调用冒泡排序对数组进行排序
        bubbleSort(arr);

        //  准备一个新数组用来装去重后的结果
        int[] tempArray = new int[arr.length];
        int count = 0; // 记录新数组的有效长度

        //  因为已经排好序了，相同的元素一定挨在一起
        // 第一个元素肯定不重复，直接放进去
        tempArray[count] = arr[0];
        count++;

        // 从第二个元素开始遍历，相邻相同就跳过
        for (int i = 1; i < arr.length; i++) {
            // 如果当前元素和上一个元素不一样，说明是新的元素
            if (arr[i] != arr[i - 1]) {
                tempArray[count] = arr[i];
                count++;
            }
        }

        // 7. 截取有效部分并返回
        return Arrays.copyOf(tempArray, count);
    }


}



