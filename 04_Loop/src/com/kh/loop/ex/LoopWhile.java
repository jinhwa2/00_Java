package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	/*
	 while(���ǽ�) : ���� Ȯ������ ���� �ݺ��� ���
	 
	 while(���ǽ������ϰ��) {
	 		���ǽ��� ���� ��쿡 ����
	 }
	 ���ǽ��� ������ ��쿡 ���� ����
	 
	 ���� �ڵ� 1:
	 	while(true) {
	 			System.out.println("���ѹݺ�")
	 	}
 	 ���� �ڵ� 2:
 	 	while(false) {
 	 		System.out.println("�������� ����ä�� ����")
 	 	}
	 	
	 * */
	
	//���������� ���������� ������ �ڵ带 �ۼ��� �� �ִ� �޼���
	public static void inLoop() {
		while(true) {
			System.out.println("���� ����");
		}
	}
	
//	public static void outLoop() {
//		while(false) {
//			System.out.println("���� �ȵ�");
//		}
//	}
	
	public static void whileLoop() {
		//����= ���ǿ��� ���ڰ� 3 �̻��̸� ���� ����
		int i = 1;
		while(i<=2) {
			//������ �� �� �� ������ �ڵ�
			System.out.println("i�� �� :"+i);
			i++;
		}
			
	}
	
	public static void whileLoopEx() {
		//��ĳ�� Ȱ���ؼ� Ű���� �� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.���� 2.����");
			System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("���α׷��� �����մϴ�.");
					break;
				case 2:
					System.out.println("���α׷��� �����մϴ�.");
					//break;
					return;
					//break�� return ��� case�� Ż���ϴ� �����̱� ������ 
					//���� ����� �� ����
					//break�� ��쿡�� whil�� true�� �� ������� �ʰ� ��� �ݺ�
					//return�� ��� while�� true���� while �ڵ带 Ż���ؼ� ���α׷� ����
				default:
				System.out.println( "�߸��� ��ȣ �Դϴ�. ��ȣ�� �ٽ� �Է����ּ���");
			
			
			}
		}
		
	}
	
	
	
	
	//�������� �����ϴ� ���� �޼���
	public static void main(String[] args) {
		//inLoop();
		//whileLoop();
		whileLoopEx();

	}

}
