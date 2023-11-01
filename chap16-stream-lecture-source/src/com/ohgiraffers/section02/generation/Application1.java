package com.ohgiraffers.section02.generation;

import java.util.*;
import java.util.stream.Stream;


public class Application1 {
    public static void main(String[] args) {
        //배열이나 컬렉션을 이용하여 스트림을 생성하는 방법을 이해하기

        //배열 스트림 생성
        String[] sarr = new String[]{"java", "oracle", "jbdc"};
        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
        strStream2.forEach(System.out::println);
        System.out.println("============================");

        //컬렉션 스트림 생성
        List<String> stringList = Arrays.asList("html","css","javascript");
        Stream<String> strStream3 = stringList.stream();
        strStream3.forEach(System.out::println);
        System.out.println("============================");

        //Builder를 활용한 스트림 생성
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길") //자기자신을 돌려주기 떄문에 메소드 체인지가 가능함 그래서 .add 를 찍어서 추가한것
                .build();

                builderStream.forEach(System.out::println);
        System.out.println("============================");

        //iterator()를 활용하여 수열 형태의 스트림을 생성하기
        Stream<Integer> intStream = Stream.iterate(10,value ->value*2).limit(10);
        intStream.forEach(value -> System.out.println(value+" ")); //출력하는 방식을 람다식 규칙으로 해봄



    }
}
