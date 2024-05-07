package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		//대화 주체자는 나의 집 주소와 우리집에 어떻게 들어오는 경로(포트번호)생성
		
		//서버 측의 포트 번호를 지정해서 ServerSocket 생성
		
		try {
			ServerSocket s = new ServerSocket (12352);
			//System.out.println("주최자 측 번호가 열렸습니다.");
			System.out.println("party chat open"); 
			
			
			// 우리집에 방문하는 손님의 연결을 수락
			
			Socket b = s.accept();
			System.out.println("client success"); //집 문 열어줌을 확인
			
			
						
			BufferedReader in = new BufferedReader(new InputStreamReader(b.getInputStream()));
			
												
			PrintWriter out = new PrintWriter(b.getOutputStream(), true);
			
			
			out.println(" hi server !");
			
			// 참가자에게 받은 메세지 수신 및 출력
			String m ;// = in.readLine();
			
			while( (  m = in.readLine() )    != null) {
				System.out.println("send success : " + m);
				
				out.println("ccccc hhhhh eeeee cccc kkk");
				
			}
			
			
			
			
			
			
			
			b.close();
			s.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
