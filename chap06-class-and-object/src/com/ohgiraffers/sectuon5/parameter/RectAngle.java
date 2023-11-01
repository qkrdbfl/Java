package com.ohgiraffers.sectuon5.parameter;

public class RectAngle {
    private double width;
    private double heugth;

    //기본생성자가 없어서 new RectAngle(); 이렇게는 못씀 꼭 필드 >가로width 세로heugth 를 정해줘야 함
    public RectAngle(double width, double heugth) {
        this.width = width;
        this.heugth = heugth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeugth() {
        return heugth;
    }

    public void setHeugth(double heugth) {
        this.heugth = heugth;
    }

    public void calcArea() {
        double aree = width * heugth;
        System.out.println("이 사각형의 넓이는 " + aree + "입니다");
    }

    public void calcRound() {
        double round = (width * heugth) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다");
    }
}