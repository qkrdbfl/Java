package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        //Stream에 대해 이해하기

        List<String> stringList= new ArrayList<>(Arrays.asList("hello","world","stream"));

        /* 이전에 스트림을 이용하지 않던 방식 */
        System.out.println("==========foreach");
        for (String str : stringList){
            System.out.println(str);//hello world stream
        }
        /*스트림을 이용한 방식*/
        System.out.println("=========stream");//hello world stream
        stringList.forEach(System.out::println); //forEach?? -> 매개변수로 action를 받음 //action는 Consumer 타입이고 매개변수 받아서 전달하는애임!
        //차이점은 얘가 외부적으로 돌았는지 위에처럼 내부적으로 돌았는지의 차이임 //스트림을 쓰면 코드가 간결해짐
        //for (String str : stringList){System.out.println(str); <-- 이거가 forEach 안에 들어가있다고 생각하면됨
        //반복문 직접 쓸필요 없다 이거임
    }
}
