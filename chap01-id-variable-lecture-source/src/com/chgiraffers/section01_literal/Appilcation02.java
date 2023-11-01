package com.chgiraffers.section01_literal;

public class Appilcation02 {
    public static void main(String[] args) {
        //값을 직접 연산 출력 할수있음
        //이 떄, 값의 형태에 따라 사용할 수 있는 연산자의 종류와ㅏ 연산의 결과가 달라짐

                    //숫자와 숫자 연산//
        //1 정수와 정수 연산 //
        System.out.println("*******************");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10); //나누고 남은것을 구하는 연산자
        //2 실수와 실수 연산//
        System.out.println("*******************");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); //약간의 오차가 생긴다
        //3 정수와 실수 연산//
        System.out.println("*******************");
        System.out.println(123 + 0.5); //컴퓨터가 정수를 실수로 변경한후 실수와 실수와 실수끼리 연산
        System.out.println(123 - 0.5); // 서로 다른 데이터 타입이라서
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        // @문자와 문자 연산//
        System.out.println("*******************");
        System.out.println('a' + 'b'); //아스키코드로 숫자
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        System.out.println("*******************");

        // @문자와 정수 연산//
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
        System.out.println("*******************");
        // @문자와 실수 연산//
        System.out.println('a' + 1.0);//아스키코드로 문자가 정수로 바뀌고
        System.out.println('a' - 1.0);//정수랑 실수계산이니 정수를 다시 실수로 바뀐뒤 실수랑 실수 연산이 됨
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        System.out.println("*******************");

        // #문자열과 문자열 연산//
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world"); //에러 발생
        //System.out.println("hello" * "world"); //에러 발생
        //System.out.println("hello" / "world"); //에러 발생
        //System.out.println("hello" % "world"); //에러 발생
        System.out.println("*******************");

        // #문자열과 다른 형태 값 계산//
        System.out.println("helloworld"+123); // 이어붙이기 > 문자열 출력이 됨
        System.out.println("helloworld"+3.14);
        System.out.println("helloworld"+'a');
        System.out.println("helloworld"+true);
        System.out.println("*******************");

        // $논리값과 논리값 연산//
        //System.out.println(true + false); //에러 발생
        //System.out.println(true - false); //에러 발생
        //System.out.println(true * false); //에러 발생
        //System.out.println(true / false); //에러 발생
        //System.out.println(true % false); //에러 발생

        // $논리값과 정수 연산//
        //System.out.println(true + 1); //에러 발생
        //System.out.println(true - 1); //에러 발생
        //System.out.println(true * 1); //에러 발생
        //System.out.println(true / 2); //에러 발생
        //System.out.println(true % 2); //에러 발생

        // $논리값과 실수 연산//
        //System.out.println(true + 1.0); //에러 발생
        //System.out.println(true - 1.0); //에러 발생
        //System.out.println(true * 1.0); //에러 발생
        //System.out.println(true / 2.0); //에러 발생
        //System.out.println(true % 2.0); //에러 발생

        // $논리값과 문자 연산//
        //System.out.println(true + 'a'); //에러 발생
        //System.out.println(true - 'a'); //에러 발생
        //System.out.println(true * 'a'); //에러 발생
        //System.out.println(true / 'a'); //에러 발생
        //System.out.println(true % 'a'); //에러 발생

        // $논리값과 문자열 연산//
        System.out.println(true + "a"); //문자열 합치기만 됨
        //System.out.println(true - "a"); //에러 발생
        //System.out.println(true * "a"); //에러 발생
        //System.out.println(true / "a"); //에러 발생
        //System.out.println(true % "a"); //에러 발생



    }
}
