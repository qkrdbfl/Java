package com.ohgiraffers.section01.extend;

public class FireCar extends Car {

    //클래스 선언부에 extends Car 를 추가해서 Car 클래스를 상속받음
    //그러면  FireCar 는 Car의 모든 멤버 (필드, 메소드)를 상속 받을수 있음
    //단, 생성자는 상속 못받음
    // 또한 부모의 private apaqjsms 접근 불가능함

    public FireCar() {
        //모든 생성자에는 맨 첫 줄에 super() 를 컴파일러가 자동으로 추가함
        //부모의 기본 생성자를 호출하는 구문이다
        //명시적 or 묵시적 사용가능하다!

        super();  //이부분은 안써도 부모클래스를 의미해서 자동으로 컴파일이 추가해서 실행함
        System.out.println("FireCar 클래스의 기본 생성자 호출..");
    }

    //soundHorn() 오버라이딩

    //@Override 어노테이션
    //JDK 1.5 부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립 되지않는 경우컴파일 에러를 발생시킴
    //오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야함 //선언부가 똑같아야함 //public void soundHorn(){ 이부분
    @Override //없으면 문제는 안되지만 혹시라도 선언부가 잘못 썼을때 오버라이딩을 잘못했다고 생각을 안함 체크용으로 씀 // 메소드 하나 새로 썼다고 컴퓨터가 착각하니까
    public void soundHorn() {
        if (isRunning()) { //tins.isRunning() or super.isRunning() 둘다 사용가능
            //runningStatus는 private 필드므로 접근 불가능
            //부모의 isRunning() 메소드를 통해서만 주행 중인 상태임을 확인할수 있으므로 private -> protected로 변경함
            //Car 클래스의 runningStatus를 protected로 변경하여 직접 접근 할수 있지만 권장되지않을수 있음 (캡슐화 위배)
            //tins.isRunning() or super.isRunning() 둘다 사용가능하며 컴파일러는 기본적으로 this.씀
            //(super. 를 명시적으로 써야하는 상황도 있음)
            System.out.println("빠ㅏㅏㅏㅏㅏㅏ아아ㅏㅇ앙");
        } else {
            System.out.println("소방차가 앞으로 갈수 없습니다 비키세요");
        }
    }

    /* 상속은 확장이다. FireCar만의 추가적인 기능도 작성할 수 있다. */
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 ==========================>>>");
    }
}
