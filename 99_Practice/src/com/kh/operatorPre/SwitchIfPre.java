package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	public static void practice8() {
		// �ֹι�ȣ �̿��ؼ� �������� �������� �����ؼ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ֹι�ȣ�� �Է����ּ���: ");
		String idNumber = sc.next();
		char genderCode = idNumber.charAt(7);
		String gender;
		if(genderCode == '1' || genderCode == '3') {
			gender = "����";
		} else if(genderCode == '2' || genderCode == '4') {
			gender = "����";
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
			//1.gender = "�ùٸ� �ֹι�ȣ�� �ƴմϴ�.
			//2.else���� ���������� return
			return;
		}
		//�������� ���������� ���� ���
		System.out.println("�Է��� �ֹι�ȣ�� "+gender+"�Դϴ�.");
			
		}
		
	public static void castingPractice1() {
		//Ű����� ���� �ϳ��� �Է¹޾� �� ������ �����ڵ带 ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է¶󼼿�: ");
		char inputChar = sc.next().charAt(0);
		
		// �����ڵ� ��� 16����
		// �� ������ ��� ���ڳ� ���ڸ� ��ǻ�Ϳ��� �ϰ��ǰ� ǥ���ϱ� ���� ���
		// ���ڿ� ���ڸ� �ٿ��� ��ǻ�Ͱ� ���� �� �ֵ��� ���ִ� ���
		int unicode = inputChar;//char 2byte int 4byte
		System.out.println("�Է��ѹ��� "+inputChar+" �� �����ڵ�� "+unicode + "�Դϴ�.");
	}
	
	public static void castingPractice3() {
		//�־��� �ڵ忡�� ��ĭ�� ä��� ��� ����� �������� ���� ��
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//�⺻���� double �̱� ������ float���� �������ִ� f �ٿ���
		double dNum = 2.5;
		char ch = 'A';
		System.out.println(iNum1 / iNum2); // 2 �� 2�� �������ٸ�?
		System.out.println((int) dNum);//2
		//double �Ǽ��� �Ǿ� �ִ� ���� ������ ����
		//double 8byte int 4byte ���� ����ȯ�� (int) �����ϰڴٴ� ǥ�ø� �ۼ� �� ������ ��
		System.out.println((double)iNum2 * dNum);//10.0
		//���� ���� ū ���� ������ �ڵ����� ū ������ ����Ǳ� ������ (double)�ʼ��� �ƴ�
		System.out.println((double)iNum1);//10.0
		System.out.println((double) iNum1 / iNum2);//2.5 //���� -> �Ǽ���
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum);//3 �Ǽ��� -> ������
		System.out.println((int)iNum1 / fNum); // 3 //�����⸦ �ؼ� ����3
		//int�� float �� ���� ũ���� byte �������� �Ǽ����� ǥ��
		//float �Ҽ��� ���� 6�ڸ� ������ ������ �⺻����
		System.out.println((double)iNum1 / fNum);//3.33333333
		
		System.out.println((double)iNum1 / fNum);// 3.3333333333333335
		System.out.println(ch);//'A'
		System.out.println((int)ch);// 65
		
		System.out.println((int)ch + iNum1);//75
		// 'A' ���� (int)ch�� ���� 65
		//ū byte�� ���� byte�� ������ �ڵ����� ū byte �����
		//65+ (int iNum1 = 10) = 75
		
		System.out.println((char)(ch +iNum1)); //75 'k'
		
	}
	
	public static void controPractice1() {
		//Ű����� �Է¹ް� �Է� ���� ��ȸ ���� ���� ��ư������ �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		//�޴� ����ϱ�
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("7.����");
		
		//�޴� ��ȣ �Է� �ޱ�
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		//���õ� �޴��� ���� ���� ����
		switch(menuNumber) {
		case 1:
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴� �Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴� ����˴ϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			default:
				System.out.println("�ش��ϴ� �޴��� �����ϴ�.");
				return;
		}
		
	}
	
	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		// System.out.println() ���� ����� ������ �������
		//�� �ٲ����� ���� �ۼ��ϰ� �ʹٸ� \n�̿��ؼ� �ٹٲ��ؼ� ����ϰڴٴ�
		// �������� ǥ���� ������ ��� �ٰ���
		// \n = ���η� �ٹٲ� �ؼ� ���
		// \r = Ű���� �Է��ϴ� ��ġ�� ���� ���� �� ó������ �̵� 
		// System.out.printlr();
		// +�� ); ������ �ʴ� �� ���� �ٲ㼭 ��� �̾ �ۼ��� �� ����
		
		
		System.out.println("1.�޴� ���\n"
				+ "2.¦��/Ȧ��\r\n" //���� �ϳ��� ����ص��� ���� �������� ���� ���� ��, �������þ� �� �������� ���� �ʼ��� �ƴ϶� ��
				+ "3.�հ�/���հ�\r\n"
				+ "4.����\r\n"
				+ "5.�α���\r\n"
				+ "6.���� Ȯ��\r\n"
				+ "7.BMI\r\n"
				+ "8.����\r\n"
				+ "9.P/F ");
		System.out.println("������ ����� �����ϼ���: ");
		
		
//		 1. �޴� ���
//		 2. ¦��/Ȧ��
//		 3. �հ�/���հ�
//		 4. ����
//		 5. �α���
//		 6. ���� Ȯ��
//		 7. BMI
//		  8. ����
//		 9. P/F	
		
		int menuNum = sc.nextInt();
		//���õ� �޴��� ���� ���� ����
		switch(menuNum) {
			case 1:
				System.out.println("�޴� ���");
				break;
			case 2:
				System.out.println("¦��/Ȧ��");
				break;
			case 3:
				System.out.println("�հ�/���հ�");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("�α���");
				break;
			case 6:
				System.out.println("���� Ȯ��");
				break;
			case 7:
				System.out.println("BMI");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("P/F");
				break;
			default:
				System.out.println("�߸��� �Է¹���Դϴ�.");
				return;
				
		}
		
	}

	public static void controlpractice5() {
		/*���̵� ��й�ȣ ���� �� ���̵� ��й�ȣ�� ��ġ�ϴ��� Ȯ��*/
		// ����ڰ� ������ ���̵� ��й�ȣ
		String userID = "user123";
		String userPW = "user12345";
		
		// ��������� �Է¹��� ���̵� ��й�ȣ
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵�: ");
		String inputId = sc.nextLine();
		System.out.println("��й�ȣ: ");
		String inputPW = sc.nextLine();
		
		
		
		
		// �Է¹��� ���� ����� ���̵� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
		if(userID.equals(inputId) && userID.equals(inputPW)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			//���̵� Ʋ�ȴ���  //��й�ȣ�� Ʋ�ȴ��� �����ؼ� ���
			// ! Ư�� ������ �����ϴµ� ���
			/* correctNumber.equals(inputUserName) :correctNumber �� inputUserName�� ��ġ�ϴ��� Ȯ�� ��ġ�ϸ� ��
			 * !correctNumber.equals(inputUserName) : correctNumber �� inputUserName�� ���� ��ġ���� ����
			 *                                        !�� ������ ���̵� Ʋ������ ���� �ȴ�.
			 *       
			 *       */
		} else if(!userID.equals(inputId)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else if (!userPW.equals(inputPW)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else { 
			System.out.println("�߸��� �Էµ� �� �Դϴ�.");
		}
			
}	
	
	public static void controlpractice6() {
		// ����ڷκ��� ȸ�� ��� �Է� �ޱ�
		Scanner sc =  new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���");
		//�����̳� ��Ģ�� �����Ҷ� ���� ����ϴ� ������ : Role
		String userRole = sc.next();
		
		//���� ���
		System.out.println("�ش� ȸ�� ����� ����");
		
		switch(userRole) {
		case "������":
			System.out.println("ȸ������\r\n"
					+ "	�Խñ��ۼ�\r\n"
					+ "	�Խñ���ȸ\r\n"
					+ "	��� �ۼ�");
		break;
		case "ȸ��":
			System.out.println("�Խñ��ۼ�\r\n"
					+ "	�Խñ���ȸ\r\n"
					+ "	��� �ۼ�");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default:
			System.out.println("��ȸ���� �Խñ� ��ȸ�� �����մϴ�.");
		}
	
		
	}

	public static void controlpractice8() {
		/*
		Ű���� �ΰ��� ������ ���� ��ȣ�� �Է¹޾� ���� ��ȣ�� ����
		������ ���
		(�� ���� ���� ��� ����϶��� �۵��ϸ� ���� �����ȣ�� �Է����� ���
		"�߸� �Է��߽��ϴ�." ���) 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1�� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("num2�� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		System.out.print("�����ȣ�� �Է��ϼ���: (+,-,*,/,%)");
		String operator = sc.next();
		String result;
	
		switch(operator) {
		case "+":
			result = "num1 + num2";
			break;
		case "-":
			result = "num1 - num2";
			break;
		case "*":
			result = "num1 * num2";
			break;
			// / % 0���� ���� �� ���� ������ if������ ���� 0�� �� ��� ó���� ������� 
		case "/":
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = "num1 / num2";
		case "%":
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = "num1 % num2";
		default:
			System.out.println("�߸� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
		return;
		}	
		System.out.println( num1 + " "+operator+" "+ num2 + "=" +result);
	}
	
  	public static void main(String[] args) {
		practice8();
		//castingPractice1();
		//castingPractice3();
		//controPractice1();
		//controlPractice10();
		//controlpractice5();
	//controlpractice6();
		//controlpractice8();

	}

}








