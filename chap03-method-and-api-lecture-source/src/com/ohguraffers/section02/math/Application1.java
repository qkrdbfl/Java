package com.ohguraffers.section02.math;

public class Application1 {
    public static void main(String[] args) {
        //math 클래스에서 제공하는 static 메소드를 호출 가능.//

        //java.lang.Math//
        //수핫에서 자주 사용되는 상수들과 함수들을 미리 구현해 놓은 클래스로
        //모든 메소드는 static 메소드를 작성되어 있다.

        // 1. 절대 값 출력//
        //클래스의 full name 작성
        System.out.println("-7의 절대값 : "+ (java.lang.Math.abs(-7)));

        //import를 사용//
        //java.long 패키지 하위의 기능은 매우 자주 사용 돠는 기능들이 있기 때문에
        //컴파일러가 자동으로 import java.long.*; 코드를 추가한다.
        //따라서 별도로 import 할 필요가 없음.
        System.out.println("-1.25의 절대 값 : "+ Math.abs(-1.25));

        // 2. 최대값, 최소값 출력
        System.out.println("10과 20중 더 작은 값? : "+ Math.min(10,20));
        System.out.println("10과 20중 더 큰 값? : "+ Math.max(10,20));

        // 3. 원주율
        System.out.println("원주율 : "+ Math.PI);// 무슨 타입인지 검사할땜 마우스 커서 놓고 컨트롤 누르기

        // 4. 난수 출력
        //호출 시마다 다른 값을 가진다
        System.out.println("난수 발생 : "+ Math.random());//0 ~ 1 미만의 실수 형태의 난수를 발생시킴


    }
}
