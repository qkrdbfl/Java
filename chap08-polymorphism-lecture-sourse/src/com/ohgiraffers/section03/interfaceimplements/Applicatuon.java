package com.ohgiraffers.section03.interfaceimplements;

public class Applicatuon {
    public static void main(String[] args) {
        //인터페이스에 대해 이해하기

        //인터페이스는 인스천스화 불가능
        //interProduct interProduct= new interProduct();


        //다형성을 이용하여 레퍼런스 타입으로 사용가능
        InterProduct interProduct =new Product();

        interProduct.nonStaticMethod();
        interProduct.abstMethod();

        interProduct.defaultMethod();

        InterProduct.staticMethod();

        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_MAX);

        //인터페이스 사용이유?
        //1. 추상 클래스와 비슷하게 필요한 기능을 공통화 해서 강제성을 부여할 목적으로 사용(표준화)
        //2. 자바의 잔일 상속의 단점을 극복 가능 (다중 상속)
    }
}
