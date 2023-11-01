package com.ohgiraffers.com.ohgiraffers.cection3;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        //깊은 복사에 대해 이해하기

        //원본 배열//
        int[] originArr = {1, 2, 3, 4, 5,};

        print(originArr);

        //for문을 이용한 동일한 인덱스 값 복사
        int[] copyArr1 = new int[10];

        for (int i=0;i<originArr.length; i++){
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        //2. object의 clone()을 이용한 복사
        //동일한 길이, 동일한 값을 가지는 배열이 생성되어 복사되고 다른주소를 가지고 있다.
        int[] copyArr2 = originArr.clone();

        print(copyArr2);

        //3. system의 arraycopy()를 이용한 복사
        int[] copyArr3 = new int [10];


        //원본 배열, (원본에서)복사를 시작할 인덱스, 복사본 배열, (복사본에서)복사를 시작할 인덱스, 복사할 길이의 의미를 가진다
        System.arraycopy(originArr,0,copyArr3,3,originArr.length);

        print(copyArr3);


        //4. Arraus의 copysOf()를 이용한 복사
        //시작 인덱스부터 원하는 길이만큼 복사해서 사욯한다
        int[] copyArr4 = Arrays.copyOf(originArr,7);

        print(copyArr4);
    }

    public static void print(int[] iarr) {
        System.out.print("iarr의 hashCode : " + iarr.hashCode());
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

}
