package com.ohgiraffers.section02.looting;

import java.util.Scanner;

public class C_doWhile {
    public void tesrSimpleWhileExample(){
        //do While문 단독 사용에 대한 흐름이해하기
        do {

            System.out.println("최초 한번 동작함..");
        } while (false);
        System.out.println("반복문 종료됨..");
    }
    public void tesrSimpleWhileExample1(){
        //키보드로 문자열 입력 받아 반복적 출력
        //단, "exit" 가 입력되면 반복문 종료
        Scanner sc= new Scanner(System.in);
        String str = "";
        do {
            System.out.println("문자열 입력 : ");
            str = sc.nextLine();
            System.out.println(str);
           //문자열은 == 비교가 불가능하다. 문자열이 같은지 비교하는 기능을
           //equals() 메소드로 제공한다.
        } while (!str.equals("exit"));
        System.out.println("프로그램 종료");
    }
 }

