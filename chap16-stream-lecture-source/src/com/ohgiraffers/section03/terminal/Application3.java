package com.ohgiraffers.section03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        //스트림의 최종 연산 중 하나인 collect에 대해 이해하기
        //collect()는 Collector 타입을 받아서 처리하는데, 해당 메소드를 통해 컬렉션을 출력 받을수 있다
        //collect() 메소드는 Collector 객체에서 제공하는 정적 메소드를 사용할수 있다

        //collect()는 모으다라는 뜻이고 스트림안에 있는걸 모아서 내보내는것임

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testname01"),
                new Member("test02", "testname02"),
                new Member("test03", "testname03")
        );
        List<String> collectorCllection = memberList
                                        .stream()
                                        .map(Member::getMembername)
                                        .collect(Collectors.toList()); //name부분만 나옴

        System.out.println("collectorCllection = "+ collectorCllection);


        String str = memberList
                    .stream()
                    .map(Member::getMembername)
                    .collect(Collectors.joining()); //joining는 다 하나의 문자열로 합친다는 뜻

        System.out.println("str = "+ str);


        String str2 = memberList
                .stream()
                .map(Member::getMembername)
                .collect(Collectors.joining(" || ", "**", "**")); //접두사 **// 접미사** //중간마다 ||

        System.out.println("str2 = "+ str2);
    }
}
