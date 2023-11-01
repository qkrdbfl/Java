package com.ohgiraffers.section02.daemonthread;

public class CountDown extends Thread { // 스레드를 상속한다

    @Override
    public void run(){
        for (int i=0; i>=0; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
