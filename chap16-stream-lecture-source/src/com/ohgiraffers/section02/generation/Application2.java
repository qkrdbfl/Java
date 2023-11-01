package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        //기본 타입 스트림 생성에 대해 이해하기

        //range(시작값, 종료값) : 시작 값부터 1씩 증가하는 숫자로 종료 값까지의 범위의 스트림 생성
        //rangeClosed(시작값, 종료값) : 시작 값부터 1씩 증가하는 숫자로 종료 값 까지의 멈위의 스트림 생성
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();
        System.out.println("=============================");


        //Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할수 있다
        //doubles(갯수) : 난수를 활용한 DoublesStream을 갯수만큼 생성하여 반환함
        //boxed() : 기본 타입 스트림인 XXXStream을 박싱하여 Wrapper타입의 Stream<XXX>로 반환한다
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + ""));
        System.out.println();
        System.out.println("=============================");


        //문자열을 intStream으로 변환
        IntStream helloWorldChars = "hello World".chars();
        helloWorldChars.forEach(v -> System.out.print(v + " "));
        System.out.println();
        System.out.println("=============================");


        //문자열을 split하여 stream으로 생성
        Stream<String> splitStream = Pattern.compile(" , ").splitAsStream("html, css ,javascript");
        splitStream.forEach(System.out::println);
        System.out.println("=============================");


        //Stream.Of() 을 이용한 생성
        Stream<String> stringStream1 = Stream.of("java", "oracle", "jbdc");
        Stream<String> stringStream2 = Stream.of("html", "css", "javascript");

        //스트림은 1회성으로 사용 가능하며 이미 열린 스틂은 재사용이 불가하다
        //재사용할 경우 :
        //java.lang.IllegalStateException: stream has already been operated upon or closed 발생 */
        //stringStream1.forEach(System.out::println);
        //stringStream2.forEach(System.out::println);

        //concat() 를 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠수 있다
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(v -> System.out.println(v + " "));


    }
}
