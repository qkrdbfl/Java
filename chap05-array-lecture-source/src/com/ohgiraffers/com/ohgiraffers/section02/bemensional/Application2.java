package com.ohgiraffers.com.ohgiraffers.section02.bemensional;

public class Application2 {
    public static void main(String[] args) {
        //2차원 정변배열을 선언 및 할당하여 사용가능
        //정변배열의 경우 선언과 동시에 모든 배열을 할당 가능
        int[][] iarr = new int[3][5];

        //배열에 저장하기 위한 하나씩 증가하는 값을 저장할 변수
        int value =1;

        //배열 개수만큼 반복적으로 접근하기 위한 반복문
        for (int i=0; i< iarr.length;i++) {
            for (int j = 0; j < iarr[i].length; j++) {  //3행 5열
                iarr[i][j] = value++; // 대입연산자 = 가 먼저 시작하고 두번째로  오른쪼겡 있으니까 ++가 시작
            }
        }
        //대입 된 값을 출력 확인 하는 반복문
        for (int i=0;i<iarr.length; i++){
            for (int j=0; j<iarr[i].length; j++){
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
