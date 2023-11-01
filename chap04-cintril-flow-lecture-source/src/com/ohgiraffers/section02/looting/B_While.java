package com.ohgiraffers.section02.looting;

import java.util.Scanner;

public class B_While {
    public void tesrSimpleWhileStatement() {
        //while문 단독 사용에 대한 흐름 이해하기

        //1부터 10까지 1씩 증가하면서 i값을 10번 출력하는 반복문
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void tesrSimpleWhileExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String str = sc.nextLine();
        // charAt() : 문자열에서 인덱ㄱ스에 해당하는 문자를 char형으로 반환하는 기능
        //length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환 하는 기능
        //index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한개 작은 숫자를 가진다.
        //존재하지 않는 인덱스에 접근시 에러 발생
        //while문
        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            System.out.println(index + " : " + ch);
            index++;
        }
        //for문으로 바꿔보기
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }

    }

    public void tesrSimpleWhileExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i++;
        }
        System.out.println("1부터 입력 받는 정수 " + num + "가지의 합은 " + sum + "입니다.");
    }

    public void tesrSimpleWhileExample3() {
        //중첩 while문을 이용한 구구단
        int dan = 2;
        while (dan < 10) {
            System.out.println("======== " + dan + "단 ==========");
            int su = 1;
            while (su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));

                su++;
            }
            dan++;
        }


    }


}
