package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus; //달리는 상태

    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출..");
    }
    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다");
    }
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵!빵!");
        }else {
            System.out.println("주행중이 아닌 상태에는 경적을 못울립니다");
        }
    }

    /*private*/ protected boolean isRunning(){
        return runningStatus;
    }
    public void stop(){
        runningStatus=false;
        System.out.println("자동차가 멈춥니다");
    }

}
