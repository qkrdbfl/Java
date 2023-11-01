package com.ohgiraffers.section4.constructor;

public class user {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    //생성자의 작성위치
    //문법상 클래스 내부에 작성하면 되지마ㄴ 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는것이 관례다

    //생성자의 사용목적
    //1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
    //2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용 //중요*
    //3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미
    // 따라서, 인스턴스를 생성하는 방법을 재한하기 위한 용도로 사용가능(초기값 전달 강제화)

    //기본 생성자(default constructor)
    public user() { // 변수명 클래스의 이름과 반드시 일치해야함
        //인스턴스 생성 시점에 수행할 명령이 있는 경우 작성가능
        System.out.println("User 클래스의 기본생성자 호출...");
    }

    //매개변수 생성자
    //초기화 할 필드가 여러개인 경우 초기화 하고 싶은 필드의 조합별로 생성자를 여러개 작성 가능
    public user(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 클래스의 id , pwd, name을 초기화하는 생성자 호출...");
    }
    public user(String id, String pwd, String name, java.util.Date enrollDate) {

//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
        //this()는 동일한 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다
        //괄호안의 매개변수와 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다(메소드와 동일)
        //리턴되어 돌아오지만 리턴값은 존재하지 않으며 가장 첫줄에 선언해야 함(그렇지 않으면 에러)
        this(id, pwd, name);
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 id , pwd, name, enrollDate를 초기화하는 생성자 호출...");
    }
    public String getInformation() {
        return "user[id = " + this.id + ", pwd ="+ this.pwd + ",name="+this.name+"enrollDate="+ this.enrollDate+"]";
    }
}
