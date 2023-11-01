package com.ohgiraffers.sectuon5;

import com.ohgiraffers.sectuon5.parameter.ParameterTest;
import com.ohgiraffers.sectuon5.parameter.RectAngle;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        //메소드의 파라미터에 대해 이해하고 사용할수있다

        //매개변수로 사용 가능한 자료형
        /*1. 기본자료형       //s스택팃  > 값
        * 2. 기본자료형 배열  //h힙 객체 >주소값
        * 3. 클래스 자료형    //h힙 객체 > 주소값
        * 4. 클래스 자료형 배열
        * 5. 가변인자 */

        ParameterTest pt = new ParameterTest();

        //기본 자료형을 매개변수로 전달
        //기본 자료형 8가지 모두 가능
        // 그냥 기본자료형은 값만 보내서  옆 클래스와 다른걸로 침. 그래서 옆 클래스에서 바꿔도 같이 수정되지않음
        int num = 20;
        pt.testParameterTestTypeParameter(num);

        //기본 자료형은 값을 전달하므로 메소드에서 변경시켜도 main에서의 변수는 변화가 없다.
        System.out.println("main num : "+ num);

        //2. 기본자료형 배열
        int[] iarr ={1,2,3,4,5};
        pt.testParameterTestTypeParameter(iarr);
        // 배열은 주소값을 전달함 그래서 얉은 복사가 일어나서 동일한 배열을 다르고 있음
        //그래서 값의 변화가 그대로 출려됨
        System.out.println("main iarr : "+ Arrays.toString(iarr));


        //3, 클래스 자료형//
        RectAngle r = new RectAngle(12.5,22.5); //주소값이 전달돼서 100, 100으로 바뀌어서 계산됨
        pt.testClassTypeParameter(r);


        //클래스 바료형은 "주소값을 전달" 하므로 얉은 복사가 일어나 동일한 객체를 다루고 있다.
        System.out.println("사각형의 넓이와 둘레");
        r.calcArea();
        r.calcRound();

        //5. 가변인자//
        //인자로 전달하는 값의 갯수가  정해지지않은 경우 가변인자를 활용할수 있다
        //pt.testVariableLongthAttayParameter(); //name은 전달 되어야 함
        pt.testVariableLongthAttayParameter("박유리");
        pt.testVariableLongthAttayParameter("박유리", "볼링");
        pt.testVariableLongthAttayParameter("박유리", "볼링","축구","당구");
        pt.testVariableLongthAttayParameter("박유리", new String[] {"야구","서예"}); //배열처럼도 가능
















    }
}
