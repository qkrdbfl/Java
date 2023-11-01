package com.ohgriffers.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        //생성자 메소드 참조응 이해하고 사용할수 있다
        Function<String, Member> function = Member::new; // public Member(String memberId) {this.memberId = memberId;}를 뜻함

        Member member1 = function.apply("Lambda A");
        System.out.println(member1); //Member{memberId='Lambda A'}

        Member member2 = function.apply("Lambda B");
        System.out.println(member2); //Member{memberId='Lambda B'}

    }
}
