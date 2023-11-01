package com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //기본 생성자, 모든 필드 초기화하는 매개변수 생성자, getter, setter 작성

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //1. toSting 오버라이딩
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';

    }
    //2. equals 오버라이딩


    @Override
    public boolean equals(Object o) {
        //두 인스턴스의 주소가 같으면 동일 객체이므로 이후 코드 실행할 필요없이 바로 true 반환
        if (this == o) return true;

        //this는 Book 타입이므로 전달 받은 object가 Book 타입이 아니라면 필드 비교할 필요없이 바로 false 반환
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        //this와 전달받은 object를 각각의 필드 값을 비교하여 다른 값을 가지고 있으면 false를 바로 반환
        if (getNumber() != book.getNumber()) return false; //if 앞에 this가 생략됨
        if (getPrice() != book.getPrice()) return false;    //if 앞에 this가 생략됨

        //기본 자료형이 아닌 참조자료형은 주소값을 가져서 값 비교를 하기위해 해당 클래스에 정의된
        //equals() 메소드를 다시 호출함
        //Sting 클래스에는 문자열의 값을 비교(동등 객체 비교)하는 equals메소드가 오버라이딩 되어있음
        if (!getTitle().equals(book.getTitle())) return false;  //if 앞에 this가 생략됨
        return getAuthor().equals(book.getAuthor());
    }
    //3. hashCode 오버라이딩
    @Override
    public int hashCode() {
        int result = getNumber();
        //기본 자료형이 아니 참조자료형의 경우 해당 클래스에 정의된 hashCode() 메소드를 다시 호출함

        //필드마다 곱해줄 소수 값으로 31을 통상적으로 많이 사용함 // 31이 소수라서 같은값이 나오는 확률을 좀 줄여줌
        //연산시 동일한 결과 값이 나올 확률 낮춰줌 String 클래스의 hashCode에서도 사용하고 있음
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getPrice();
        return result;
    }
}
