package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
    // ���� �޼��� ȣ��
	public static void main(String[] args) {
		//���� ��ĳ�ʷ� �Է¹��� ���� ��µǰ� �غ��ô�.
		//int a = 1;
		//int b = 3;
	Scanner sc = new Scanner(System.in);
	System.out.println("�ȳ��ϼ���. ���� �Դϴ�.");
	System.out.println("a�� ���� �Է��ϼſ�");
	int a = sc.nextInt();
	System.out.println("b�� ���� �Է��ϼſ�");
	int b = sc. nextInt();
	
	//����
	int sum = a + b;
	System.out.println("������ ����� : "+sum);
	//����
	int sub = a - b;
	System.out.println("������ ����� : "+sub);
	//����
	int mul = a*b;
	System.out.println("������ ����� : "+mul);
	//������
	int div = a/b;
	System.out.println("�������� ����� : "+div);
		
	}

}
