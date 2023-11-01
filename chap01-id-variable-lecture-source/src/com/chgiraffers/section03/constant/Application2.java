package com.chgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args) {
        //상수의 명명 규칙에 대해 이해//
        // 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용가능
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40; //소문자로 사용은 가능하지만 변수와 구분하기 힘들기 때문에 만들어진 규칙이다.

        //단어와 단어를 이을땐 언더스코어_를 사용해서 알아보기 쉽게 함
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30; //camel case 사용이 가능하지만 역시 변수와 구분되지 않는다.


    }
}
