package com.ohgiraffers.section3.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //객체지향 프로그래밍에 대해 이해하고 객체와 클래스를 설계하여 프로그래밍 할수있음

        //객체를 설계하기 위해 복잡한 현실세계를 그대로 반영하기는 어렵기 떄문에
        //프로그램의 목적에 맞게 단순화 하는 추상화 기법을 적용한다

        CarRacer racer = new CarRacer();

        Scanner sc = new Scanner(System.in);

        label:
        while (true){
            System.out.println("=== 카레이싱 프로그램 ===");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : racer.startUp(); break;
                case 2 : racer.stepAccelator();break;
                case 3 : racer.stepBreak();break;
                case 4 : racer.turnOff();break;
                case 9 :
                System.out.println("프로그램 종료"); break  label;
                default :
                System.out.println("잘못된 번호를 입력 했다"); break ;
            }



        }




    }
}
