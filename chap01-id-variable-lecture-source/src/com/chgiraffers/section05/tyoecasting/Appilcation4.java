package com.chgiraffers.section05.tyoecasting;

public class Appilcation4 {
    public static void main(String[] args) {
        //형 변환 시 데이터 손실에 유의해서 사용하기//
        // 1. 의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte) inum;

        System.out.println("inum : " + inum);
        System.out.println("inum : " + bnum);


        // 2. 의도한 데이터 손실//
        double height = 175.5;
        int floorHeight = (int) height;
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight); //소수점 절삭에 이용할 수 있다.

    }
}

