package com.ohgiraffers.section01.polymorphism;

public class Application01 {
    public static void main(String[] args) {

        System.out.println("Animal 생성 ======================");
        Animal animal= new Animal();
        animal.eat();
        animal.run();
        animal.cry();


        System.out.println("Animal 생성 ======================");
        Rabbit rabbit= new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();


        System.out.println("Animal 생성 ======================");
        Tiger tiger= new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        //Rabbit과 Animal 클래스를 상속 받았으므로
        //Rabbit은 Rabbit은타입이기도 하면서 Animal타입이기도 하다
        //Tiger는 Tiger타입이기도 하면서 Animal 타입이기도 하다

        //부모 타입으로 자식 인스턴스의 주소 값 참조가 가능하다
        Animal a1 = new Rabbit();
        Animal a2 = new Tiger();

        //하지만 반대로 Animal은 Tiger 나 Rabbit이 아니다
//        Rabbit r = new  Animal();
//        Tiger t = new  Animal();

        //동적 바인딩
        //컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가(정적바인딩)
        //런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것(동적바인딩)
        System.out.println("===============동적 바인딩 확인");
        a1.cry();
        a2.cry();

        //현재 레퍼런스 변수의 타입은 Animal 이기 떄문에 Rabbit 과 Tiger 가 가지고 있는 고유 기능을 호출 못함
//        a1.jump();
//        a2.bite();

        //타입 형변환
        //객체별로 고유한 기능을 동작 시키기 위해서는 레퍼런스 변수를 Rabbit 과 Tiger로 형변환 해야 한다
        //class type casing : 클래스 형변환
        System.out.println("=============클래스 형변환 확인");
        ((Rabbit)a1).jump();
        ((Tiger)a2).bite();

        //타입 형변환을 잘못하는 경우
        //컴파일시에는 문제가 없지만 런타임시에는 ClassCastException이 발생함
       // ((Tiger)a1).bite();

        //레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입가 맞는지 비교하는 instanceof 연산자
        System.out.println("============== instanceof 확인");
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit ));
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger ));
        System.out.println("a1이 Rabbit 타입인지 확인 : " + (a2 instanceof Rabbit ));
        System.out.println("a1이 Tiger 타입인지 확인 : " + (a2 instanceof Tiger ));
        //상속 받은 타입도 함꼐 가지고 있다
        System.out.println("a1이 Animal 타입인지 확인 : "+  (a1 instanceof Animal ));
        System.out.println("a2이 Animal 타입인지 확인 : "+  (a1 instanceof Animal ));
        //모든 클래스는 Object의 후손아다
        System.out.println("a1이 Object 타입인지 확인 : "+  (a1 instanceof Object ));
        System.out.println("a2이 Object 타입인지 확인 : "+  (a1 instanceof Object ));

        //instanxeof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스형변환을 적용함
        if(a1 instanceof  Rabbit){
            ((Rabbit)a1).jump();
        }
        if (a2 instanceof  Tiger){
            ((Tiger)a2).bite();
        }

        //클래스의 업캐스팅과 다운캐스팅
        //up-casting : 상위 타입으로 형변환 (묵시적 형변환)
        //down-casting : 하위 타입으로 형변환 (반드시 명시적 형변환, 묵시적 형변환 불가)

        Animal animal1 =(Animal) new Rabbit(); // up-casting 명시적 형변환
        Animal animal2 = new Rabbit();         // up-casting 묵시적 형변환

        Rabbit rabbit1 =(Rabbit) animal1;    //down-casting 명시적 형변환
        //Rabbit rabbit1 = animal1;         //down-casting 묵시적 형변환

    }
}
