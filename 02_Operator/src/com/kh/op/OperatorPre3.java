package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	//���� ������� �޼���
	//public static	
	public static void method() {
		//public static void method1() �� ����
		// Scanner �� �̿��� num1 num2 �� ���� �Է¹ް�
		// < > �� ����ؼ� �Է� ���� ���� < > �� � ������ true �� �������� Ȯ���ϱ�
		// boolean result1 = num1 > num2;
		// boolean result2 = num1 >= num2;
		// boolean result3 = num1 < num2;
		// boolean result4 = num1 <= num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("num1�� ���� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		
		System.out.println("num2�� ���� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 > num2;
		System.out.println("num1 > num2 = "+result1);
		boolean result2 = num1 >= num2;
		System.out.println("num1 >= num2 = "+result2);
		boolean result3 = num1 < num2;
		System.out.println("num1 < num2 = "+result3);
		boolean result4 = num1 <= num2;
		System.out.println("num1 <= num2 = "+result4);
		
	}
	public static void method2() {
		// ������ 
		//public static void method2() num1 num2 num3 �� �ް� 
		// && || ����ؼ� ũ�� ���� �� Ȯ���ϱ�
		// boolean result = (num1 < num2) && (num2 == num3) ���� �Ǵ°�?
		Scanner sc = new Scanner(System.in);
		System.out.println("ù �� ° �� �� �� �� �ϱ�: ");
		int num1 = sc.nextInt();
		System.out.println("�� �� ° �� ��  ");
		int num2 = sc.nextInt();
		System.out.println("�� �� ° ����: ");
		int num3 = sc.nextInt();
		// && if while ������ üũ�� �� //
		//     �� ���� ������ ��� �����ϴ� ��� ���
		// & ��Ʈ ���� ���� Ư�� ��Ʈ ������ �Ǵ��� �� ���
		
		boolean result = (num1<num2) && (num2 == num3);
		System.out.println("(num1<num2) && (num2 == num3)�� �����!!! "+result+"�Դϴ�.");
	}
	
	
	
	public static void main(String[] args) {
		//method();
		method2();
		
		
		
	}	
}
