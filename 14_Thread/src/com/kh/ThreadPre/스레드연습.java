package com.kh.ThreadPre;

//extends Thread
public class �����忬�� extends Thread {
//�ʵ��
	int ��;

//�޼���
	// ������ �ʼ��� �ʰ� ���� ����
	public �����忬��(int ��) {
		this.�� = ��;
	}

	// void run(){ try catch 3�ʴ�� ���۰� ���� �ͷ�
	public void run() {
		System.out.println(this.�� + "������ ������ :)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(this.�� + "������ ���� ��:)");
	}

}
