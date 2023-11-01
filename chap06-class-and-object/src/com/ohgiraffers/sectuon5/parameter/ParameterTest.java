package com.ohgiraffers.sectuon5.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testParameterTestTypeParameter(int num) {  //기본자료형에서
        System.out.println("매개변수 전달 받은 값 : "+num);
        num +=10;
        System.out.println("가공된 num : "+ num);
    }

    public void testParameterTestTypeParameter(int[] iarr){  // 기본자료형 배열로 바꿈
        System.out.println("매개변수로 전달 받은 값 : "+ Arrays.toString(iarr));
        iarr[0]=99;
        System.out.println("가공된 iarr : "+Arrays.toString(iarr));
    }

    public void testClassTypeParameter(RectAngle rectAngle) {
        System.out.println("매개변수로 전달 받은 넓이와 둘레 ");
        rectAngle.calcArea();
        rectAngle.calcRound();
     //---------------------------------
        rectAngle.setWidth(100);
        rectAngle.setHeugth(100);

        System.out.println("변경 된 길이로 계산한 넓이와 둘레 ");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }
    public void testVariableLongthAttayParameter(String name, String... hobby){ //...이란 가변적으로 0,1,2,3..여러개 가능
        //매개변수가 몇 개 전달될지 알수 없으므로 반드시 매개변수 목록의 가장 뒤에 작성해야함
        System.out.println("이름 : " + name);                                     // 뒤에 뭐가올지 모르느게 가변인자라서 이름쪽 자리랑 바뀌면 에러남
        System.out.println("취미 갯수 : "+hobby.length);
        System.out.println("취미 : "+Arrays.toString(hobby));
    }

    //가변인자를 사용한 메소드를 오버로딩 할때 모호해지는 문제가 발생할수 있으므로 가급적 오버로딩 하지 않는다.
    //public void testVariableLongthAttayParameter(String... hobby) {}


}
