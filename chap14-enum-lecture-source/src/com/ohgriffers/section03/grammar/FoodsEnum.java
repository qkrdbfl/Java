package com.ohgriffers.section03.grammar;

public enum FoodsEnum {
    //작성 순서대로 0부터 값이 자동으로 부여된다
    MEAL_AN_BUTTER_KIMCHI_STEW(0,"앙버터김치찜"),  //단 하나의 객체
    MEAL_MINT_SEAWEED_SOUP(1,"민트미역국"),  //..
    MEAL_BUNGEOPPANG_SUSHI(2,"붕어빵초밥"), //..
    DRINK_RADISH_KIMCHI_LATTE(0,"열무김치라뗴"),
    DRINK_WOOLUCK_SMOOTHIE(1,"우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(2,"생갈치쉐이크");

    private final int value;

    private final String name;

   FoodsEnum(int value, String name){
       this.value = value;
       this.name = name;
   }

    public int getValue(){return value;}
    public String getName() {return name;}
}
