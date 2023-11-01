package com.ohgiraffers.section03.terminal;

public class Member {

    private  String memberId;
    private  String membername;

    public Member(){}

    public Member(String memberId, String membername) {
        this.memberId = memberId;
        this.membername = membername;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", membername='" + membername + '\'' +
                '}';
    }
}
