package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//ä�� ���� ������
//port 2�ڸ� 3�ڸ� 4�ڸ� ��ǻ�Ϳ��� ������� ������ ����
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			System.out.println("party chat open");
			
			Socket clientSocket = server.accept();
			System.out.println("client sueccee");
			
	BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//���ο� ��ü�� 2���� �����ش�
	
	PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
	
	out.println("hello jinhwa");
	//�����ڿ��� ���� �޼��� ���� �� ���
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
