package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

import java.util.Arrays;

public class Application02 {
    public static void main(String[] args) {
        //object 클래스의 equals() 메소드 오버라이딩 목적을 이해하고 활용가능
        Book book1 = new Book(1, "홍", "허", 50000);
        Book book2 = new Book(1, "홍", "허", 50000);

        //java.long.oblect의 equals 매소드
        //매개변수로 전달 받은 인스턴스와 == 연산하여 true or flas 반환 (동일 인스턴스인지 확인)

        //동일 객체 : 주소가 동일한 인스턴스
        //동등 객체 : 주소가 달라도 필드 값이 동일한 인스턴스

        //Book 클래스에 equals 메소드를 동등 객체 판단 코드로 오버라이딩 하면 equals의 결과가
        //false --> true로 변경.
        System.out.println("두 인스턴스의 == 연산비교 : " + (book1 == book2)); //주소값 비교
        System.out.println("두 인스턴스의 equals()비교 : " + (book1.equals(book2))); //주소값 비교

        //Arrays.toString()// 이것도 Arrays클래스에 오버라이딩되어있다는거

    }
}
