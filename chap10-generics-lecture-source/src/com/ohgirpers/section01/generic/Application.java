package com.ohgirpers.section01.generic;

public class Application {
    public static void main(String[] args) {
        //제네릭에 대해 이해하기

        //제네릭의 사전적 의미는 일반적인 이라는 의미다
        //자바에서 제네릭은 데이터 타입을 일반화 한다는 의미를 가진다.

        //타입을 intger로 인스턴스 생성
        GenericTest<Integer> gy1 = new GenericTest<>();

        gy1.setValue(10);
        System.out.println(gy1.getValue());
        System.out.println(gy1.getValue() instanceof Integer);

        //타입을 String 으로 인스턴스 생성
        GenericTest<String> gt2 = new GenericTest<>();

        gt2.setValue("홍박사");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        //제네릭 프로그래밍! 장점,특징
        //데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질수 있는 기술에 중점을 두어
        //재사용성을 높일수 있는 프로그래밍 방식이다

        //제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시에 지정한다
        //컴파일 시에는 미리 타입 검사를 시행하면 객체의 타입 안정성을 높일수 있으며(잘못된 타입일 경우 컴파일 에러를 발생시킴))
        //반환 값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해짐. (instanceof 비교 및 다운캐스팅 작성 불필요)
        //JDK 1.5 버전부터 추가된 문법.
    }
}
