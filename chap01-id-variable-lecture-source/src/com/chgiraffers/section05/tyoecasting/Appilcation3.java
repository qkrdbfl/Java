package com.chgiraffers.section05.tyoecasting;

public class Appilcation3 {
    public static void main(String[] args) {
        //자동 형 변환과 강제 형변환을 이용하여 서로 다른 자료형끼리 연산을 수행하기//

        int inum = 10;
        long lnum = 100;
        //inum이 long 타입으로 변환된 뒤 연산이 일어남, long 타입의 결과 int 타입에 담을수 없음
        //int isum = inum + lnum;

        // 1. 두수의 연산 결과를 int 타입으로 변환하기
        int isum = (int)(inum + lnum);

        // 2. long형 값을 int형으로 변환 시키고 연산하기
        int isum2 = inum + (int)lnum;

        //결과 값을 long형 자료형으로 처리하기 (자동 형변환)
        long lsum = inum + lnum;

        //주의!! int미만의 연산의 처리 결과는 int형이다//
        /* 주의! int 미만의 연산의 처리 결과는 int형 이다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;
        int result1 = byteNum1 + byteNum2;
        //byte result5 = byteNum1 + byteNum2; //byteNum1 , byteNum2가 int타입이라서 에러남
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}
