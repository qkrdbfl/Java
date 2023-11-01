package com.ohgiraffers.section02.intermediate;

import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        //스트림의 중계 연산 중 하나인 filter에 대해 이해하기

        //Stream<T> filter(predicate<? super T> predicate);
        //필터는 스트림에서 특정 데이터만 걸러내는 메소드다
        //매개변수로 받는 predicate는 boolean을 리턴하는 함수형 인터페이스다.
        IntStream intStream = IntStream.range(0, 10); //filter가 하나씩 비교하면서 트루 펄스 해주는것임
        intStream.filter(i -> (i % 2) == 0).forEach(i -> System.out.print(i + " ")); //트루면 짝수만 필터링 하겠습니다 라는 말임
    }
}
