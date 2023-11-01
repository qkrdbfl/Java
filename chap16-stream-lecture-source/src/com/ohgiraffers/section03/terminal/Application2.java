package com.ohgiraffers.section03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        // 스트림의 최종연산 중 하나인 reduce에 대해 이해하기

        OptionalInt reduceOneParam = IntStream.range(1, 10)
                .reduce((a, b) -> { //reduce <- 쓰면 반복한다
                    System.out.println("a : " + a + ", b : " + b);
                    return Integer.sum(a, b); //int값을 .reduce((a, b)에 반환 //sum메소드에 a + b 해라 하는 것
                });

        System.out.println("reduceOneParam = " + reduceOneParam.getAsInt());

        //reduce에 인자를 2개 전달 할때는 첫번쨰 인자가 초기값으로 기능하며 reduced의 결과 값이
        //반드시 존재하므로 OptionalInt 타입이 아닌 int 타입이 반환 값으로 설정 되어 있다.
        //OptionalInt  reduceTwoParam = IntStream.range(1,10)
        int reduceTwoParam = IntStream.range(1,10)
                .reduce(100,Integer::sum); //초기값으로 100을 준것

        System.out.println("reduceTwoParam = "+ reduceTwoParam);
    }
}
