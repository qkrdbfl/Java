package com.ohgirpers.section01.generic;

public class GenericTest<T> {
    //제네릭 설정은 클래스 선언부 마지막에 다이아몬드 연산자를 이요하여 작성하낟.
    //다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다

    //T는 타입 변수라고 부른다. 타입 변수를 자료형 대신 사용한다.
    //가상으로 존재하는 타입이며 T가 아닌 다른 영문자를 사용해도 무방하다
    //여러개의 타입변수를 작성할떄는 ' , ' 를 이용해서 여러개 기술도 가능하다
    //사용하는 쪽에서 작성한 제네릭 클래스를 이용할때 실제 사용할 타입은 타입변수바리에 맞춰서
    //넣어주게 되면 컴파일 시점에서 타입이 결정되게 된다.

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }

}
