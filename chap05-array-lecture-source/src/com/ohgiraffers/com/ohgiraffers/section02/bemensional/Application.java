package com.ohgiraffers.com.ohgiraffers.section02.bemensional;

public class Application {
    public static void main(String[] args) {
        //다차원 배열의 구조를 이해하기

        //1. 배열의 주소를 보관할 레퍼런스 변수 선언
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        //여러개의 1차원 배열의 주소를 관리하는 배열 생성 (heap0
        //iarr1 = new int [][]; // 크기를 지정하지 않아면 에러남
        //iarr1 = new int [][4]; //크기를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러
        iarr1 = new int[3][]; //몇개를 묶어서 관리할건지 정하면 뒤에는 안저겅도 에러 안남

        //3.주소를 관리하는 배열의 인덱스마다 배열을 할당 (heap)
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        //위에서 진행한 2,3번을 동시에 진행할수도 있음
        //앞부분의 정수는 주소를 관리하는 배열의 크기, 뒷부분 정수는 각 인덱스에 할당하는 배열의 길이다
        //관리하는 여러개의 배열의 길이가 동일한 경우 한번에 할당 가능
        //하지만 여러개의 배열의 길이가 각각 다른 경우에는 인덱스별로 따로 할당해주어야 한다.
        iarr2 = new int[3][5];

        //4. 각 배열의 인덱스에 차례로 접근해서 값 출력
        //할당 후에 아무값을 대입하지 않도라도 heap 영역에는 값이 없는 상태로 공간을 생성할수 없기 때문에 기본값이 담겨있음ㅋ

        //0번 인덱스의 배열 값 출력
        //5
        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.print(iarr1[0][i] + "");
        }
        System.out.println();

        //1번 인덱스의 뱌열 값 출력
        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.print(iarr1[1][i] + "");
        }
        System.out.println();

        //2번 인덱스의 배열 값 출력
        for (int i = 0; i < iarr1[0].length; i++) {
            System.out.print(iarr1[2][i] + "");
        }
        System.out.println();


        //중첩 for문을 이용한 2차원 배열 값 출력
        for (int i = 0; i < iarr1.length; i++) {
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.print(iarr1[i][j] + "");
            }
            System.out.println();
        }


    }

}
