package com.kh.SynchronizedEx;
/*
Synchronized
 	��Ʈ ������ ȯ�濡�� �����ϴ� �����Ϳ� ����ȭ�� ����
 	���� �����尡 �ϳ��� ���ÿ� ������ �� �߻��� �� �ִ� ������ �ذ�
 	
 	Ư�� �ڵ� ������ ���ó���ؼ� �� ���� �ϳ��� �����常 ������ �� ����
 * */
public class SynchronizedEx {
	private static int ���� = 0;
	
	public static void main(String[] args) {
		for(int i =1; i<5; i++) {
			//���ٽ�
			Thread t = new Thread(() -> {
				//����� ��Ͽ� �����ؼ� ���������� ī���͸� ������Ŵ
				synchronized (SynchronizedEx.class) {
					����++;
					System.out.println("���ڵ� : " + ����);
				}
			});
			t.start();
		}
	}
}