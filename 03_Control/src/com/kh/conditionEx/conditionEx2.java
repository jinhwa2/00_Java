package com.kh.conditionEx;

import java.util.Scanner;

public class conditionEx2 {
	/*
		 if  -  else if   - else
		 �����
		 if (����) {
		 	����1�� ���� ��� ������ �ڵ� �ۼ�
		 } else if (����2) {
		 	����1�� �����̰� ����2�� ���� ��� ������ �ڵ� �ۼ�
		 } else {
		 	����1�� ����2�� ��� ������ ��� ������ �ڵ� �ۼ�
		 }
	 * 
	 * */
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		method4(); 
	}
	/*
	 ���̸� �Է� �޾�
	 13�� ���ϸ� "���"
	 13�� �ʰ� 18�� ���� "û�ҳ�
	 18�� �ʰ� "����
	 */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ȳ��ϼ���. khƼ�ϳ��� �Դϴ�.");
		System.out.print("���̸� �Է����ּ���. : ");
		int age = sc.nextInt();
		String result;
		
		if (age <= 13) {
			result = "���";
		} else if (age <= 18){
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		System.out.println(result +"�Դϴ�.");
	}
	
	/*
	 �� �� �Է¹޾� �ش��ϴ� ���� ����ϱ�
	 �� : 3,4,5
	 ���� : 6,7,8
	 ���� : 9,10,11
	 �ܿ� : 12,1,2
	 * */
	
	public static void method4() {
		//13�� ���� ��� 14 ~ 18 û�ҳ� 19�� ����
		
		int age = 22;
		// ������ ����� Ȱ���ؼ� �������� ���̿� ���� ǥ�⸦ ���
		String result;
		if(age <= 13) {
			result = "���";
		} else if (age >=14 && age <= 18) {
			result = "û�ҳ�";
		} else {
			result = "����";
		}
		System.out.println(result+"�Դϴ�.");
	}
	
	
	
	
	
	
	
	public static void method3() {
		// ���࿡ 1,2 12 �ܿ�
		//3 4 5 ��
		//6 7 8 ����
		//9 10 11 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ۼ��ϼ���.: ");
		int month = sc.nextInt();
		String result;
		
		
		if(month == 1 || month == 2 || month == 12) {
			result ="�ܿ�";
		} else if (month >= 3 && month <=5) {
			result = "��";
		} else if(month >=6 && month <=8 ) {
			result = "����";
		} else if(month >=9 && month <= 11) {
			result = "����";
		} else {
			result = "�ش��ϴ� ������ �����ϴ�.";
			
		}
				System.out.println(result +" �Դϴ�.");
	}
	
	public static void method1() {
	
	
	// ���࿡ ���� 2000�� �̻� ���� ��� �ýø�ź��
	// ���࿡ ���� 1500~1900 ���� ���� ��� ���߱����� �̿��Ѵ�.
	// ���࿡ ���� ���� ��� �ɾ��.
	
		int money = 1800; //���� ���� ������ �ִ� ��
		String result;
		
		if(money >= 2000) { // 2000�� �̻��� ���
			result = "�ýø� ź��";
			// 2000�� �̻��� ������ 1500�� �̻��� ���� ���
		} else if(money >= 1500 && money <= 1900) {
			result = "���߱����� �̿��Ѵ�";
			// 1400�� ���� ���� ��� �ɾ��.
		} else {
			result = "�ɾ��";
		}

		System.out.println(result + " �Դϴ�.");
		
		
	}

}
