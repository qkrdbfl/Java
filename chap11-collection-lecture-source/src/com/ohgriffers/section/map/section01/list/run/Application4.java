package com.ohgriffers.section.map.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        //Stack에 대해 이해하고 사용하기
        Stack<Integer> integerStack = new Stack<>();

        //Stack에 값을 넣을때는 push() 메소드를 사용함
        //add()도 이용가능하긴 하지만 Vector의 메소드므로 push()를 사용하는게 좋음
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack : "+ integerStack);

        //스택에서 요소를 찾을때 search() 메소드를 이용가능
        //인덱스가 아닌 위에서부터의 순번을 의미하며 가장 상단의 위치는 0이 아닌 1부터 시작함
        System.out.println(integerStack.search(5));

        //스택에서 값을 꺼내는 메소드는 크게 2가지로 본다
        //peek() : 해당 스택의 가장 마지막에 있는 (상단에 있는)요소 반환
        //pop() : 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환후 제거

        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        /* 꺼내면서 요소를 제거하기 때문에 스택이 비어있는 경우 EmptyStackException이 발생한다. */
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
    }
}
