package com.ohgiraffers.com.ohgiraffers.section02.bemensional;

public class Application4 { //2차원 배열 공부
    public static void main(String[] args) {
        //2차원 배열의 선언과 할당 및 초기화를 동시에 할수 있음

        //정변 배열
        int[][] iarr = {{1,2,3,4,5,},{6,7,8,9,10},{11,12,13,14,15}}; //3행 5열짜리

        //반복문을 이용한 값 출력
        int valve = 1;
        for (int i=0; i<iarr.length; i++){
            for (int j=0; j< iarr[i].length; j++){
                iarr[i][j] = valve++;
                System.out.print(iarr[i][j] + " ");
            }
        }

        //가변배열
        int[][] iarr2 = {{1,2,3},{4,5,6,},{7,8,9,}};

        //반복문을 이용한 값 출력


        //미리 할당한 배열을 이용한 방식
        int[] arr1={1,2,3,4,5,};
        int[] arr2 = {6,7,8,9,10};

        int[][]iarr3 = {arr1 , arr2};




    }
}
