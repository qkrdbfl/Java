package com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {
        //다형성을 적용하여 매개변수에 활용할수있다
        Application03 app3 = new Application03();

        Animal animal=new Rabbit();

        Animal animal1=new Rabbit();
        Animal animal2=new Tiger();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit rabbit=new Rabbit();
        Tiger tiger=new Tiger();

        app3.feed(rabbit);
        app3.feed(tiger);
    }
    //다향성을 적용하지 않았다면 호랑이에게 먹이를 주는 메소드와 토끼에게 주는 메소드와 토끼에게 먹이를 주는 메소드를 별도로 작성해야 할 것이다
    //동물의 종류가 늘어나면 늘어나는 만큼 메소드를 더 정의해야할것이다
    //다향성을 적용하면 상위 타입인 Animal 로 하나의 메소드만 작성하면 된다!!!!!!아래처럼.
    public void feed(Animal animal){
        animal.eat();
    }

}
