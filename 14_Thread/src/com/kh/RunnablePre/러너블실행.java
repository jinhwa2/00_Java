package com.kh.RunnablePre;

public class ���ʺ���� {
	//main �޼��� ����
	public static void main(String[] args) {
		for(int i = 0; i<5;i++) {
			���ʺ��� r = new ���ʺ���(i);
			Thread ������ = new Thread(r);
			������.start();
		}
	System.out.println("���� �޼��� ����");
	}
	//for ������ ������ 5�� ���� ��
	//for���� Ż���ϸ� ���θ޼��� �����̱��?��� ���
}
