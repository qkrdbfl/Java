package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegativeException extends Exception {

    public MoneyNegativeException(){}
    public MoneyNegativeException(String message) {
        super(message);
    }
}
