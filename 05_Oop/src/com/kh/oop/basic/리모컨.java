package com.kh.oop.basic;

public class ������ {


	//1.�ʵ�
	public boolean powerOn; // ���� ����
	public int volume;
	
	//2.������ (���� ������,�ʼ� ������)
	public ������() {
		
	}
	public ������(int volume) {
	 this.volume = volume;
	}
	//��¸޼���
	public void ����() {
		System.out.println("���� :" +volume);
	}
	
	//3.�޼���
	public static void main(String [] args) {
		//������ ��ü �����ϱ�
		������ rmc = new ������();
		rmc.powerOn = true;
		rmc.volume = 100;
	
	System.out.println("�������� ������ "+rmc.powerOn+"�̰�,"
			+ "������" + rmc.volume+"�Դϴ�.");
	
	
	
	//���� ����� ���� �޼��带 ����
	//������ ������ 200���� ���� ������ 200�� �´��� Ȯ���ϱ�
	
	//���� 1. �ʱ� ���� ������ ������ְ�
	������ orderRmc = new ������(200);
	//���� 2. ���θ޼��忡�� ���� ����ϱ�
	orderRmc.����();

	}
}
