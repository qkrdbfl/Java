package com.ohgiraffers.section02.abstractclass;

//추상 클래스를 상속받을 경우 추상 클래스를 반드시 오버라이딩 해야 함!( 오버라이딩 강제임! )
public class SmartPhone extends Product{
    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 absMethod 를 오버라이딩 한 메소드 호출");
    }
    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출");
    }



}
