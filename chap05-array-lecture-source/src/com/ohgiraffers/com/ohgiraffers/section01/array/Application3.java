package com.ohgiraffers.com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        //배열에 초기화 되는 자료형별 기본 값을 이해하기

        //배열의 각 인덱스에는 자바에는 지정한 기본 값으로 초기화된 값이 담긴다
        //heap 영역은 값이 없는 빈 공간이 존재할수 없음
        //정수 : 0
        //실수 : 0.0
        //논리 : false
        //문자 : \u0000
        //참조 : null

        int[] iarr = new int[5];

        for (int i = 0; i < iarr.length; i++) {
            System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
        }

        //자바에서 지정한 기본 값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다
        //블럭을 사용하는 경우 new 영산자를 사용하지 않아도 되고 값의 개수만큼 자동으로 크기가 설정 된다.
        int[] iarr2 = {11, 22, 33, 44, 55};

        for (int i = 0; i < iarr2.length; i++) {
            System.out.println("iarr2[" + i + "] : " + iarr2[i]);
        }

        // 문자열도 배열로 사용 가능
        String[] sarr = {"apple", "danana", "grape", "orange"};

        for (int i = 0; i < sarr.length; i++) {
            System.out.println("sarr[" + i + "] : " + sarr[i]);
        }

    }
}
