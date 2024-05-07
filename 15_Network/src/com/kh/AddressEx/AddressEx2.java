package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
�ܺ� ������ �ּҸ� �˾ƺ�

�� �� �ּ� �˾ƺ���
InetAddress.getLocalHost() : ���� �� ��ǻ�Ϳ� ������ IP �ּҸ� �������� �޼���


 �� IP �ּ�: 192.168.0.22
 �⺻���� ó���� ��ǻ�Ͱ� ������ ������ 1���� ���� 192.168.01 �������� 1�� �����ϴ�
 ���ڸ� ������ 
 
 ��������� �Բ� ���������, ������ ��ǻ�� ��, ������ ��Ʈ��ũ�� ������ �ް� �� ��쿡��
 1���� ��ȣ�� �ο��ް� ��
 
    ������ 22ȣ
 192.168.0.22 �� ��� �� ���� �ִ� ȣ���� �����Ѽ� ���
 
 ���ڷ� �츮�� = 127.0.0.1 = localHost = 192.168.0.22 (���� �ٽ�)
 * */
public class AddressEx2 {
	public static void main(String[] args) {
		try {
			InetAddress ����ȣ��Ʈ = InetAddress.getLocalHost();
			System.out.println("�� IP �ּ�: "+����ȣ��Ʈ.getHostAddress());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
