package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientPre {
	public static void main(String[] args) {
		
		
		
			try {
				Socket socket = new Socket("localhost",12370);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				
				out.println("hi server");
				
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
		
	
		
	

