package com.ohgiraffers.com.ohgiraffers.cection5.sort;

import java.util.Arrays;

public class Application6 {
    public static void main(String[] args) {
        //5개의 길이의 배열에 1~10 사이의 랜덤 값을 "중복 값 없이" 담기.
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(j + "인덱스와" + i + "인덱스 값" + arr[i] + "로 중복 발생");
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
