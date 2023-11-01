package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //super와 suprt()에 대해 이해할수있다

        //product 기본 생성자
        Product product1 = new Product();
        System.out.println(product1.getInformation());

        //product 매개변수 생성자
        Product product2 = new Product("s-23423", "삼성", "갤럭시", 32434, new Date());
        System.out.println(product2.getInformation());


        //computer 기본 생성자
        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());

        //computer 모든 필드 초기화 생성자
        Computer computer2 = new Computer("로봇",769,12,"안드로이드");
        System.out.println(computer2.getInformation());

        //computer와 product의 모든 필드 초기화 생성자
        Computer computer3 = new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new Date(),
                "퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation());

    }
}
