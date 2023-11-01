package com.ohgiraffers.section01.thread;

public class Application1 {
    public static void main(String[] args) {
        //Thread를 생성하는 법
        //1.Thread 클래스 상속
        //2.Runnable 인터페이스 구현

        Car car = new Car();//Thread 로 만듬
        Tank tank= new Tank();//Thread 로 만듬
        Plane plane = new Plane(); //Runnable 로 만듬

        //Thread 타입의 인스턴스 변환
        Thread t1 = car;
        Thread t2 = tank;
        //Runnable을 상속 받은 클래스는 Thread 클래스의 생성자에 인자를 인스턴스를 전달해서 Thread 인스턴스를 생성한다
        Thread t3 = new Thread(plane);

        //다형성을 적용해서 Thread 타입으로 바로 인스턴스 생성
        Thread t4 = new Car();
        Thread t5 = new Tank();
        Thread t6 = new Thread(new Plane());

        //기본으로 가지고 있는 우선순위 확인
        System.out.println("t4 우선순위 : "+ t4.getPriority());
        System.out.println("t5 우선순위 : "+ t5.getPriority());
        System.out.println("t6 우선순위 : "+ t6.getPriority());

        //우선순위 변경
        t4.setPriority(Thread.MAX_PRIORITY);
        t6.setPriority(Thread.MIN_PRIORITY);

        //변경된 우선순위 확인
        System.out.println("t4 우선순위 : "+ t4.getPriority());
        System.out.println("t5 우선순위 : "+ t5.getPriority());
        System.out.println("t6 우선순위 : "+ t6.getPriority());

        //run() 메소드를 호출하면 별도의 스레드로 동작하지 않고 메소드를 호출하는 방식으로 동작한다
//        t4.run();
//        t5.run();
//        t6.run(); //이렇게 하면 Car, Tank, Plane가 각각 Car1000번 출력하고 Tank1000번 출력하고 Plane1000번 출력됨

        //start() 메소드를 호출하면 각각의 스레드로 동작한다
        t4.start();
        t5.start();
        t6.start();// 이렇게 하면 Car, Tank, Plane가 순서대로 1번씩 번갈아 나오며 1000번 출력된다

        //지정한 스레드가 종료될 떄까지 현재 메인 스레드의 종료를 대기시킨다
        try {
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("====================== main end");
    }
}
