package com.ohgiraffers.section02.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {


        try {
            //서버의 ip,port를 가지고 요청하기 위해서 Socket 객체 생성
            //Clent와 Server가 local 환경에서 같이 테스트 되고 있으므로 server의ip도 lacal ip
            String serverIP = InetAddress.getLocalHost().getHostAddress();
            int port = 8500;
            Socket socket = new Socket(serverIP,port);

            //올바른 ip, port를 통해 서버와 연결 되면 Socket 객체가 생성되어 반환되지만 그렇지 않으면 null이 반환ㄴ됨
            if (socket != null){
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream());

                Scanner sc = new Scanner(System.in);

                do {
                    System.out.println("대화 입력 : ");
                    String massage = sc.nextLine();
                    pw.println(massage);
                    pw.flush();

                    if (massage.equals("exit"))break;

                    String recieveMassage = br.readLine();//readLine >받아온다
                    System.out.println(recieveMassage);

                }while (true);

                br.close();
                pw.close();
                socket.close();
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
