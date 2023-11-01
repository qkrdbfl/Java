package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    //추상 클래스는 필드를 가질수 있다
    private int nonStaticField;
    private static int staticField;

    //추상 클래스는 생성자도 가질수 있다
    //단, 직접적으로 인스턴스를 생성할수 있다
    public Product(){}

    //추상클래스는 일반적인 메소드를 가질수 있다
    public void NonStaticField(){
        System.out.println("Product 클래스의 NonStaticField 호출");
    }

    public static void StaticMethod(){
        System.out.println("Product 클래스의 StaticMethod 호출");
    }

    //미완성 메소드 (추상 메소드) 작성
    //추상메소드가 존재하는 경우 반드시 클래스에 abstract 키워드를 붙여 추상클래스로 만들어야 댐!
    //추상메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 붗여 추상 클래스로 만들수 있음
    public abstract void abstMethod(); // 세미콜론을 꼭 붙인다 껍데기만.



}
