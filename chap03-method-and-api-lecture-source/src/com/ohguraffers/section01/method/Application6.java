package com.ohguraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        //메소드 리턴 값을 이해하고 활용//
        Application6 app6 = new Application6();
        app6.testMethod();

        //메소드의 반환 값이 있을경우 반환 값에 변수를 담을수 있음.
        String returnText = app6.testMethod();
        System.out.println("returnText : "+ returnText);

        //변수에 저장하지 않고 바로 출력도 가능하다.
        System.out.println(app6.testMethod());
    }

    public String testMethod(){    // 반환하고 싶으면 거기에 void 대신 맞는 타입쓰기 :예 string

        return "hello World";
    }
}
