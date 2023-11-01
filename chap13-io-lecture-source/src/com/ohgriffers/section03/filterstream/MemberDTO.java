package com.ohgriffers.section03.filterstream;

import java.io.Serializable;

//객체 입출력을 위해서는 반드시 직렬화 처리를 해야한다
//직렬화 대상 클래스에 Serializable 인터페이ㅏ스만 구현하면
//직렬화가 필요한 상황인 걍우 데이터 직렬화 처리가 된다
public class MemberDTO implements Serializable {

    private String id;
    private String pwd;
    private String neam;
    private String email;
    private int age;
    private char gender;

    //transient는 특정 필드를 직렬화해서 제외하기 위한 키워드다.
    private transient double pount;


    public MemberDTO(String id, String pwd, String neam, String email, int age, char gender, double pount) {
        this.id = id;
        this.pwd = pwd;
        this.neam = neam;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.pount = pount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNeam() {
        return neam;
    }

    public void setNeam(String neam) {
        this.neam = neam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getPount() {
        return pount;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", neam='" + neam + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", pount=" + pount +
                '}';
    }

    public void setPount(double pount) {
        this.pount = pount;




    }
}
