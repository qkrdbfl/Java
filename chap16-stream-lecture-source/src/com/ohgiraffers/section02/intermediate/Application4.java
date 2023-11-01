package com.ohgiraffers.section02.intermediate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        //스트림의 중계 연산 중 하나인 sorted에 대해 이해하기

        //Stream<T> sorted();
        //Stream<T> sorted(Comparator<? super T> comparator);
        // 인자없이 호출할 경우 오름차순으로 다종 정렬함.
        //별도의 비교 로직을 구현하고 싶으면 Comparator 를 인자로 넘겨준다

        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35)
                .boxed() // <-- Stream에 <Integer>가 들어가게 됐다
                .sorted()//만약 .sorted((a,b) ->a = b) 로 하면 내림 차순으로 됨 //sorted는 전달받은걸 정렬해주는 키워드
                .collect(Collectors.toList()); //List로 다시 만든다

        System.out.println("integerList = "+ integerList);
    }
}
