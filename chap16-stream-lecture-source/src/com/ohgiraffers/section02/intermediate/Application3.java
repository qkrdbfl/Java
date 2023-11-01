package com.ohgiraffers.section02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        //스트림의 중계 연산중 하나인 flatMap에 대해 이해하기
        //Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        //중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어준다
        //이러한 작업을 플래트닝(flattening)이라고 한다

        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","SPRING","SPRINGBOOT"),
                Arrays.asList("java","spring","springboot")
        );
        System.out.println("list = "+ list);

        // List -> Stream(가공) -> List
        List<String> flatList = list.stream()//list.stream가 Stream <List<String>>에서
                .flatMap(Collection :: stream) //Stream<String> 으로 한꺼풀 벗고
                .collect(Collectors.toList()); //List<String>으로 바뀐것

        System.out.println("flatList = " + flatList);
    }
}
