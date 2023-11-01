package com.ohgriffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        //FileReader를 이해하기
        //FileInputStream과 사용 방법은 거의 동일함
        //1bate 단위가 아니라 character 단위로 읽어온다 (한글 값 등도 모두 문자 단위로 처리)

        try (FileReader fr = new FileReader("testFileReader.txt")){

            int valur;

//            while ((valur= fr.read())!=-1){
//                System.out.println((char) valur);
//            }

            //bute 배열이 아닌 character 배열을 이용해서 한번에 읽어올수 있다
            //배열의 크기가 읽어올 문자의 개수보다 크므로 나머지 배열은 빈 상태로 처리된다
            char[] carr = new char[(int)new File("testFileReader.txt").length()];

            fr.read(carr);

            for (int i=0; i<carr.length; i++){
                System.out.println(carr[i]);
            }//System.out.println(Arrays.toString(carr)); // 위에 포문도 되구 이것두 가능함

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
