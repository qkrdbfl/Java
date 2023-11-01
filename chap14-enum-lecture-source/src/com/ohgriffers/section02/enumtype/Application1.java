package com.ohgriffers.section02.enumtype;

public class Application1 {
//    private static final int MEAL_AN_BUTTER_KIMCHI_STEW = 0;
//    public static final int DRINK_RADISH_KIMCHI_LATTE =0;

    public static void main(String[] args) {
        //열거형 (enum) 을 이용하여 상수 열거 패턴의 단점을 해결하는 것을 이해할수있다

        //1. 열거 타입은 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다

        //2. 열거 타입은 컴파일 타임 타입 안정성을 높여준다
//        boolean isTrue = enumTest(MEAL_AN_BUTTER_KIMCHI_STEW,DRINK_RADISH_KIMCHI_LATTE); //정확하게 FoodsEnum이라고 명시해줘야 함
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println(isTrue ? "같은 값" : "다른 값");

        //3.열거 타입은 상수 이름을 문자열로 출력할수 있다
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);

        //4. 열거 타입에 메소드나 필드를 추가할수 있다
        //근본적으로 불변이라 모든 필드는 final이어야 한다

        //5. 열거 타입도 클래스이기 떄문에 toString()을 재정의 하여 사용가능
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW.toString());

        //6. 열거 타입에 선언된 상수를 제거하더라도 삭제 된 상수를 참조하고 있는 곳에
        //컴파일 에러를 출력해주기 때문에 안전하다 //장점

        //7. 열거 타입 내에 선언된 상수들을 순회할수 있다
        for (FoodsEnum food : FoodsEnum.values()) {
            System.out.println("food = " + food); //어떤값이 있는지 전부 알수있는 코드가 됨
        }

    }

    private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2) { //FoodsEnum을 타입이라고 생각하며됨
        if (foodsEnum1 == foodsEnum2) {
            return true;
        }
        return false;
    }


}
