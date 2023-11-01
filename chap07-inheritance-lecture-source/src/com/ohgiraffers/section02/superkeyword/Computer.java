package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    //컴퓨터는 하나의 삼품이지만, 모든 상품은 컴퓨터가 아니다 (IS -A)

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    //기본생성자
    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    //모든 필드에 초기화 하는 생성자
    public Computer(String cpu, int hdd, int ram, String operationSystem) { //super();가 생략되어있음
        //Product의 기본생성자 호출
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출..");
    }

    //부모 클래스의 필드도 모두 초기화 하는 생성자
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        //Product의 매개변수 생성자 호출
        super(code, brand, name, price, manufacturingDate); //부모클래스에 있는 프라이빗 매개변수를 호출하도록 되어있음

        //this(cpu, hdd, ram, operationSystem); // this()로 위에 작성한 생성자를 호출한다는건 super();를 두번 호출하는 것과 같아서 지금 같은 상황에는 불가능
        // 부모 인스턴스를 두개 생성할수 없기 때문. 한번만 호출가능
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 부모 필드도 초기화 하는 생성자 호출..");
    }
    //get/sat 는 부모 필드의 메소드에 대해서는 자신의 것 처럼 사용 가능하므로 별도 작성없이 가능
    //자식 클래스에 추가 된 필드에 대해서만 작성한다


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        //부모클래스의 getter를 이용해서 부모필드가 가진 값도 한번에 문자열 합치기 함
        //부모의 멤버는 super. 과 this. 둘다 사용가능하나 코드의 의미를 명확하게 하기위해
        //suprt.을 사용했다
//        return "computer [" +
//                "code=" + super.getCode()+
//                ",brand="+super.brand+
//                ",name="+super.name+
//                ",price="+super.price+
//                ",manufaturingDate="+super.getManufacturingDate()+
//                ",cpu="+this.cpu+
//                ",hdd="+this.hdd+
//                ",ram="+ this.ram+
//                ",operationSystem="+this.operationSystem+
//                "]";

        //computer에 있는 getInformation() 에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 읶다
        //부모 클래스의 메소드를 호출해서 반환 받은 문자열에 현재 클래스의 필드 값을 추가로 덧붙여보자

        //super.getInformation() : 정상적으로 부모의 메소드 호출
        //this.getInformation() : 재귀 호출이 일어나며 StackOverFlowError 발생
        //getInformation() : this.이 자동으로 추가되며 재귀 호출 발생
        //따라서 이런 경우는 super. 을 명시적으로 사용해야함
        return super.getInformation() +
                "computer [" +
                ",cpu=" + this.cpu +
                ",hdd=" + this.hdd +
                ",ram=" + this.ram +
                ",operationSystem=" + this.operationSystem +
                "]";
    }


}
