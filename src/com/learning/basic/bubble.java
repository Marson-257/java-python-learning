package com.learning.basic;

public class bubble {
    static void main(String[] args) {
        //冒泡序列
        int[] arr = {5, 3, 8, 4, 2, 100};
        for (int i = 0; i < arr.length; i++) {
            //每完成一轮，就把最大的排在最右，i可表示最右边排好的数，且前arr.length-1排了，最后一个自然排好。
            for (int j = 0; j < arr.length - i - 1; j++) {
            //-i:减去最右已经牌好的。-1：保证arr[j+1]不超过范围
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
