package com.ohguraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        //메소드 전달인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출시 사용가능.

        // 1. 전달 인자로 값 전달 테스트
        //호출하려는 메소드의 매개변수 선언부에 미리 선언해준 자료형과,갯수, 순서가 일치하게 값을 넣어 호출해야함
        Application3 app3 = new Application3();
        app3.testMethod(27);
        //app3.testMethod("27"); //int 아니어서 안댐
        //app3.testMethod(27.29); // 두개전달해서 안댐
        //app3.testMethod();    //아무것도 안 넣으면 안댐

        // 2. 변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);

        // 3. 자동 형변환을 이용한 값 전달 테스트
        byte byteAge = 10;
        app3.testMethod(byteAge);

        // 4. 강제 형병환을 이용한 값 전달 테스트
        long longAge = 80;
        app3.testMethod((int) longAge); // long으로 굳이 한다면 강제형변환.

        // 5. 연산 결과를 이용한 값 전달 테스트
        app3.testMethod(age*3);
       }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 "+ age +"세 입니다.");
    }
}
