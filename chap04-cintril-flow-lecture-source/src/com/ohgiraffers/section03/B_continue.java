package com.ohgiraffers.section03;

public class B_continue {
    public void tesrSimplecontinueStatement1() {
        //continue문 사용에 대한 흐름 이해하기

        //1부터 100사이의 4의 배수이면서 5의 배수인 값 출력
        for (int i = 1; i < 100; i++) {

            //4의 배수가 아니거나 5의 배수가 아닌경우//
            if (i % 4 != 0 || i % 5 != 0) {
                continue; //4배수도 안고 5배수도 아니면
                //i를 출력안하고 점프해서 다시 포문으로 넘어가서 돈다
            }
            System.out.println(i);
        }

    }

    public void tesrSimplecontinueStatement2() {
        //중첩 반복문 내 continue문 사용에 대한 흐름을 이해하기
        //continue는 모든 반복문을 건너 뛰는 것이 아니고 자신에게 가장 인접한 반복문의 실행만 건너뛴다

        //구구단 2~9단을 출력하되 곱해지는 수가 짝수인 경우는 출력 안함
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("===================");
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }

        }
    }

    public void tesrSimplecontinueStatement3() {
        //중첩 반복문 내 continue문 사용시 jump(goto)에 대한 흐름을 이해하고 적용할 수 있다
        label:
        for (int dan = 2; dan < 10; dan++) {
            System.out.println("===================");
            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0) {
                    continue label;
                }
                System.out.println(dan + "*" + su + "=" + (dan * su));
            }
        }

    }


}
