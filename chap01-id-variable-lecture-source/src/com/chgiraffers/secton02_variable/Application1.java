package com.chgiraffers.secton02_variable;

public class Application1 {
    public static void main(String[] args) {
        //변수를 선언하고 값을 할당하여 사용가능

        // 1. 변수를 준비 (변수선언
        // - 변수를 선언하는 방법
        //자료형 변수명//

        //-- 숫자를 취급하는 자료형
        // 정수를 취급하는 자료형은 4가지가 있음
        byte bnum;
        short snum;
        int inym;
        long lnum;

        //실수를 취급하는 자료형은 2가지가 있다
        float fnum;
        double dnum;

        //문자를 취급하는 자료형
        char ch;

        //논리 값을 취급하는 자료형
        boolean istrue;
        //예약어로 기억하기 (기본자료형)

       //String (참조자료형
        //문자열을 취급하는 자료형
        String str;

        // 2. 변수의 값을 대입한다.(값 대입 및 초기화)
        bnum =1; //(=) >대입연산자
        snum =2;
        inym =4;
        lnum =8L;
        fnum =4.0f;
        dnum=8.0;
        ch= 'a';
        ch= 97; //문자는 숫자도 됨 >아스키코드
        istrue= true;
        istrue= false;
        str= "안녕";

        //선언과 동시에 초기화 할 수 있다
        int point= 100;
        int bonus= 10;

        //변수를 사용한다
        System.out.println( "변수에 저장된 값 출력");
        System.out.println("bnum :"+bnum);
        System.out.println("snum :"+snum);
        System.out.println("inym :"+ inym);
        System.out.println("lnum :"+lnum);
        System.out.println("fnum :"+fnum);
        System.out.println("dnum :"+dnum);
        System.out.println("ch :"+bnum);
        System.out.println("istrue :"+istrue);
        System.out.println("str :"+str);

        //변수를 이용해서 연산하기
        System.out.println("포인트와 보너스의 합은? :"+(point+bonus));

        //대입 연사자의 왼쪽과 오른쪽 사용하기
        //*대입 연산자의 왼편은 공간이라는 의미, 오른편은 값이라는 의미
        point = point +100; //=200
        //공간---//값  + 100 =
        System.out.println("point"+point);
    }
}
