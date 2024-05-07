package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	//�⺻ �޼���
	
	//LoopforEx ���� ����ϱ� ���Ѵٸ�
	//public static void gugrDan���� static�� �߰����� ������
	//public sttic void main(String[] args){
	// guguDan();
	//}
	//static�� ������ �ʰ� ����ϱ� ���Ѵٸ�
	// ��¿� Ŭ������ ���� ����ϱ� LoopforRun
	// ���Ḧ �ϱ� ������ �ݺ��ؼ� ���
	public void guguDan() {
		//����ڷκ��� ���ڸ� �Է¹ް� ���ڿ� �ش��ϴ� �������� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���迡 ���Ű��� ȯ���մϴ�.");
		while(true) {
			System.out.println("���Ḧ ���ϸ� 0 �Է��ϱ�");
			System.out.println("���ϴ� ���� �Է����ּ���");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			for(int i=1; i<=9; i++) {
				System.out.println(dan+" �� * "+i+" = "+(dan*i));
			}
		}
	
	}

	// ������ �Է� �޾� �Ųٷ� ����ϱ�
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ųٷ� ���迡 ���� ���� ȯ���մϴ�.");
		while(true) {
			System.out.println("���Ḧ ���� ��� 0�� �Է��ϼ���");
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���: ");
			int dan = sc.nextInt();
			//���࿡ 0�� ���´ٸ� ���α׷� ����
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// if 1~ 9������ �Է� �����ϵ��� ����
			if(dan<1 || dan>9) {
				System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
				continue;
			}
			
			for(int i=9; i>=1; i--) {
				System.out.println(dan+" ��*"+i+" = "+(dan*i));
			}

		}


	}

		//}
		
		//4.���Ḧ ���� ��� 0�� �Է����ָ� �����ϱ� while�� �߰�
		

	// ������ 1�ܺ��� 9�ܱ��� ��� ���
	public void guguDan3() {
		// 1�ܺ��� 9�ܱ��� ���
		for(int dan=1; dan<=9; dan++) {
			System.out.println("*******"+dan+"*******");
			for(int num=1; num<=9; num++) {
				System.out.println(dan+"*"+num+"="+(dan*num));
			}
		}
		
		
		
		
		
		
	}
	// �������� 2�ܺ��� 9�ܱ��� ���
	public void gugudan4() {
		for(int ��=2; ��<=9;                                                ��++) {
			System.out.println("***** " + ��+" *****");
			// 2�ܺ��� 9�ܱ��� 1���� 9���� ���ڸ� ����ϱ�
			for(int ���� =1;����<=9;                                           ����++) {
				System.out.println(��+ " * "+����+" = "+(�� * ����));
			}
		}
	}

// 10���� ���� ����ϱ� ��������
	public void randomNumber() {
		//Random �ҷ��ͼ� ���� ������ �������� ���ڸ� �������� ����ϱ�
		Random ���� = new Random(); // �ζ� ��ȣ ����
		//nextInt() �ȿ� ���ڸ� �־ ��𼭺��� �����̿��� �������� ���ڰ� ���;� �ϴ���
		//������ ������ �� ����
		int �������� = ����.nextInt(5);// 0 ~ 4 ���̿� ���ڰ� ����
		// ���ڸ� �� �� �ڵ� �ȿ����� -1~ ���� ��� 0 ���� ����
		// �������� ������ ���� -1 
		System.out.println("��������: "+��������);
		
	
	
	}
	
	//�������� ���� 3�� ����ϱ�  1 ~ 10 ������ ����
	public void randomFor() {
		//Random ȣ���ϱ�
		Random ran = new Random(); //��ǻ�Ϳ� �ڸ��� ������ش�����
		
		// �������� 3�� ��� 1 ~ 10 ������ ����
		
		for(int num=1; num<=3; num++) {
			//�������� ���ڸ� ������ֱ�      10�� �����ָ� 0~9
			//                          10 + 1  1~10
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("�������� "+num+" : "+randomNumber);
		}
	}
	/*
	 public void randomFor2() {
	 
	 		// �������� 1 ~ 45 ��ȣ 6�ڸ� for �� ���
	 
	 }
	 * */
	public void randomFor2() {
		Random random = new Random();
		for(int num=1; num<=6; num++) {
			int lottoNumber = random.nextInt(45)+1;//4.12�� ��� �����ֿ� �Ѵٰ��� ��������
			//if ���� ���ڰ� ���ٸ� ��ȣ�� �����ϰ� ����ϱ�
			
			System.out.println("��������"+num+ " : "+lottoNumber);
		}
	}

	// 1���� 10������ ���� �߿��� Ȧ���� ����ϱ�
	// Ȧ�� = odd
	public void oddNum() {
		for(int num=1; num<=10; num++) {
			//���࿡ ���ڰ� Ȧ����� ����ϱ�
			if(num % 2 !=0) {
				System.out.println(num);
			}
		}
	} 
	
	// ¦���� 1 ~ 10���� ����ϱ�
	// ¦�� = even
	public void evenNum() {
		for(int num=1; num<=10; num++) {
			// ���࿡ ���ڰ� ¦����� ����ϱ� 
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
	//���簢�� ����� �� ���
	public void squareStar() {
		int star = 3;
		for (int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				/*
				 i = 0 �� �� * * *
				 i = 1 �� �� * * *
				 i = 2 �� �� * * *				  
				 * */
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
	
	//���簢�� ����� �� ��� ���η� 5���� ���
	public void fivestar() {
		int star = 5;
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
			}
			System.out.print("* ");
		}
		System.out.println();
	}
	

		
	
	

	//���ڸ� ���� ������ ��� ������ Ǯ���� �ϱ� while(true)   
	//for ��ȸ�� 2�� �ֱ�
	//if �� �����ؼ� ���ڰ��� ���亸�� ������ ���ڰ� �۽��ϴ�. 
	//hint ���ڰ��� ���亸�� ������ ���ڰ� �ʹ� Ů�ϴ�.
	
	public void numberGame() {
		// ���� ���߱� ����
		//�������� ������� ���ڰ� �������� Ű����� ���ߴ� ����
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			int randomNumber = random.nextInt(3)+1; //1~3
			System.out.print("���ڸ� ���纸����!!! :");
			//for �� �ȿ� ������ �� ������ ����� ���ΰ�? ������ 2���� ����ϰڴ�.
			for(int i=1; i<=2 ; i++) {
				System.out.print(i+"��° ��ȸ�Դϴ�.");
				System.out.println("���ڸ� ���纸����: ");

				int guest = sc.nextInt(); //�Խ�Ʈ�� �Է��� ���� ��������
				//���࿡ ���ڸ� ����ٸ� ���ڸ� ������ϴ�. if else if
				if(guest == randomNumber) {
					System.out.println("�����մϴ�.!! ���ڸ� ������ϴ�.!");
					break;
					//Ʋ���� �� ���亸�� ���ڸ� ���� �ۼ��ߴ��� ���ڸ� ���亸�� ���� �ۼ��ߴ��� ��Ʈ�� �� �� ����
				}else if(guest < randomNumber){
					System.out.println("���亸�� �Է��� ���ڰ� �۽��ϴ�..");
					//System.out.println("������ :" + randomNumber);
				}else {
					System.out.println(""
							+ "���亸�� �Է��� ���ڰ� Ů�ϴ�.");

				}

			}
			System.out.println("������" + randomNumber + " �Դϴ�.");
			System.out.println("������ �ٽ� �����ϰڽ��ϴ�?(4�� yes/5�� no)");
			int playAgain = sc.nextInt();
			//���࿡ 2���� ������ break; �ɾ��ֱ�
			if(playAgain == 5) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}
	}
}



















