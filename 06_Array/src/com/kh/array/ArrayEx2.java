package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {
	/*public ArrayEx2(){
		//for ���� Ȱ���� �迭 ����ϱ�
		int numbers[] = new int[5]; //��ٱ��� ǥ�� �ؾ��� ������ ���� ���
		// 1 ���� 4���� �迭�� ���ڸ� �ֱ�
		//�� 0 ���� �����ϳĸ� index 0���� �����ϱ� ������ i = 0
		//length =���� ,���� ũ�⳪ ���� ���̷� ����
		System.out.println("�ִ���� : "+numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" +i+ "] = "+i);
		}
		*/
	public ArrayEx2() {
		
	}
	public void practice1() {
		int[]number = new int[10];
		for(int i=0; i<number.length; i++) {
			number[i]=i+1;
				System.out.println("number["+i+"] = "+number[i]);	
		}
	}	
		
	public void practice2() {
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			number[i] = number.length-i;
			System.out.println(number[i]);
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		int size = sc.nextInt();
		int[] number = new int[size];
		for(int i=0; i<number.length;i++) {
			number[i] = i+1;
			System.out.println(number[i]);
		}
	}
		
	public void practice4() {
		String[] fruit = {"���","��","����","������","����"};
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String inputString = sc.next();
		// ���ڿ��� ���� �迭�� ��ȯ
		char[] charArray = inputString.toCharArray();
		// �˻��� ���� �Է� �ޱ�
		System.out.print("�˻��� ���ڸ� �Է��ϼ���:");
		char searChchar = sc.next().charAt(0);
		
		// �˻��� ������ ������ ������ ���� count �ʱ�ȭ
		int count = 0;
		//�˻��� ������ �ε����� ����ϱ� ���� �ȳ� �޽���
		System.out.println("���ڿ���"+searChchar+" �� ���Ե� �ε���: ");
		//���ڿ��� �ݺ��Ͽ� �˻��� ������ ������ ��ġ�� ���
		for(int i=0; i<charArray.length;i++) {
			//���ڿ��� �� ���ڰ� �˻��� ���ڿ� ��ġ�ϴ��� Ȯ��
			if(charArray[i]==searChchar) {
				System.out.println(i+"");
				//�˻��� ������ ���� ����
				count++;
			}
		}
	}

	public void practice6() {
		    //length      7  
		// index          0   1    2    3   4     5   6
		String[] week = {"��","ȭ","��","��","��","��","��"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� 6���� ���ڸ� �Է��ϼ���: ");
		int inputNumber = sc.nextInt();
		// �Է��� ���ڰ� 0 ~ 6 ���̿� �ִ��� Ȯ�� �� ���̿� �ִٸ� ���� ���
		if(inputNumber>=0 && inputNumber<=6) {
			System.out.println(week[inputNumber] + "����");
		} else {
			System.out.println("�߸� �Է� �߽��ϴ�.");
		}
	
	}
	
	
	public void practice9() {
		//���̰� 7�� �迭�� ����
		//���̰� 7�� �迭�� �����ϰ�, 1 ~ 45���� ������ ���ڰ��� �־ ���
			//num�� �������̸� �˱����ؼ� num.length�� ���
		int[] num = new int[7];
		//�������� ���� �������� ���� ����ϱ�
			//�������� ���ڸ� ����ϴ� ���
			//1.Random ��ü ��� : ���� �� ���� ������ ������ ���
			//2.Math ��ü���� random() �޼��� ���:�� Random��ü���� ��������
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1); //45 0 ~ 44 => 1 ~ 45
			System.out.println("num["+i+"]="+num[i]);
		}
	}
	
	public void practice7() {
		 Scanner sc = new Scanner(System.in);
		 // �迭�� ���� �Է� �ޱ�
		 System.out.print("�迭�� ���̸� �Է��ϼ���: ");
		 int length = sc.nextInt();
		 // �Էµ� ���̷� �迭 ����
		 int[] array = new int[length];
		 //�迭�� �� �ε����� ���� �Է¹޾� �ʱ�ȭ
		 for(int i =0; i<length; i++) {
			 System.out.print("�ε��� "+i+" �� ������ ���� �Է��ϼ���: ");
			 array[i] = sc.nextInt();
		 }
		 
		 //�迭�� ��� ��� ���
		 System.out.println("�迭�� ��:");
		 	for(int i =0; i<length; i++) {
		 		System.out.println(array[i]+"");
		 	}
		 System.out.println();
		 //�迭�� �� �ε����� ����� ������ �� ��� �� ���
		 int sum = 0;
		 for(int i=0; i<length; i++) {
			 sum +=array[i];
		 }
		 System.out.println("�迭�� ������ ��: "+sum);
	 }

	public void method1() {
		// ���� 0 1 2  10 20 30 ����ϱ�
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		// ���ڿ� �� �ڸ��� �� ȭ �� �� �� �� �� �� �ڸ��� � ������ �� �ִ��� ���
		String [] str = {"��","ȭ","��","��","��","��","��"};
		//for ���� �̿��Ͽ� ���  
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]+" "); //" " ���ֳ� �����ֳ� �Ȱ����� �� ���ִ��� �����
		}
		// �Ǽ� index 2 ���� ������ְ� ���  �Ǽ��� ����
		double[] dbl = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 12.1;
		for(int i=0; i<dbl.length; i++) {
	      System.out.println(dbl[i]+" ");
	}
		// ���� 'A' 'B'  'C' �־��� ���� �� �ڸ� ����غ���
		char chr[] = {'A','B','C'};
		/*chr[0]= 'A';
		chr[1]= 'B';
		chr[2]= 'C';
		System.out.println(chr[0]);
		System.out.println(chr[1]);
		System.out.println(chr[2]); */
		for(int i=0; i<chr.length; i++) {
			System.out.println(chr[i]+" ");
		}
	
	}	
	public void practice17() {
		//�Է��� ���� �迭�� �ִ��� �˻�
		//������ ġŲ ��ް��� ������ ���� ġŲ�Դϴ�. ���
		String[] chickenMenu = {"���ġŲ","�Ķ��̵�ġŲ","����ġŲ"};
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �޴��� �Է��ϼ���: ");
		String inputChic = sc.next();
		//�迭�� ����ڰ� �Է��� ġŲ�� �ִ��� �˻�
		boolean found = false;
		for(String ĢŲ:chickenMenu) {
			if(ĢŲ.equals(inputChic)) {
				found = true;
				break;
			}
		} if(found) {
			System.out.println(inputChic+" ��� �����մϴ�.");
		} else {
			System.out.println(inputChic+"�� ���� �޴��Դϴ�.");
		}
		
	}
		
		
	
	
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice5();
		//ae2.practice6();
		//ae2.practice7();
		//ae2.method1();
		//ae2.practice17();
		//ae2.practice9();
		
		
	}

}
