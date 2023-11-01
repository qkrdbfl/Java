package com.ohguraffers.section03.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        //패키지에 대해 이해하기
        //클래스명은 원랴 패키지명을 포함하고 있다.
        //다른 패키지에 존재하는 클래스를 사용하는 경우에는 클래스명 앞에 패키지명을 명시해서 풀 클래스명을 사용해야 함
        com.ohguraffers.section01.method.Calculator cal = new com.ohguraffers.section01.method.Calculator();
        int min = cal.minNumberOf(30,20);
        System.out.println("30과 20 중 더 작은 값은? : "+ min);

        int max = com.ohguraffers.section01.method.Calculator.maxNumberOf(30,20);
        System.out.println("30과 20 중 더 큰 값은? : "+ max);
    }
}
