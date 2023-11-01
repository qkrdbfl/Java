package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application03 {
    public static void main(String[] args) {
        //oblect 클래스의 hashCode() 메소드 오버라이딩 목적을 이해하고 활용할수 있다
        //oblect 클래스의 명세에 작성된 일반 규약에 따르면 equals() 재정의 시 반드시 hashCode() 재정의하도록 되있음
        //만약 hashCode() 를 재정의 하지 않으면 같은 값을 가지는 동등 객체는 같은 해시코드 값을 가져가야 한다는 규약에 위반된다.
        //(강제성은 없지만 규약을 따르는 것이 좋다)

        Book book1 = new Book(1, "홍", "허", 50000);
        Book book2 = new Book(1, "홍", "허", 50000);

        System.out.println("book1.hashCode() : " + book1.hashCode());
        System.out.println("book2.hashCode() : " + book2.hashCode());

    }
}
