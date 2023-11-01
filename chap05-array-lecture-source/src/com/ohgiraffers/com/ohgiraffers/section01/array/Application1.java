package com.ohgiraffers.com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        //배열의 선언 및 할당
        int[] arr = new int[5];

        //하나의 이름으로 관리 되는 연속 된 메모리 공간이고, 공간마다 찾아갈수있는 번호(인덱스)를 이용해 접근함
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //인덱스를 반복문으로 처리해서 값을 대입

        for (int i = 0, value = 0; i < arr.length; i++) { //arr.length는  메소드 아님 뒤에 () 붙이면 안됨
            arr[i] = value += 10; //오른쪽이 먼저 작동해서 왼쪽에 대입됨 ~반복~
        }
        //일반적인 변수처럼 사용가능
        int sum = 0;

        sum += arr[0]; //10
        sum += arr[1]; //20
        sum += arr[2]; //30
        sum += arr[3]; //40
        sum += arr[4]; //50

        sum = 0;
        //인덱스를 반복문으로 활용해서 처리
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

    }
}
