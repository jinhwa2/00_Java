package com.kh.ThreadEx;

public class Main {

	public static void main(String[] args) {
		//ThreadEx ������ = new ThreadEx();
		//������.start();
		//System.out.pritln("1�� ������ �� Ex2 ������ ����!")
		//for �� 3���� �����带 �����ؼ� ����
		for(int i=0; i<3; i++) {
			//ThreadEx2�� �θ��̱� ������ Thread ���ʿ��� �ۼ��ϴ� ���� ����
			Thread ������ = new ThreadEx2(i);
			
			if(i == 2) {
				������.setPriority(Thread.MIN_PRIORITY); //MIN = 1
			} else if(i == 1) {
				������.setPriority(Thread.MAX_PRIORITY);//MAX = 10
			} else {//0
				������.setPriority(Thread.NORM_PRIORITY);//NORM = 5(�⺻)
			}
			������.start();
		}
		System.out.println("���� ��~~~!");
	}
}
