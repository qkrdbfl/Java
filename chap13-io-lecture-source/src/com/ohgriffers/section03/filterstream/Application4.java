package com.ohgriffers.section03.filterstream;

import java.io.*;


public class Application4 {
    public static void main(String[] args) {

        //객체 단위 입출력 보조 스트림을 이해하고 사용하기
        MemberDTO[] outputMembers = {
                new MemberDTO("user1","pass01","홍박사","bjsjjsjsb@naver.com",25,'남',1260.4),
                new MemberDTO("user2","pass02","김철수","qkrdbfl1212@naver.com",34,'남',1440.7),
                new MemberDTO("user3","pass03","김영희","dbfl1031@naver.com",26,'여',1234.5),
        };

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("testObjectStream.txt"))){

            for (int i=0; i< outputMembers.length; i++){
                objOut.writeObject(outputMembers[i]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //DTO 클래스에 직렬화 처리를 하지 않았다면 실행시 NotSerializableException이 발생함
        //직렬화란?
        //자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할수 잇도록 바이트(byte) 형태로 데이터를 변환하는 기술
        //을 말한다. 반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 함

        MemberDTO[] inputMembers = new MemberDTO[3];

        try (ObjectInputStream objin = new ObjectInputStream(new FileInputStream("testObjectStream.txt"))){

            for (int i=0; i<inputMembers.length; i++){
                inputMembers[i] = (MemberDTO) objin.readObject();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            //역직렬화(byte >>객체) 시 클래스를 찾지 못하면 발생하는 오류
            throw new RuntimeException(e);
        }
        //향상된 포문
        for (MemberDTO member: inputMembers){
            System.out.println(member);
        }


    }
}
