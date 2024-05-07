package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//Geeting : �ȳ��ϼ��� �λ縦 ����ϴ� �޼���
	
	//1 �̸��� ���ڰ� �Էµƴٸ�
	//1 �̻��� ���ڸ� �Է����ּ��䰡 ��µǸ鼭
	//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
	
	public void practice1() {
		//����ڷκ��� �Ѱ��� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڵ��� ��� ���
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ��ϰ� ���� 1�̸��� ���ڸ� �Է��ߴٸ�
		//1�̻��� ���ڸ� �Է����ּ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		// �Է¹��� ���ڰ� 1�̸��� ��� ������ֱ�
		if(num <1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			return;
		}
		
		//�Է¹��� ���ڰ� 1 �̻��̸� 1���� �Է¹��� ���ڱ��� ��� ������ֱ�
		for(int i =1; i<=num; i++) {
			//System.out.println(i+" <= "+num);
		}
		//�������� �ٹٲ��� ���ֱ� ���Ѵٸ�
		System.out.println(); //�ٹٲ� �ϼ�
	}
	
	
	public void practice2() {
	//�Է¹ޱ� ���ؼ��z ��ĳ�ʸ� ���ؼ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
		System.out.print("���ڸ� �Է��ϼ���: ");
		 num = sc.nextInt();
		if(num<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			}else {
				break;
			}
		}
		System.out.println("1����"+num+"������ ���ڵ�");
		int i =1;
		while(i<=num) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println();
	}
	
	

	public void practice3() {
		// ����ڷκ��� �� ���� ���� �Է¹޾�
		Scanner sc = new Scanner(System.in);
		int num;
			while(true) {
			System.out.print("�Ѱ��� ���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("�Է��� ���ڴ� 1���� ũ�ų� ����� �մϴ�.");
			} else {
				break;
				
			}
					
			
		}
			System.out.println(num + " ���� 1������ ���ڵ��� �Ųٷ� ����մϴ�.");
			int i =1;
			while(i>=num) {
				System.out.println(i+" ");
				num--;
			}
	
	
	
	
	}		
	

		
		
		
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("���� �Ѱ��� �Է��ϼ���: ");
			num = sc.nextInt();
			if(num<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			}
		}while (num>1);
		for(int i=num; i>=1; i--) {
			System.out.println(i + " ");
	
	}
}
	
	public void practice5() {
		//1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϱ�
		//ex. ������ �ϳ� �Է��ϼ���: 8
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 =36
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		// �Է� ���� ���� �� ���� �� �ٱ���
		int result = 0;
		
		//���ڰ� ������ �� 1���� �Է¹��� ���ڱ��� ���ؼ� ���� ���ϱ�
		for(int i=1; i<=num; i++) {
			result += i;
			
			//���������ڸ� ����ϱ�
			if(i <num) {
				System.out.print(i+ "+");
			}else {//i > num
				System.out.print(i+"=");
				
			}
		}
		System.out.println(result);
	}
	
	public void practice7() {
		/*
		 ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���� ����ϱ�
		 ���� 1 �̸��� ���ڰ� �Էµƴٸ� 1 �̻��� ���ڸ� �Է����ּ��� ����ϱ�
		 **/
		Scanner sc = new Scanner(System.in);
		while(true ) {
			System.out.print("ù ��° ����: ");
			int firstNum = sc.nextInt();
			
			System.out.print("�� ��° ����: ");
			int secondNum = sc.nextInt();
			
			//���࿡ ù ��° ���ڿ� �� ��° ���� ��� 1���� ũ�ų� ���� ���
			if(firstNum >=1 && secondNum>=1) {
				//int fistNum <= secondNum
				// �� ���� ���ؼ�
				//�ּҰ� �ִ밪 ���ϱ�
				int �ּҰ� = Math.min(firstNum,secondNum);
				//Math(���� ���Ͽ���) ���� ���� ���� ã�� min�� Ȱ���ؼ�
				//�˾Ƽ� ���ϰ� ���� ���� ���ϰ� �ϱ�
				//(  ,  ) ��ȣ �ȿ� ���ڸ� ���� �� ���� ������ �������
				// Math���� random �� �ִ�����?!
				//Random���� Math.random
				// Math�� �ִ� random���� Random�� �ִ� ��������� ��
				// ������ �� �� ����ϴµ� ū ���̴� ����
				// 
				int �ִ밪 = Math.max(firstNum,secondNum);
				for(int i = �ּҰ�; i <=�ִ밪; i++) {
					System.out.println(i+ " ");
				}
				break;
			}else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String operator;
		while(true) {
			System.out.println("���α׷� ���Ḧ ���� ��� exit �Է��� ��");
			System.out.print("�����Է�(+ - * / % :");
			operator = sc.next();
			
			if("operator".equals("exit")) {
				System.out.println("�ش����α׷��� �����մϴ�.");
				break;
			}
			System.out.println("����1�� �Է����ּ���: ");
			int ����1 = sc.nextInt();
			System.out.println("����2�� �Է����ּ���: ");
			int ����2 = sc.nextInt();
			
			int ���;
			
			if(operator.equals("+")) {
				��� = ����1 + ����2;
			} else if(operator.equals("-")) {
				��� = ����1 - ����2;
			} else if(operator.equals("*")) {
				��� = ����1 * ����2;
			} else if(operator.equals("/")) {
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
				}
				��� = ����1 / ����2;
			} else if(operator.equals("%")) {
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
				}
				��� = ����1 % ����2;
			} else {
				System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			System.out.println(����1+" "+operator+" "+����2+"="+���);			
		}
		
	}
	
	
	
	/* 13�� 14 �� ���� ���� for answp*/
	public void practice13() {
		//Ű����� ���ڸ� �Է� �ް� ����⸦ �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num  = sc.nextInt();
		
		//�Է¹�sms ����ŭ ������ ��� ex) 2 ���η� � (�� +����)
		for(int ������ =1; ������ <=num; ������++) {
			//���پ� ���� ������ְ� ����
			// �� ��-�ϳ� ����-�� ����-��....num�� = num
			for(int ��=1; ��<=������; ��++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void practice14() {
		//Ű����� �Է¹��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num  = sc.nextInt();
		// ���� ���� for(int line = num; ���ǽ�: ������)
		//          for(int start=1; line<=start; star++)
		
		for(int line = 0; line >=1 ; line++) { //; �� for���ȿ��� 2���� ��� ����
			for(int star=num; star<=line; star--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		//Ű����� �Է� ���� ���� size �ȿ� �־���
		int size = sc.nextInt();
		// line�� ���η� �� ���� ��ȣ�� ��Ÿ��
		for(int line = 0; line < size; line++ ) {
			//blank ������ ����ϱ� ���� for��
			//line ��° �ٿ����� line���� ������ ����ϰڴ�
			 for (int blank = 0; blank < line; blank++) {
				 System.out.print("  ");
			 }
			 //start ���� ����ϱ� ���� for��
			 //line ��° �ٿ����� size - line ���� ���� ���
			 //	ù ��° �� size
			 // �� ��° �� size - line  
			 for (int star = size; star > line; star--) {
				 System.out.print("* ");
			 }
			System.out.println();
			
			
		}
	}

		
	
	//15�� ����
	//
	
	
	
	
	
	public void Geeting() {
		System.out.println("�ȳ��ϼ���.");
	}
	//Geeting2 : �ݰ����ϴ� �λ縦 ����ϴ� �޼���
	public void Geeting2() {
		System.out.println("�ݰ����ϴ�.");
	}
}




