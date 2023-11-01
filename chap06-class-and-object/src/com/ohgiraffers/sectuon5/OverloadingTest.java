package com.ohgiraffers.sectuon5;

public class OverloadingTest {

    //오버로딩에 대해 이해할수 있다

    //오버로딩의 사용이유
    //매개변수의 종류 별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있는데
    //동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고 관리하기 어렵기 떄문에
    //오버로딩을 사용한다. ex) system.out.println()

    //오버로딩의 조건//
    public void test() {}

    //메소드의 시그니처가 같으면 compile ettor를 발생시킴
    //메소드 시그니처란?
    //메소드의 메소드명과 파라미터 선언부를 의미
    //접근제한자나 반환형을 오버로딩 성립 요건에 해당되지않음
    //public void test() {} // test() <--시그니처 부분

    //private void test() {}// 다중복이다 앞에 퍼블릭과 타입을 바꿔도 소용없다.

    //public int test() {return 0;}

    public void test(int num) {} // 시그니처 부분 'test(int num)' 이 달라져서 에러안남

    //매개변수 이름은 오버로딩과 무관하다
    //public void test(int num2) {}

    public void test(int num1, int num2) {} //test(int num2)과 test(int num1, int num2)는 확실히 구분됨

    public void test(int num, String name) {} //시그니처 부분이 달라야하고 타입, 갯수, 순서가 다 달라야함

    public void test(String name, int num) {}



}
