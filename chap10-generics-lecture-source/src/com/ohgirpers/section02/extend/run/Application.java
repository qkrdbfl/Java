package com.ohgirpers.section02.extend.run;

import com.ohgirpers.section02.extend.Bunny;
import com.ohgirpers.section02.extend.DrunkenBunny;
import com.ohgirpers.section02.extend.Rabbit;
import com.ohgirpers.section02.extend.RabbitFarm;

public class Application {
    public static void main(String[] args) {
        //extends 키워드를 이용해서 특정 타입만 사용하도록 제네릭 범위를 제한가능

        //상위 타입 또는 관련 없는 타입을 이요해서 인스턴스 생성이 불가하다
//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        //Rabbir 타입이거나 Rabbit 의 후손 타입으로 인스턴스 생성이 가능함
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();

        farm4.setAnimal(new Bunny());
        farm4.getAnimal().cry();

        farm4.setAnimal(new DrunkenBunny());
        farm4.getAnimal().cry();
    }
}
