package com.ohgriffers.section03.references;

public class Member {

    private String memberId;

    public Member(String memberId) {this.memberId = memberId;}

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}