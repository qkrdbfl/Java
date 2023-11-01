package com.ohgiraffers.section03.interfaceimplements;

//인터페이스는 다중 상속이 다능하다 implements 뒤에 인터페이스를 나열하면 됨
//클래스 상속(extends Object)을 하면서 인터페이스(implements) 구현도 가능
//extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다 // 순서 지키기 !
public class Product extends Object implements InterProduct, java.io.Serializable {

    //interProduct의 추상 메소드는 반드시 구현 해야함 (오버라이딩 강제)
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProductd의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProductd의 abstMethod 오버라이딩한 메소드 호출");
    }

    //static 메소드는 오버라이딩 할수 없음
//    @Override
//    public static void staticMethod(){}

    //default 메소드는 인터페이스 내에서만 작성 가능
//    @Override
//    public default void defaultMethod(){}

    //default 키워드를 제외하면 오버라이딩 가능함
    //오버라이딩이 강제화 되어있지는 않음 //하고싶음하고 아님 말고
    @Override
    public void defaultMethod(){
        System.out.println("Product 클래스의 defaultMethod 호출");
    }
}
