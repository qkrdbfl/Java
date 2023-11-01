package com.ohguraffers.section04.scanner;

import java.util.Random;
import java.util.Scanner;

public class qkrdbfl {
    public static void main(String[] args) {
        while(true) {
            Scanner sc =new Scanner(System.in);
            System.out.println("====================================");
            System.out.println("##가위바위보 게임##");
            System.out.println("(1.주먹 2.바위 3.보 4.나가기)");
            System.out.println("숫자를 입력하세요");
            int com=0;
            Random r = new Random();

            int user = sc.nextInt();
            com = r.nextInt(3)+1;
            System.out.println("결과는?두구두구    ");

            //user-com???
            if (user==1) { //1일때
                if (com == 2) {//-1
                    System.out.println("*승리*");
                } else if (com == 3) { //2일때
                    System.out.println("ㅜ패배ㅜ");
                } else { //0
                    System.out.println("!무승부!");
                }
            } else if (user==2){ //2일떄
                if (com==2){ //0
                    System.out.println("!무승부!");
        }else  if (com==3) {//-1
                    if (com == 3) { //-1
                        System.out.println("*승리*");
                    } else {//1
                        System.out.println("ㅜ패배ㅜ");
                    }//else if (user == 3) {//3일때
                        if (com == 2) { //1
                            System.out.println("ㅜ패배ㅜ");
                        }}}}}}