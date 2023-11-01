package com.ohguraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        //메소드 리턴에 대해 이해하기.

        System.out.println("main() 메소드 시작함....");

        Application5 app5 =new Application5();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨....");
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인....");

        return;      //메소드 경우 리턴을 작성해주지 않아도 컴파일러가 항상 추가로 넣어줌
        //return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어다.


        // 에러// return 이후에 명령문을 작성할수 없음.
        // System.out.println("test");

    }
}
