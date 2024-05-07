package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressPre {
	
	public static void main(String[] args) {
		//www.google.com 호스트명과 IP주소 가져오기
		try {
			InetAddress 구글주소 = InetAddress.getByName("www.google.com");
			System.out.println("구글 주소: "+구글주소.getHostAddress());
			System.out.println("호스트명 :"+구글주소.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 나의 컴퓨터 이름과 자리번호 확인하기
		//get localhost
		try {
			InetAddress 나의자리 = InetAddress.getLocalHost();
			System.out.println("남의 컴퓨터 이름과 자리번호:"+나의자리);
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
	}
}
