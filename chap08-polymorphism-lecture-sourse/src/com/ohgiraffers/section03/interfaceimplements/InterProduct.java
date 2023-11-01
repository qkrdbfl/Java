package com.ohgiraffers.section03.interfaceimplements;

//인터페이스가 인터페이스를 상속할 경우에는 extends 라는 키워드 사용함
//클래스 extends 클래스
//클래스 implements 인터페이스 1, 인터페이스 2 ...
//인터페이스 extends 인터페이스 1, 인터페이스 2 ...
public interface InterProduct extends java.io.Serializable {

    //인터페이스는 상수 필드만 작성 가능
    //public static final 제어자 조랍을 상수팔드라고 함
    //반드시 선언과 동시에 초기화 해줘야 함
    //public static final int MAX_NUM; //초기화 안해서 못씀

    public static final int MAX_NUM = 100;

    //상수 필드만을 가질수 있기 때문에 모든 필드는 묵시적으로 public static final 이다
    int MIN_MAX = 10;

    //인터페이스는 생성자를 못가짐
    //public  InterProduct(){}

    //인터페이스는 구현부가 있는 non_static 메소드를 가질수 없음
    //public void nonStaticMethod(){}

    //추상 메소드만 작성 가능함!!
    public abstract void nonStaticMethod();

    //인터페이스 내 메소드는 묵시적으로 public abstract 의 의미를 가진다
    void abstMethod();

    //static 메소드는 작성이 가능하다 (JDK 1.8 추가)
    public static void staticMethod(){
        System.out.println("InterProduct 클래스의 staticMethod 호출");
    }

    //degault 키워드를 사용하면 non_static 메소드도 작성 가능 (JDK 1.8 추가)
    public default void defaultMethod(){

        System.out.println("InterProduct 인터페이스의 defaultMethod 호출");//
    }


}
