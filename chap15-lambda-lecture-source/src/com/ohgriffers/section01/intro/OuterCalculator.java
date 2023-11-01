package com.ohgriffers.section01.intro;

public interface OuterCalculator {
    @FunctionalInterface
    public interface Sum{ //함수적 인터페이스

        int sumTwoNumber(int a, int b); //내부인터페이스
    }
    @FunctionalInterface
    public interface Minus{

        int MinusTwoNumber(int a, int b);
    }
    @FunctionalInterface
    public interface multiple { //함수적 인터페이스

        int multipleTwoNumber(int a, int b); //내부인터페이스
    }
    @FunctionalInterface
    public interface devide { //함수적 인터페이스

        int devideTwoNumber(int a, int b); //내부인터페이스
    }
}
