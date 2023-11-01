package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹는다");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 잘 달리지 않는다. 어슬렁 걸어간다");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖는다. 어흥");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯는다. 크앙");
    }
}
