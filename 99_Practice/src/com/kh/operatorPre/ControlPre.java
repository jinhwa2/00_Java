package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1�� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		if(num1>0) {
			if(num1%2 == 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
		} else {
			System.out.println("�����Դϴ�.����� �Է��ϼ���");
		}

	}
		
		public static void practice2() {
			//Ű����� ���� ���� ���� ���� �Է¹ޱ�
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� ������: ");
			int korean = sc.nextInt();
			
			System.out.print("���� ������: ");
			int english = sc.nextInt();
			
			System.out.print("����������: ");
			int math = sc.nextInt();
			
			System.out.println("����������: "+korean);
			System.out.println("����������: "+english);
			System.out.println("����������: "+math);
			// �հ�� ��� ���
			int totalScore = korean + english + math;
			System.out.println("�հ��: "+ totalScore );
			double average = totalScore/3.0;
			System.out.println("�����: "+totalScore);
			//�հ� ���� �Ǻ�
			//�������� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
			if(korean>=40 && english>=40 && math>=40 && average>=40) {
				System.out.println("�����մϴ�. �հݴϴ�!");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
		}
					
		public static void practice3() {
			/*
			 * 1 ~ 12 ������ ���� �Է¹޾� �ش� ���� �ϼ��� ����ϼ���.
			 * 2�� ������ �������� �ʽ��ϴ�.
			 * OO���� �߸� �Է��� ���Դϴ�. ��/�� �빮�� O
			 */
			Scanner sc = new Scanner(System.in);
			System.out.print("1���� 12 �� �ϳ� �Է�: ");
			int month = sc.nextInt(); //Ű����� �Է��� ��
			
			int dayMonth;
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				dayMonth = 31;
				break;
			case 4: case 6: case 9: case 11:
				dayMonth = 30;
				break;
			case 2: 
				dayMonth = 28;
				break;
			default:
				System.out.println(month+" ���� �߸� �Է��� ���Դϴ�.");
				return;
			}
			System.out.println(month+ "���� " +dayMonth + "�ϱ��� �ֽ��ϴ�.");		
		}
		
		public static void practice4 () {
			Scanner sc = new Scanner(System.in);
			// Ű�� ������ �Է¹ޱ�
			System.out.print("Ű(m)�� �Է��ϼ���:");
			double height = sc.nextDouble();
			System.out.print("������(kg)�� �Է��ϼ���:");
			//BMI ��� BMI = ü�������� �񸸵��� Ȯ���ϴ� ��
			double weight = sc.nextDouble();
			
			double bmi = (double)weight/(height * height);
			//BMI ������ ���� ��� ���
			if(bmi<18.5) {
				System.out.println("��ü��");
			} else if(bmi<23) {
				System.out.println("����ü��");
			} else if(bmi<25) {
				System.out.println("��ü��");
			} else if(bmi<30) {
				System.out.println("��");
			} else {
				System.out.println("����");
			}
		}
	
		public static void practice5 () {
			Scanner sc = new Scanner(System.in);
			System.out.print("�߰���� ������ ;");
			double mid = sc.nextDouble();
			System.out.print("�⸻��� ������ :");
			double fin = sc.nextDouble();
			System.out.print("���� ������ :");
			double assig = sc.nextDouble();
			System.out.print("�⼮ Ƚ���� :");
			int attend = sc.nextInt();
			
			// �⼮ ���� ��� 20ȸ
			double attendPer = attend / 20 * 100;
			// attend / 20 = �⼮�� Ƚ���� ��ü ���� Ƚ���� ������ �⼮ ������ ���
			// double �Ҽ��� �ؿ� �ִ� ������ ����
			// �Ǽ��� �� ���� 100�� ���ؼ� ������� ��ȯ
			
			// �� ������ ���� ���� ���
			// �߰� 20 �⸻ 30 ���� 30 �⼮ 20 =100��
			//�߰� ���� 20
			double midScore = mid *0.2;
			//�⸻ ���� 30
			double finScore = fin * 0.3; // 100�� ���� 30%
			//�������� 30
			double assigScore = assig * 0.3;
			double attendScore = attendPer * 0.2; //100�� ���� 0.2
			double totalScore = midScore + finScore + assigScore +attendScore;
			
			//�򰡿� ���� Pass �Ǵ� Fain ���
			if(totalScore >=70 && attendPer >=70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
			System.out.println("======= ��� =======");
			System.out.println("�߰���� ���� (20�� ����) : " + midScore);
			System.out.println("�⸻��� ���� (30�� ����) : " + finScore);
			System.out.println("��   �� ���� (20�� ����) : " + assigScore);
			System.out.println("��   �� ���� (30�� ����) : " + attendScore);
			System.out.println("��                 ��) : " + totalScore);
			
			
			 
		}
		
		public static void main(String[] args) {
			//pactice1 ();
			//practice2 ();
			//practice3 ();
			practice4 ();
			//practice5();
			
		}	
		
		
	}

