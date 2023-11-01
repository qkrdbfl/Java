package com.ohgriffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Application4 {
    public static void main(String[] args) {
        //FileWriter를 이해하기
        //FileOutputStream 과 기본적인 사용방법은 동일하나
        //1byte가 아닌 character 단위로 출력할수 있으므로 wite 메소드의 인자가 char[] 또는 String으로 다뤄질수 있다

        try (FileWriter fw = new FileWriter("testWriter.txt")){

            fw.write(97);
            fw.write('A');
            fw.write(new char[]{'a','b','c','d'});
            fw.write("홍박사님을 아세요?");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
