package com.ohgiraffers.section6.finalFieldTest;

public class FinalFieldTest {
    //final 키워드에 대해 이해할수 있다

    //final 키워드를 사용할수 있는 위치는 다양하다. 의미가 약간은 다르지만 변경불가의 의미를 가진다.
    //1. 지역 변수 : 초기화 이후 값 변경 불가
    //2. 매개변수 : 호출시 전달한 인자 변경 불가
    //3. 전역변수 : 인스턴스 생성후 초기화 이후에 값 변경 불가
    //4. 클래스 변수(static) : 모두 공유가 가능하고 프로그램 시작이후 값 변경 불가
    //5. non-static 메소드 : 메소드 재작성(overriding) 불가
    //6. static 메소드 : 메소드 재작성(overriding) 불가
    //7. 클래스 : 상속 불가

    //n0n-static 필드에 final 사용//

    //초기 인스턴스 생성시 기본값 0이 필드에 들어가게 되는데 초기화 이후 값을 변경할수 ㅇ없기 때문에
    //선언과 동시에 초기화를 해주어야 한다. 그렇지 않으면 컴파일 에러가 발생한다.
    //private final int nonStaticNum;

    //선언과 동시에 초기화//
    private final int NON_STATIC_NUM = 1; //1로 초기화 하겠습니다 라는 뜻

    //생성자를 이용해 초기화//
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }
    //static 필드에 final 키워드 사용//
    //private  static final int STATIC_NUM;

    //선언과 동시에 초기화
    private static final int STATIC_NUM = 1;

    //생성자를 이용한  초기화는 불가능하다.

    //생성자는 인스턴스 생성 시점에 호출되고 static은 프로그램이 시작될떄 할당되므로
    //초기화 되지않은 상태로 선언된것과 동일
    //private static final double STAIC_DOUBLE;

    //public FinalFieldTest(double staticDouble) {
    //FinalFieldTest.STAIC_DOUBLE = staticDouble;
    //}

    //초기화 블럭을 통해 초기화 가능
    static {
        //STAIC_DOUBLE =
    }





}


