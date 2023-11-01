package com.ohguraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        //매개변수와 리턴값을 복합적으로 활용가능.//

        int first =20;
        int second =10;

        Application7 app7 = new Application7();
        System.out.println("두 수를 더한 결과 : "+ app7.plusTwoNumbers(first,second));
        System.out.println("두 수를 뺸 결과 : "+ app7.multipleTwoNumbers(first,second) );
        System.out.println("두 수를 곱한 결과 : "+ app7.multipleTwoNumbers(first,second));
        System.out.println("두 수를 나눈 결과 : "+ app7.divideTwoNumbers(first,second));
    }

     public int plusTwoNumbers(int fist, int second) {

        return  fist + second;
     }

//    public int multipleTwoNumbers(int first, int second) {
//
//        return  first - second;
//     }

     public int multipleTwoNumbers(int first, int second) {

        return  first * second;
     }

     public int divideTwoNumbers (int first, int second){

        return first/second;
     }
}

