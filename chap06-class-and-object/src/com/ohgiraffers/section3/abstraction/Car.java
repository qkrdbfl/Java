package com.ohgiraffers.section3.abstraction;

public class Car {

    private boolean isOn; //시동이 켜져있는지 표시
    private int speed; //시속

    //시동이 걸려 있으면 할일이 없고 시동이 걸려있지 않으면 시동걸기
    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려있다");
        }else {
            this.isOn = true;
            System.out.println("시동 걸었다");
        }
    }
    //시동이 걸린 상태인 경우에만 호출 시마다 10km/h 씩 속도 증가 시킨다.
    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 간다");
            this.speed += 10;
            System.out.println("현재 차 시속은" + this.speed + "km/h이다");
        }else {
            System.out.println("차 시동이 안걸려있음. 시동 걸어라");
        }
    }
    //시동이 걸려 달리는 상황에만 멈추기 가능
    public void stop(){
        if(isOn){
            if(speed >0){
                speed = 0;
                System.out.println("브레이크 밟음. 차를 멈춘다");
            }else {
                System.out.println("차가 멈춰있다");
            }
        }else {
            System.out.println("차 시동이 안걸려있음. 시동 걸어라");
        }
    }
    //시동이 걸린 상태인 경우 시동을 끄고 이미 꺼진 상태라면 끌수 없다
    public void turnOff() {
        if(isOn){
            if(speed>0){
                System.out.println("달리는 상태에선 시동 못끈다. 차를 우선 멈춰라");
            }else {
                this.isOn = false;
                System.out.println("시동 끈다. 다시 운행 하려면 시동을 켜라");
            }
        }else {
            System.out.println("이미 시동이 꺼져 있는 상태다. 시동 상태를 확인해라");
        }
    }




}
