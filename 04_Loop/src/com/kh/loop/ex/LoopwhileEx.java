package com.kh.loop.ex;

import java.util.Scanner;

public class LoopwhileEx {
	
	/*
	public static void method1() {
	Scanner sc = new Scanner(System.in);
	1. �����ϱ� 2. �����ϱ� 3. ���ڱ� 4. ���α׷� ����
	int menu
	while(true) {
		System.out.println("~~ ���α׷� �ۼ�");
		System.out.println("���ϴ� ���α׷� ��ȣ�� �Է����ּ��� :
		switch(menu) {
		   case 1 :
		   
		   case 4 :
		
		
		}
	}
	
	
	
	}
	 * */
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==========[�޴���]===========");
			System.out.println("1.�Ƹ޸�ī�� 2.ī��� 3.���� 4.�ֹ����");
			System.out.println("�޴��� �Է����ּ���: ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("�Ƹ޸�ī��");
				break;
			case 2:
				System.out.println("ī���");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("�ֹ����");
				return;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.\n"
						           +"�ٽ� �Է����ּ���\n");
				
			}
		}

	}
	
	/*
	public static void kh����() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("khī�信 ���Ű� ȯ���մϴ�. ^^* \n"
		                 +"���ϴ� �޴��� �Է����ּ���.\n"
		                 +"1 �Ƹ޸�ī�� 2 ī��� 3 ���� 4 ������Ƽ 
		                 
     	String minu = sc.next();
     	switch (menu) {
     		case "1": case "�Ƹ޸�ī��":
     		System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
     		break;
     		
     		
     		case "5": case "�ֹ����:
     		System.out.println("�ֹ��� ��ҵǾ����ϴ�.");
     		
 		default:
 			System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���");
     	}
	
	}
	 * */
	public static void kh����() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("khī�信 ���Ű� ȯ���մϴ�.^^*\n"
					           + "���ϴ� �޴��� �Է����ּ���.\n "
					           + "1 �Ƹ޸�ī�� 2 ī��� 3 ���� 4 ������Ƽ 5�ֹ���� ");
			String menu = sc.next();
			switch(menu) {
			case "1": case "�Ƹ޸�ī��":
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "2": case "�����":
				System.out.println("ī��� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "3": case "����":
				System.out.println("���� �ֹ� �߰��Ǿ����ϴ�.");
			case "4": case "������Ƽ":
				System.out.println("������Ƽ �ֹ��߰� �Ǿ����ϴ�.");
			break;
			case "5": case "�ֹ����":
				System.out.println("������Ƽ �ֹ��߰� �Ǿ����ϴ�.");
				return;
			default:
			System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���");
			}
			
			
		}
	}
	
	public static void getMoney() {
		//Ŀ�� 10�� Ŀ�ǰ� 300��
		int coffee = 10;
		int money = 300;
		
		while(money > 0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� ����");
			coffee--;
			System.out.println("���� Ŀ���� ���� "+coffee+" �� �Դϴ�.");
			//Ŀ�ǰ� ��� �����ƴٸ� �ǸŸ� ��������
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �� �����ƽ��ϴ�. �ǸŸ� �����մϴ�.");
				return;
			}
			
		}
	}

	//1���� 5���� ���ڸ� ���
	public static void allNumber() {
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num++;//num = num +1;
		}
	}
	
	
	
	//
	//������ 10�� ������ ���� �ѱ��
	public static void tree() {
		//������ ��� ���̱� ������ ����0
		int hit =0;
		
		while(hit < 10) {
			//������ ��� ������� Ȯ��
			hit++; // ���� 1������������ hit = hit +1;
			System.out.println("������ "+hit+" �� ������ϴ�.");
			//���࿡ ������ ������ ���� 10���� �Ǹ� ���� �Ѿ�ϴ� ǥ��
			if(hit == 10) {
				System.out.println("������ �Ѿ�ϴ�~~!!!! ����~!!!!");
			}
		}
	}
	
	
//	 ����ڷκ��� 1���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڸ� ��� ���
//	 �� �Է��� ���� 1���� ũ�ų� ���ƾ���
//	 ���࿡ 1 �̸��� ���ڰ� �Էµƴٸ� 1�̻��� ���ڸ� �Է����ּ��� ����ϱ�
//	 
	 
	 public static void method2(){
		 Scanner sc = new Scanner(System.in);
		 	System.out.println("0���� ū ���ڸ� �Է��ϼ��� : ");
		 	int num = sc.nextInt();
	 	if(num<1) {
	 		System.out.println("1�̻��� ���ڸ� �Է��ϼ���: ");
	 	} else {
	 		System.out.println("1���� "+num+" ������ ���ڵ�");
	 		int abc = 1;
	 		//while���� ����ؼ� ���� abc ���� num���� ��� ����ϱ�
	 		while(abc <= num) {
	 			System.out.println(abc);
	 			abc++;
	 		}
	 	}
	 }
	

	 //Ŀ�ǰ� 100�� ���� ������ Ŀ�Ǹ� �������� ���ϴ� ���
	 public static void getCoffee() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Ŀ�ǿ� ���Ű� ȯ���մϴ�.");
		 System.out.println("���� ���� ���� �Է����ּ���:");
		 
		 int coffeePrice = 100 ;
		 int money = sc.nextInt();
		 while(money < coffeePrice) {
			 System.out.println("���� �����մϴ�.\n"
					  + "Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ���.");
			 System.out.println("���� ���� ���� �Է����ּ���:");
			 money = sc.nextInt();
			 
			 
		 }
			 
		 System.out.println("Ŀ�Ǹ� �����߽��ϴ�. �Ž�������"
				             + (money - coffeePrice)+ "�Դϴ�.");

		 
	 }     
	
	 //10000�� �̻� ���� ���� ��� �������� ��Ű�� ���ϴ� ����
	 public static void iLovePork() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("�ȳ��ϼ���. ���������Դϴ�.");
		 System.out.println("������ �ִ� ���� �Ա����ּ���: ");
		 int tangsuyuk = 10000;
		 int mymony = sc.nextInt();
		 
		 while(mymony < tangsuyuk) {
			 	System.out.println("�ܾ��� �����մϴ�.\n"
			 			            +"�ٽ� �Ա����ּ���."    );
			 	System.out.println("������ �ִ� ���� �Ա����ּ��� : ");
			 	mymony = sc.nextInt();
			 	
		 }
		 
		 //1.��ĳ�ʸ� �̿��ؼ� ���� �����ϰ� �ִ� �ݾ� �Է��ϱ�
		 
		 //�����ϰ� �ִ� �ݾ��� tangsuyuk ���� ������ �ܾ���  �����մϴ�.
		 //�ٽ� �Ա����ּ���.
		 //�ؽ�Ʈ��Ʈ�� �ٽ� �Ա��� �ݾ��� �Է�
		 //���� 10000�� �̻��̸� �ֹ��� �Ϸ� �Ǿ����ϴ�
		 //���� �ܾ��� 00 �Դϴ�.
		System.out.println("�������� �����߽��ϴ�. �Ž�������"+(mymony-tangsuyuk)+"�Դϴ�."); 
		 
	 }
	 
	 
	
	
	

	public static void main(String[] args) {
		method1();
		//kh����();
		//getMoney();
		//tree();
		//method2();
		//getCoffee();
		//iLovePork();
	}

}
