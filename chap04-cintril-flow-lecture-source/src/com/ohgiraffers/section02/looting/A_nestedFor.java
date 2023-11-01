package com.ohgiraffers.section02.looting;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromtwoToNine(){
        //2단부터 단을 1씩 증가시켜서 9단까지 출력하는 중첩 for문

        //2단부터 단을 1씩 증가 시키는 반복문
        for(int dan =2; dan<10; dan++){
            System.out.println("=== " + dan + "단 ====");
            //1부터 9까지 수를 곱하여 구구단을 출력하는 반복문
            for (int su = 1; su<10; su++){
                System.out.println(dan + "*" + su + "=" + (dan * su));

            }
            System.out.println();
        }

    }
    public void printStarInputRowTimes() {
        //키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*' 을 5개씩 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력 : ");
        int row = sc.nextInt();
        //입력한 행만큼 반복
        for (int i = 0; i <= row; i++) {
            //별을 5개 출력하는 것을 반복
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printTriangleStars(){
        //키보드로 정수를 하나 입력 받아서 해당 정수만큼 한 행에 "*"를 행의 번호개씩 출력
        //예 : 장수를 입략하세요 : 5
        //*
        //**
        //***
        //****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수 입력 : ");
        int row = sc.nextInt();
        //입력한 행만큼 반복
        for (int i = 0; i <= row; i++) {
            //행 수 만큼 별을 출력하는 반복문
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
