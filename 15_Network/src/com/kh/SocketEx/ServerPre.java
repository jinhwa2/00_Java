package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//채팅 시작 주최자
//port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			System.out.println("party chat open");
			
			Socket clientSocket = server.accept();
			System.out.println("client sueccee");
			
	BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//새로운 객체가 2개라서 열어준다
	
	PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
	
	out.println("hello jinhwa");
	//참가자에게 받은 메세지 수신 및 출력
	String message;
	
	while((message = in.readLine()) != null)	{
		System.out.println("send sussess :"+message);
		
		out.println("seccess : 	"+message);
	}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
