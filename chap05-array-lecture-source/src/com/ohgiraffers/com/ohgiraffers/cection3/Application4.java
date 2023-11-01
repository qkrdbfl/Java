package com.ohgiraffers.com.ohgiraffers.cection3;

public class Application4 {
    public static void main(String[] args) {
        //향상 된 for문을 이해하고 활용가능
        int[] arr1 = {1, 2, 3, 4, 5,};
        int[] arr2 = arr1.clone();

        //for문을 이요해 인덱스에 값을 10씩 누적 증가
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 10;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //향상된 for문 : jak 1.5 버전부터 추가됨 문법
        //배열 인덱스에 하나로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행

        for (int i : arr2) {
            i += 10;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr1[i] += 10;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //향상됨 for문은 배열 인덱스에 차례로 접근할떄는 편하게 사용할수 있지만 값을 변경할수는 없음
        //인덱스에 접근해서 값을 변경한 것이 아니라 꺼낸 값을 복사해서 사용하고 있기 때문
        //대신 변경이 아니라 사용이 목적일 경우 더 편하게 사용가능
        for (int i : arr2) {
            System.out.print(i + " ");  // 뭐가 담겼는지 확인하고 싶을때 씀 // 값 i값을 변경 불가능
        }
        System.out.println();
    }
}
