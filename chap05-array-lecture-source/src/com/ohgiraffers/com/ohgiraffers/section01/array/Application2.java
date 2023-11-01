package com.ohgiraffers.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        //베열의 선언//
        //자료형[] 변수명;
        //자료형 변수명 [];
        // => 선언은 stack에 배열의 주소를 보관할수 있는 공간을 만드는 것이다
        int[] iarr; // stack에 iarr 라는 주소박스가 생긴거 // <= 알기쉽게 타입 바로앞에 [] 해주는게 더 좋음
        char carr[];// 마찬가지

        //선언한 레퍼런스 변수에 배열을 할당하여 대입한다
        //new연산자는 heap영역에 공간을 할당하고 발생하는 주소 값을 반환하는 연산자다
        //발생한 주소를 레퍼런스 변수 (참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
        //참조 자료형(reference)이라고 한다.
        iarr = new int[5]; // 공간에 몇개를 할당할건지 지정해준거라서 [] 안에를 비워두면 안됨.
        //iarr =new int[]; // 할당할 크기는 반드시 지정되야함
        carr = new char[10];

        //선언과 할당을 동시에 할수있다
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        //heap 메모리는 이름으로 접근하는 것이 아님 주소로 접근하는 영역이다 stak에 저장된 주소로 heap에 할당 된 배열을 찾아갈수 있음
        System.out.println("iarr : " + iarr);//I@6bf256fa // @ 뒤에가 주소이름
        System.out.println("carr : " + carr); //C@22f71333 // 중간에 알파벳이 섞인것은 주소값을 16진수로 나타내기때문

        //hashcode() : 일반적으로 객체의 주소 값을 10진수로 변환하여 생성한 객체의 고유한 정수 값을 반환
        System.out.println("iarr.hashCode() :" +iarr.hashCode() );
        System.out.println("carr.hashCode()" + carr.hashCode());

        //배열의 길이를 알수 있는 기능을 필드로 제공
        //String클래스의 문자열의 길이는 메소드를 제공하므로 length() 로 사용한다!!!!
        System.out.println("jarr.length : " + iarr.length );
        System.out.println("carr.length : " + carr.length );

        // 스캐너를 통해 입력 받은 정수로 배열의 길이를 지정하여 배열 할당
        Scanner sc = new Scanner(System.in);

        System.out.println("새로 할당할 배열의 길이 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashcode : " + darr.hashCode()); //10진수 주소 값
        System.out.println("darr의 길이 : " + darr.length);
// ========================================================================
        //한번 지정한 배열의 크기는 변경하지 못한다. 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 덮어 쓴다.
        darr = new double[30];
        System.out.println("수정된 darr의 hashcode : " + darr.hashCode());
        System.out.println("수정된 darr의 길이 : " + darr.length);

        // 한 번 할당 된 배열은 지울 수 없다
        //단 , 참조되지않는 배열은 일정 시간이 지난 후 heap의 old 영역으로 이동하며
        //GC(가비지 컬렉터) 가 삭제 시킨다
        // 한번 찾아갈수 있는 주소값을 잃어버린 배열은 다시 참조 불가능하다!!!!!!!!!!!!
        //이미 주소값 정한 배열 뒤에 새로운 배열 만들어서 이어붙이는거 안됨!!!!!!!!!!
        darr = null; //참조하는 주소값이 없음을 나타냄

        //NullPointerException 에러 발생
        //아무것도 참조하지 않고 null 이라는 특수한 값을 참조하고 있는 걍우 참조 연산자를 사용하면 발생하는 에러
        System.out.println("수정된 darr의 hashcode :"  + darr.hashCode()); //<= 아무것도 참조하지 않았는데 darr. 찍고  사용했다고 에러남
        System.out.println("수정된 darr의 길이 : " + darr.length);




    }
}
