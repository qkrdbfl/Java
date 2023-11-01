package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 먹고있다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려간다. 깡총");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 낸다. 끼익");
    }

    public void jump(){
        System.out.println("토끼가 점프합니다. 점프");
    }

}
