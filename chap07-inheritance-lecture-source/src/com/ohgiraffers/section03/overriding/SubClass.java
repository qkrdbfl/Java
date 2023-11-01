package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    //메소드 이름, 리턴 타입 매개변수의 갯수/타입/순서가 일치해야 오버라이딩 성립
    @Override
    //public void method2(int num){} //메소드명 바뀌면 안댐
    //public int method(int num){return 0;} //오버라이딩을 할때 리턴타입이 다르면 안댐
    //public void method(String num){} // 타입 다르면ㅇ안댐
    public void method(int num){}


    //private 메소드 오버라이딩 불가
//    @Override
//    private void privateMethod(){}

    //final 메소드 오버라이딩 불가
//    @Override
//    public final void finalMethod(){} //final이라서 고칠수 없다

    //부모 메소드의 접근 제한자와 같거나 더 넓은 범위로 오버라이딩 가능
//    @Override
//    void protectedMethod(){} //디폴트는 protected보다 작아서 안댐

    @Override
    public void protectedMethod(){} //protected보다 넓은 범위라서 바꾸기 가능


}
