package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        //예외에 대해 이해하고 이를 처리하기 위한 문법을 이용할수 있다

        ExceptionTest et = new ExceptionTest();

        //예외처리가 강제화 된 메소드를 호출하는 경우 반드시 예외처리를 해야함
        //그중 첫번째 방법인 throw로 예외를 위임해본다
        //exception 발생시 예외처리를 위임하면 호출했던 메소드가 그 처리를 해야한다
        //main 메소드까지 예외를 throws하게 되면 프로그램은 비정상 종료된다
        et.checkEnoughMoney(10000,50000);

        et.checkEnoughMoney(50000,10000);

        System.out.println("프로그램을 종료합니다");

    }
}
