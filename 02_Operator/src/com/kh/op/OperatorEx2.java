package com.kh.op;

import java.util.Scanner;

//class �ٱ����� package�� import �� �ۼ��� �� ����
//�̿� �����ڰ� �����ϰ��� �ϴ� ������ class ���ο� �ۼ��������
//�޼��� : Ư�� ���³� ����� �����س��� ����
public class OperatorEx2 {
	//1. �޼��� : ��ĳ�ʸ� ������� �ʴ� �޼���
	public static void �޼���1() {
		
		int num1 = 20;
		int num2 = 5;
		int ���ϱ� = num1 + num2;
		int ���� = num1 - num2;
		int ���ϱ� = num1 * num2;
		int ������ = num1 / num2;
		System.out.println("���ϱ� : "+���ϱ�);
		System.out.println("���� : "+����);
		System.out.println("���ϱ� : "+���ϱ�);
		System.out.println("������ : "+������);
	}
		// �޼��� 3 () -> Scanner
		// �޼��� ���� �ִ� () ���߿� � ���� ���� �� ���
		// ���� ���� ���� ������ () ��������� ����
	public static void �޼���3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num5 ���ڸ� �Է��ϼ���: ");
		System.out.println("num6 ���ڸ� �Է��ϼ���: ");
		//
		int num5 = sc.nextInt();
		//
		int num6 = sc.nextInt();
		int sum1 = num5 + num6;
		int sub1 = num5 - num6;
		int mul1 = num5 * num6;
		int div1 = num5 / num6;
		
		System.out.println("sum1 : "+sum1);
		System.out.println("sub1 :"+sub1);
		System.out.println("mul1 :"+mul1);
		System.out.println("div1 :"+div1);
		
	}	
		
		// �޼��� 4�� ���� ��ĳ�ʷ� double ���ϱ� ���� ���ϱ� ������ ���
		// double num7 = sc.nextDouble();
		// double num8 = sc.nextDouble();
		// ���ϱ� double sum2
		// ���� double sub2
		// ���ϱ� double mul2
		// ������ double div2
	public static void �޼���4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��غ��� �� ");
		System.out.println("num7�� �ش��ϴ� ���ڸ� �Է��ϼ���:");
		double num7 = sc.nextDouble();
		System.out.println("num8�� �ش��ϴ� ���ڸ� �Է��ϼ���:");
		double num8 = sc.nextDouble();
		// ���ϱ� ���� ������ ���ϱ�
		double sum2 = num7 + num8;
		double sub2 = num7 - num8;
		double mul2 = num7 * num8;
		double div2 = num7 / num8;
		
		System.out.println("sum2 :"+ sum2);
		System.out.println("sub2 :"+ sub2);
		System.out.println("mul2: "+ mul2);
		System.out.println("div2: "+ div2);
	}
		
	
		
	    

	//���� ���� ���� �޼���
	public static void main(String[] args) {
		//������ ���� �޼��� �߿���
		//����ϰ� ���� �޼��常 �ۼ�
		//���࿡ �޼���1() �ȿ� �ۼ��� ������ ����ϰ� �ʹ�.
		//�޼���1();
		//�޼���3();
		�޼���4();
	}

}
