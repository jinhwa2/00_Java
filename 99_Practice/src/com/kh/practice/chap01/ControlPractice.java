package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	//�޼ҵ�
	public void practice11() {
		// ��й�ȣ�� �������� �ƴ϶� �Է��ؼ� ���ؾ���
		Scanner sc = new Scanner(System.in);
		
		// ��й�ȣ�� �����Ҷ����� ��� (�ݺ��Ѵٴ� �ǹ�)
		while(true) {
			// ������ �̿��ؼ� 4�ڸ� ��й�ȣ�� ������� �Ѵ�
			System.out.println("��й�ȣ �Է�(1000~9999) : ");
			int password = sc.nextInt();
			// 4�ڸ� ������  �Է¹޾� �� �ڸ� ���� �ߺ��Ǵ� ���� ���� ��� ����
			// �Էµ� ������ 4�ڸ����� Ȯ��
			 if(password < 1000 || password>9999) {
				 System.out.println("4�ڸ��� �ƴմϴ�.");
				 System.out.println("�ڸ� �� �� ����");
				 continue;
			 }
			 //�ڸ���
			 int[] digits = new int[4]; //4�ڸ��� ���
			 digits[0] = password / 1000; // õ���ڸ�
			 digits[1] = (password / 100) % 10;//�����ڸ�
			 digits[2] = (password / 10) % 10; //�����ڸ�
			 digits[3] = password % 10; //�����ڸ�
			 
			 
			 
			 // �ߺ� ���� -> �ߺ��� üũ�ϴ� ������ java
			 boolean isTrue = true;
			 //length :ũ��
			 for(int i=0; i<digits.length; i++) {
				 for(int j=i+1; j<digits.length; j++)
					 if(digits[i] == digits[j]) {
						 isTrue = true;
						 break;
					 }
			 }
			 // �ߺ� ���� ������ �ߺ� �� ����
			 // �ڸ����� �� ������ '�ڸ� �� �� ����' ���>
			 // ��, ���� �� ���ڸ� ���� ���� 1 ~ 9 ������ ����

			 if(!isTrue) {
				 break;
			 }
			//�ߺ� ���ο� ���� �޼��� ���			
		if(!isTrue) {
			System.out.println("�ߺ����� ����");
		} else {
			System.out.println("��й�ȣ ���� ����");
			break; //��й�ȣ�� �������� �� ������ָ� ��� ����
		}

	
	}
		//Run.java ControlPractice ȣ���ؼ� ����
	}
	
}
