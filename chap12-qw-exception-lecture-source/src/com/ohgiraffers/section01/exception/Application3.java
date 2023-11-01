package com.ohgiraffers.section01.exception;

public class Application3 {
    public static void main(String[] args) {
        //try catch 블럭을 이요하여 예외처리를 할수 있다
        ExceptionTest et = new ExceptionTest();

        try {
            //try 블럭에는 예외 발생 가능성이 있는 코드를 호출한ㄴ다
            et.checkEnoughMoney(50000,10000);

            //위의 메소드 호출시 예외가 발생하지 않는 경우 이후 내용은 마저 실행된다
        System.out.println("==========상품 구입=============");
        } catch (Exception e){

            //try 블럭에서 예외 발생시 catch 블럭의 코드가 실햄됨
            //이때 예외 발생 위치 하단의 코드는 동작하지 않음
            System.out.println("==========상품구입 불가==========");
        }
        System.out.println("프로그램 종료");

        //try catch 블럭을 이용하면 exception이 발생해도
        //다시 프로그램의 정상 흐름으로 돌아오도록 예외처리된다
    }
}
