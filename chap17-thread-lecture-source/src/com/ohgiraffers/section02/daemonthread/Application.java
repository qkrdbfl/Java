package com.ohgiraffers.section02.daemonthread;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //일반 스레드는 메인 스레드가 종료 되어도 본인의 작업을 마저 실행함
        //데몬 스레드로 생성한 스레드는 메인 스레드가 종료 될떄 함께 종료한다

        Thread t = new CountDown();
        Scanner sc = new Scanner(System.in);

        //setDaemon(true) 설정으로 해당 스레드를 데몬 스레드로 만들수 있다
        //단, start() 호출 이전에 작성해야함. 그렇지 않으면 에러가 발생한다.
        t.setDaemon(true); //무적권 시작하기 전에 호출되어야 함 //자리 순서//
        t.start(); //얘보다 데몬이 먼저!

        System.out.print("아무거나 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("입력한 값 : "+str);
        System.out.println("========= main end");

    }
}
