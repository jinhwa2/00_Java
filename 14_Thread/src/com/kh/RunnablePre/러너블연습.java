package com.kh.RunnablePre;
					//implements	
public class ���ʺ��� implements Runnable {
//�ʵ� int ��:
	int ��;
	
	
//�޼���
	//�ʼ� ������
	public ���ʺ���(int ��) {
		this.�� = ��;
	}
	
	//void run() sleep 1000�� try catch this.�� ������ ���� this.��
	@Override //Runnable �������̽����� run() �� �ݵ�� �ۼ������ �ϴ� �޼���
	public void run() {
		System.out.println(this.��+"������ �����մϴ�~!!");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//������ ����
		System.out.println(this.��+"������ �����մϴ�~!!");
	}
	
}
