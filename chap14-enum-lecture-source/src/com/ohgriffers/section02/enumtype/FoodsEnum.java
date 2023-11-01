package com.ohgriffers.section02.enumtype;

import com.ohgriffers.section01.intenum.Foods;

public enum FoodsEnum {
    //작성 순서대로 0부터 값이 자동으로 부여된다
    MEAL_AN_BUTTER_KIMCHI_STEW(0),  //단 하나의 객체
    MEAL_MINT_SEAWEED_SOUP(1),  //..
    MEAL_BUNGEOPPANG_SUSHI(2), //..

    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DRINK_RAW_CUTTLEFISH_SHAKE(2);

    private final int value;

    //추가된 필드
    private final int var = 10; //선언과 동시에 초기화 해서 씀 final이어야 함

    FoodsEnum(int value){ this.value = value; } //012 012 로 되겠끔 씀

    //추가된 메소드
    public void printVar(){
        System.out.println("printVar : "+ var);
    }

    @Override
    public String toString() {return  this.name().toLowerCase(); } //name()을 소문자로 만드는 가공처리
}
