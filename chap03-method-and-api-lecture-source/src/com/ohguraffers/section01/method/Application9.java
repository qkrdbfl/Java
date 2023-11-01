package com.ohguraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        //다른 클래스에 작성된 메소드를 호출 가능//
        int first = 100;
        int second = 50;

        // 1. non-static 메소드 호출
        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first,second);

        System.out.println("둘 중 최소 값은? : "+ min);


        // 2. static 메소드 호출
        int max = Calculator.maxNumberOf(first,second);

        System.out.println("둘 중에 최대 값은? : "+ max);


        //!!! 주의 사항 !!!//

        //static 메소드도 non- statuc 메소드처럼 호출 가능하지만 권장 ㄴㄴ.
        int max2 = cal.maxNumberOf(first, second);
        System.out.println("둘 중 최대 값은? : "+ max2);// 에러는 안나도 추천은 안함
    }
}
