package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void tesrSimpleIfStatement() {
        //if문 단독 사용에 대한 흐름을 이해하고 적용하기//

        //정수 한 개를 입력받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다" 라고 출럭
        //짝수 아니면 축력 안함 단 조건과 상관없이 프로그램 종료되면
        //"프로그램을 종료합니다" 라고 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한개를 입력 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement() {
        /* 중첩 된 if문의 흐름을 이해하고 적용할 수 있다. */

        /* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하고
         * 그 수가 짝수이면 "입력하신 숫자는 짝수입니다"라고 출력한다.
         * 짝수가 아니면 출력하지 않는다. 단, 조건과 상관 없이 프로그램이 종료 될 때
         * "프로그램을 종료합니다"라고 출력한다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력 : ");
        int num = sc.nextInt();

        if(num > 0) {
            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}

