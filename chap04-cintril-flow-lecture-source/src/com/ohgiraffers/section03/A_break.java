package com.ohgiraffers.section03;

public class A_break {
    public void tesrSimpleBreakStatement() {
        //break문 사용에 대한 흐름 이해하기

        //break문을 이용하여 무한루트를 활용한 1~100까지의 합계 구하기
        int sum = 0; //합계 저장
        int i = 1;
        while (true) {
            sum += i++;
            if (i > 100) {
                break; //와일문의 무한 루프를 탈출할 구문이 생겨서
            }
        }
        System.out.println("sum : " + sum); // 이 동작이 실행
    }

    public void tesrSimpleBreakStatement2() {
        //중첩 반복문 내 break문 사용에 대한 흐름 이해하기
        //break는 모든 반복문을 종료하는 것이 아니라 자신에게 가장 인접한 반복문의 실행만 탈출한다!

        //구구단 2~9단을 출력하되 곱해지는 수가 5보다 큰 경우는 출력하지 않는다
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("===================");
            for (int su = 1; su < 10; su++) {
                if (su > 5) {
                    break;
                }
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }
        }
    }

    public void tesrjumpBreak() {
        //중첩 반복문 내 break문 사용시 jump(goto)에 대한 흐름 이해하기
        label :
        for (; ; ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 3) {
                    break label; // 라벨까지 브레이크 할거야 라는 뜻
                }
            }
        }
    }


}
