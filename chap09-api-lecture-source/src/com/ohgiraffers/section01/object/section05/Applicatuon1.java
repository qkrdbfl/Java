package com.ohgiraffers.section01.object.section05;

import java.util.Date;

public class Applicatuon1 {
    public static void main(String[] args) {
        //java.util.Date 클래스 사용법을 이해하고 사용할수있다

        //1. 기본생성자 사용 : 운영체제의 날짜/시간 정보를 이용해서 인스턴스 생성
        Date today = new Date();
        System.out.println(today);

        //2. Date(ling date) 사용 : long 타입의 숫자로 전달된 날짜/시간 으로 인스턴스 생성

        //1970년 1월 1일 0시 0분 0초 이후 지난 시간을 milisecound로 계산해서 long 타입으로 반ㄴㄴ환
        System.out.println(today.getTime());

        Date time = new Date(1689727495741L); //long 타입으로 써주야 댐
        System.out.println(time);


    }
}
