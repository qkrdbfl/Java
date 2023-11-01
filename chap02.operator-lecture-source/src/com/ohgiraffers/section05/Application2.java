package com.ohgiraffers.section05;

public class Application2 {
    public static void main(String[] args) {
        //논리 연산자의 우선순위에 대해 이해하고 활용하기

        // 1. 1부터 100 사이의 값 확인
        int num1 = 55;
        System.out.println("1부터 100사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        // 2. 영어 대문자 인지 확인
        char ch1 = 'g';
        System.out.println("영어 대문자인지 확인 : "+ (ch1 >= 'A' && ch1 <='Z'));

        //대소문자 상관없이 영문자 y인지 확인
        char ch2 = 'Y';
        System.out.println("영문자 y인지 확인 : "+ (ch2 == 'Y' || ch2 == 'e'));


        //영문자인지 확인 (대문자 또는 소문자)
        //    && 는 || 보다 우선순위가 높다!!!!!!!!
        //괄호로 묶지 않이도 올바르게 연산 되지만 논리적으로 먼저 실행되는 내용을 묶어주면 코드를 읽을때 파악하기 좋다.
        char ch3 ='F';
        System.out.println("영문자인지 확인 : "+ ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <='Z')));
    }
}
