package com.ohguraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        //static 메소드를 호출 가능.//

        //static 메소드를 호출하는 방법
        //클래스명.메소드명();
        System.out.println("10괴 20의 합 : "+ Application8.sumTwoNumbers(10,20));
        // 동일한 클래스 내에서 작성된 static 메소드는 클래스명 생략 가능.
        System.out.println("10괴 20의 합 : "+ sumTwoNumbers(10,20));
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}

