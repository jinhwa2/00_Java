package com.kh.ThreadPre;

public class ��������� {
	// main �޼������
	public static void main(String[] args) {
		// for ������ ������ 2�� �����
		// start() ������ ����
		// for�� } �ݴ� �߰�ȣ �ؿ� ���θ޼��� ���� ��� �ۼ� �� �����غ���

		for (int i = 0; i < 10; i++) {
			Thread t = new �����忬��(i);
			t.start();
		}
		System.out.println("���� ��~~~~!");
	}
}
