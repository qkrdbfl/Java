package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        //스트림의 병렬 처리에 대해 이해하기
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "oracle", "jbdc", "html", "css"));

        //모든 작업은 기본적으로 main 스레드에서 일어난다
        System.out.println("============ foreach"); // 이건 main 스레드라는 애가 혼자 일한것이고
        for (String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());//Thread.currentThread().getName()//Thread에 이름을 알려주세요 라는 뜻
        }
        for (String s : stringList) {
            System.out.println(s + " : " + Thread.currentThread().getName());
        }
        //일반적인 스트림도 main 스레드에서 작업을 수행한다
        System.out.println("========== normal stream");
        stringList.forEach(Application2::print);// 이것도 main 스레드라는 애가 혼자 일한것이고
        stringList.forEach(Application2::print);

        //병렬 스트림인 경우 자동으로 병렬처리가 되며 성능상 유리하다
        //스트림을 활용하면 병렬처리가 손쉽다는 것이 장점이다
        System.out.println("============ paralle stream");
        stringList.parallelStream().forEach(Application2::print);//parallelStream가 병렬 스트림이 되었다
        stringList.parallelStream().forEach(Application2::print); //이건 여러명이서 처리를 한것이라고 보면됨 성능적으로 좋음


    }
    private static void print (String str){
        System.out.println(str+ " : "+ Thread.currentThread().getName());
    }
}
