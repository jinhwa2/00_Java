package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress �ּ��̸� = InetAddress.getByName("www.google.com");
			System.out.println("getByName���� ������ ������ �̸� : "+�ּ��̸�);
			
			// getLocalHost �� �̿��ؼ� �� ���ּҸ� �������� ���ּҿ����� �� ���� Ȯ��
			// �� ���ּҿ� ���� �����ּ��̸� �� ��ǻ�� ���� �ּ�
			InetAddress �����ּ� = InetAddress.getLocalHost();
			System.out.println("���� �� �ּ� : "+�����ּ�);
			
			// ��Ƽĳ��Ʈ �ּ� ���� Ȯ��
			
			// �� ��ǻ�Ϳ��� 2�� �̻��� ��ǻ�Ϳ� ���÷� ���� �����ϴ� ���
			// byte[] �ּҸ� Ȱ���� ��ü ��������
			// ������ �ּ� ���� ��ǻ�� ��ü�� ����Ű�� �ܺ� ������ ���� �ʰ� �� ��ǻ�� ���
			byte[] ipAddress = {127, 0, 0, 1}; //���ڰ� ��� �Դ��� �ƴ°� �ƴ϶� �����谡 �����ϰ� ���
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
			
			
			
			
			//System.out.println(�����ּ�);
			
			
			//getByName �����ּҿ� �����ּҸ� �� ���� ������
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//www.facebook.com ���̽��� ȣ��Ʈ�̸� ȣ��Ʈ�ּ�
		//www.instagram.com �ν�Ÿ�׷� ȣ��Ʈ�̸� ȣ��Ʈ�ּ� �˻�
		try {
			InetAddress ���̽��� = InetAddress.getByName("www.facebook.com");
			System.out.println("���̽��� ȣ��Ʈ�̸�: "+���̽���.getHostName());
			System.out.println("���̽��� ȣ��Ʈ�ּ�: "+���̽���.getHostAddress());
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		}
		
		try {
			InetAddress �ν�Ʈ�׷� = InetAddress.getByName("www.instagram.com");
			System.out.println("�ν�Ʈ�׷� ȣ��Ʈ�̸� :"+�ν�Ʈ�׷�.getHostName());
			System.out.println("�ν�Ʈ�׷� ȣ��Ʈ�ּ� :"+�ν�Ʈ�׷�.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	
	}

}
