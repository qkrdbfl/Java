package com.ohgiraffers.sectuon02.problem1;

public class Applicatuon1 {
    public static void main(String[] args) {
        //필드에 직접 접근하는 경우 발생하는 문제점을 이해하기
        //클래스이름  변수명 = new 클래스이름()
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);


        Monster monster2 = new Monster();
        monster2.name = "깨비";
        //hp(체력)는 음수일수가 없음
        monster2.hp = -200; //직접 접근의 문제 1. 필드에 올바르지 않은 값이 들어가도 통제가 안됨

        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "몬스";
        monster3.setHp(-200); //간접 접근

        System.out.println("monster1 name : " + monster3.name);
        System.out.println("monster1 hp : " + monster3.hp);

        //잘못된 값을 검증하여 필드 값을 수정하는 기능을 메소드로 정의 해두고
        //메소드로 간접 접근하게 하면 위에서 발생한 문제를 해결할수 있다

    }
}
