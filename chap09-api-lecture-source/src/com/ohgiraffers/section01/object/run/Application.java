package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application {
    public static void main(String[] args) {
        //Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용하기

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "홍길동", "허", 60000);
        Book book3 = new Book(3, "홍길", "허허", 70000);

        //java.long.object 클래스의 toSting()
        //인스턴스가 생성될때 사용한 full class name과 @ 그리고 16진수 해시코드가 문자열로 만환.
        //16진수 해시코드는 인스턴스의 무소를 가리키는 값으로 인스턴스마다 모두 다르게 반환
        System.out.println("book1.toString() : " + book1.toString());
        System.out.println("book2.toString() : " + book2.toString());
        System.out.println("book3.toString() : " + book3.toString());

        //toSting()을 호출하지 ㅏㅇㅎㄴ고 레퍼런스 변수만 출력하는 경우에도 동일한 결과임
        //자동으로 toSting() 을 호출하기 때문임
        //이런 편한 점을 이용해서 toSting() 메소드를 재정의해서 사용함
        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);


    }
}
