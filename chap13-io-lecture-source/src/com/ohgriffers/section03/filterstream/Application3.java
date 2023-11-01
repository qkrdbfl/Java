package com.ohgriffers.section03.filterstream;

import java.io.*;
import java.util.Date;

public class Application3 {
    public static void main(String[] args) {
        //데이터 입출력 보조 스트림을 이해하기

        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"))) {

//            dout.writeUTF("홍길동");
//            dout.writeInt(654);
//            dout.writeChar('a');
//
//            dout.writeUTF("이순신");
//            dout.writeInt(4317);
//            dout.writeChar('b');
//
//            dout.writeUTF("김철수");
//            dout.writeInt(56);
//            dout.writeChar('c');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("score.txt"))) {

            //파일에 기록한 순서대로 읽어오지 않ㅅ는 경우 에러가 발생하거나 의미없는 뎅;터를 읽어옴
            while (true){
                System.out.println(din.readUTF() + "," + din.readInt() + ',' + din.readChar());
                //파일에서 더 이상 읽어올 값이 없는경우  Caused by: java.io.EOFException(End of FileEOFException )을 발생시킴
                //catch 블럭에 해당 exception을 핸들링 하는 코드를 추가한다.

            }
//            System.out.println(din.readUTF() + "," + din.readInt() + ',' + din.readChar());
//            System.out.println(din.readUTF() + "," + din.readInt() + ',' + din.readChar());
//            System.out.println(din.readUTF() + "," + din.readInt() + ',' + din.readChar());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (EOFException e){               //정상종료를 위해 이부분을 추가함
            System.out.println("파일 읽기 완료!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
