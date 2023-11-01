package com.ohgiraffers.section02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        //스트림의 중계 연산 중 하나인 map에 대해 이해하기
        //Stream<R> map(Function<? super T, ? extends R> mapper);
        //스트림에 들어있는 데이터를 특정 람다식을 통해 가공하고 새로운 스트림에 담아주는 역할을 함
        IntStream intStream = IntStream.range(1, 10); //1~9

        intStream
                .filter(i -> i % 2 == 0) //2 4 6 8 에 *5를 곱한값이
                .map(i -> i * 5)//map에 새로운 intStream가 반환
                .forEach(System.out::println); //반복문 없이 간결하게 사용할수 잇다는 장점! //함수형 프로그래밍 이라고 함
    }
}
