package com.ohgiraffers.section03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        //스트림의 최종 연산 중 하나인 match에 대해 이해하기
        List<String> stringList= Arrays.asList("java","Spring","SpringBoot");

                         //stringList.stream().anyMatch(str -> str.contains("p")); //anyMatch는 매치되는게 있는지 없는지 블리언 타입으로 나옴
        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));//p라는 문자가 포함되어있냐는걸 봄
        boolean allMatch = stringList.stream().allMatch(str -> str.length() > 3); //allMatch는 전부 매치되는거 있냐라고 물어보는것
        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("c")); //noneMatch는 매치되는거 없지? 라고 물어보는것

        System.out.println("anyMatch = "+ anyMatch);
        System.out.println("allMatch = "+ allMatch);
        System.out.println("noneMatch = "+ noneMatch);
    }
}
