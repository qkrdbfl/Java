package com.ohgirpers.section02.extend;

//인터페이스 상속시 implements 키워드가 아닌 extends를 시용한다
//public class RabbitFarm <T implements Animal>{}
//public class RabbitFarm <T extends Animal>{}
public class RabbitFarm <T extends Rabbit> {

    //타입 변수는 아직 어떤 토끼가 될지 모른다.다만 토끼거나 토끼의 후손만 가능하다
    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}