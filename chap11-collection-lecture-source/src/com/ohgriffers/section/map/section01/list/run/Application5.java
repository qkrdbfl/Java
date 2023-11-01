package com.ohgriffers.section.map.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        //Queue에 대해 이해하고 활용하기

        //Queue는 인터페이스이므로 인스턴스 생성 불가
        //Queue<String> que = new Queue<>();

        //주로 LinkedList 타입을 활용해서 큐를 만든다
        Queue<String> que = new LinkedList<>();

        //큐에 데이터를 넣을 때는 offer() 메소드를 사용함
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println("que : "+ que);

        //큐에서 데이터를 꺼낼 때는 2가지 메소드가 있다.
        //peek(): 해당큐의 가장 앞에 있는 (먼저 들어온) 요소를 반환
        //poll(): 해당큐의 가장 앞에 있는 (먼저 들어온) 요소를 반환 하고 제거

        System.out.println("peek() : "+que.peek());
        System.out.println("que() : "+que);

        System.out.println("poll() : "+que.poll());
        System.out.println("poll() : "+que.poll());
        System.out.println("poll() : "+que.poll());
        System.out.println("poll() : "+que.poll());
        System.out.println("poll() : "+que.poll());
        //큐에서 반환할 값이 없을 경우 null 값 반환함
        System.out.println("poll() : "+que.poll());
        System.out.println("que() : "+que);
    }
}
