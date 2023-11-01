package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void tesrSimpleIfStatement() {
        //if-else문 단독 사용에 대한 흐름 이해하기

        /* 정수 하나를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 프로그램을 만들어본다.
         * 단, 조건과 상관 없이 프로그램이 종료 될 때 "프로그램을 종료합니다."라고 출력 되도록 한다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        /* 조건식은 반드시 true 혹은 false가 나오도록 작성해야 한다. */
        /* 짝수인지 조건 확인 */
        if (num % 2 != 0) {
            /* 조건문이 참일 때 출력할 내용 */
            System.out.println("입력 하신 숫자는 홀수입니다.");
        } else {
            /* 조건식이 거짓일 때 출력할 내용 */
            System.out.println("입력 하신 숫자는 짝수입니다.");
        }
        /* 조건문과 상관 없이 프로그램 종료 시 출력할 내용 */
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseIfStatement() {
        /* 정수 하나를 입력 받아 그 수가 홀수 이면 "입력하신 숫자는 홀수입니다." 라고 출력하고,
         * 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 프로그램을 만들어본다.
         * 단, 0이면 "0입니다."라고 출력한다.
         * 조건과 상관 없이 프로그램이 종료 될 때 "프로그램을 종료합니다."라고 출력 되도록 한다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        /* 0인지 아닌지 조건 확인 */
        if (num != 0) {
            /* 0인 경우에 다시 한 번 조건을 비교함 */
            /* 0보다 큰 숫자인지 확인 */
            if(num % 2 != 0) {
                /* 0보다 더 큰 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 홀수입니다.");
            } else {
                /* 0보다 더 작은 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        } else {
            /* 0인 경우 출력할 내용 */
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        /* 조건문과 상관 없이 프로그램 종료 시 출력할 내용 */
        System.out.println("프로그램을 종료합니다.");
    }

}