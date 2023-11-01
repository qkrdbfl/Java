package com.ohgiraffers.com.ohgiraffers.section02.bemensional;

public class Application3 {
    public static void main(String[] args) {
        //2차원 가변배열을 선언 및 할당하여 사용가능
        //가변배열의 경우 각 인덱스별 배열을 따로 할당해야함
        int[][] iarr = new int[3][];

        System.out.println(iarr); //stack 의 레퍼런스 배열 참조하는 주소 값
        System.out.println(iarr[0]); //heap의 2차원 배열 참조하는 주소 값 (현재 할당없어서 null)
        //System.out.println(iarr[0][0]); // 존재하지 않는 공간 만들어서 왜 썼냐고 에러남

        iarr[0] = new int[3];
        iarr[1] = new int[2];
        //iarr[1]= new char [3]; //자료형이 다른 배열은 하나로 묶어서 관리 안됨

        //이렇게도 사용가능하다
        int[] arr = new int[5];
        iarr[2] = arr; //미리 할당해 둔 배열을 이용할수 있음

        //가변 배열도 동일하게 반복문을 이요해서 값을 대입하고 출력할수 있다
        int value = 1;                                  //

        for (int i = 0; i < iarr.length; i++) {         //기억하기
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + "");
            }
            System.out.println();                       //
        }
    }
}
