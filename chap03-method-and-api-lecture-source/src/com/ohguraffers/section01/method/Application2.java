package com.ohguraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        //다른 흐름의 메소드 호출 흐름에 대해 이해하기.//

        System.out.println("main() 시작됨....");

        //작성한 메소드를 호출한다
        //클래스명 사용할 이름 =new 클래스명 (); //객체생성
        //사용할 이름. 메소드명 ();          // 메소드 호출

        Application2 app2 =new Application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨...");

    }

    public void  methodA ()  {
        System.out.println("methodA()  호출됨....");
        System.out.println("methodA() 종료됨...");
    }
    public void  methodB () {
        System.out.println("methodB()  호출됨....");
        System.out.println("methodB() 종료됨...");
    }
    public void  methodC () {
        System.out.println("methodC()  호출됨....");
        System.out.println("methodC() 종료됨...");
    }
}
