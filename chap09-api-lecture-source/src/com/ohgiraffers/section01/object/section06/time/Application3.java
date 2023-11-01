package com.ohgiraffers.section01.object.section06.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(1);
        LocalDateTime localDateTime4 = localDateTime.plusDays(10);
        LocalDateTime localDateTime5 = localDateTime.minusYears(2);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("분 변경 = " + localDateTime1);
        System.out.println("시 변경 = " + localDateTime2);
        System.out.println("일 변경 = " + localDateTime3);
        System.out.println("일 변경 = " + localDateTime4);
        System.out.println("년 변경 = " + localDateTime5);

        //time 패키지의 클래스들은 불변이라는 특징을 갖고있음.
        //객체를 변경하려면 새로운 객체가 생성되어 반환되므로 주소값은 다름
        System.out.println(localDateTime == localDateTime1); //펄스
    }
}
