package com.ohgiraffers.sectuon02.problem3;

public class Applcation {
    public static void main(String[] args) {

        //필드에 직접 접근 시 발생하는 문제를 해결하는 방법을 이해하기

        //Monster 클래스의 필드를 name ->kids로 변경하면 setInfo 메소드와 getInfo 메소드는 변경해야함
        //하지만 사용자 (클라이언트)의 호출 코드는 변경안해도 됨
        //따라서 유지보수성이 향상
        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("미라");
        monster2.setHp(300);


        Monster monster3 = new Monster();
        monster3.setInfo("박쥐");
        monster3.setHp(500);


        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());


        //_______________________________________
        monster3.kinds = " 두치";
        monster3.hp = 200;
        System.out.println("monster3 kinds : "+ monster3.kinds);
        System.out.println("monster3 hp : "+ monster3.hp);

        //--> 매소드로 간접 접근하는 방법은 만들었지만 여전히 직접접근이 가능하므로 직접접근ㄴ을 못하도록 강제화(캡슐화) 하는 처리를 추가한다
    }
}
