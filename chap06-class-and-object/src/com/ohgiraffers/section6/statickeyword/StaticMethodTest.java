package com.ohgiraffers.section6.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        this.count++;
        System.out.println("nonStaticMethod");
    }

    public static void StaticMethod() {
        //static메소드는 인스턴스를 생성ㅇ하지 않고 사용하는 메소드라서 this에 주소가 담길스 없음
        //this.count++; //프로그램 시작할떄 heap영역에 주소가 없으니까 지금 static에 this(인스턴스 주소값) 못씀
        System.out.println("staticMethod");
    }
}
