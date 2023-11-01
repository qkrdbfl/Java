package com.ohgriffers.section01.intenum;

public class Application1 {
    public static void main(String[] args) {
        //정수 열거 패턴과 이의 단점을 이해하기

        //1. 타입 안전을 보장할 방법이 없으며 에러 디버깅이 어렵다
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW; //상수값 : 0;
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;     //상수값 : 0;

        if (food == 0) {
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }
        if (food == Foods.DRINK_RAW_CUTTLEFISH_SHAKE) {
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }
        //둘다 상수 0이라는 값을 가지고 잇어서 이를 구분할수 없음

        //2. 정수형 상수는 문자열로 출력하기 어렵다
        //경우에 따라서는 상수 값을 문자열로 사용해야하는 경우가 있는데 문자열로 출력하기 까다롭다
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);

        //단점들
        //3. 정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지않다

        //4. 정수 열거 패턴으로 상수가 선언된 경우 상수에 변경이 발생하면 컴파일을 새로 해야한다


    }


}

