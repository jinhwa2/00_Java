package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
//�޼���
	//������ : �⺻
	public ArrayPre() {
		
	}
	//void
	public void practice1() {
		//�迭�� ����ؼ� ��ü �� ���ϱ�
		//�迭�� ����� �� ���� ����
		// �������� ���ڿ����� �������� �Ǽ����� ������ ���� �� [] ��ٱ��� ǥ�� �ۼ�
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
				//����� �ϳ��̱� ������ ��ٱ��� ����� �����ϴ�.
		//for-each �� ó������ ������ �ݺ��ؼ� ���𰡸� ������ �� ���
		for(int ����   : num     ) {
		///�ڿ��� ó������ ���� ������� �������� �־����, �տ��� �ڷ��� �츮�� ���ڶ�� ������ �־��ٲ���
		// num�ȿ� �ִ� ��� ���ڰ� �ϳ��� ���� �ȿ� ����
			// ���ڵ��� ��
			result += ����;  //����� ������� �ϱ⿡ 
		}
	 System.out.println("���ڵ��� �� : " + result);
 }

	public void practice2()	{
		//ArrayList ����ؼ� ���� �߰��ϱ� ��̰� �������� ��ٱ��϶�� ��̸���Ʈ�� �¶��� ��ٱ���
		//ArrayList<>() <>�ȿ� String�� �־ �ǰ� �ȳ־��,�ڿ� �ڷ����� �����ص� ��
		ArrayList<String> goods = new ArrayList<>();
		//��ǰ�� �߰��� ���� add ���ϱ�
		goods.add("��ǻ��");
		goods.add("�����");
		goods.add("T  V");
		goods.add("������");
		
		//��κ��� 2����
		System.out.println(goods);
		
		//for - each ��ġ���� ũ�� ��������� ���� �̸��� �ٿ�����
		for(String a   : goods) {
			//a ->�������� ���ϱ� ����
			System.out.print(a+" ");
		}
	}

	public void practice3() {
		// �迭�� ����ؼ� �ִ밪 ã��
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		
		for(int num    :   numbers) {
			if(num>max) {
				max = num;
			}
		
		}
		System.out.println("�ִ밪 : "+max);
	}

	public void practice4() {
		// ã�� ��ã��~~!
		//���ϰ��� ��� �ٳ��� ���� ������
		String[] fruits = {"���", "�ٳ���", "����", "������"};
		
		String search = "�ٳ���";         //������������ ��ٱ��� �ϳ����� ��ٱ��� �ȳִ´�
						///ã������ ã�Ҵ� �Ϸ��� boolean�־���
		boolean found = false;			//������ ã�Ҵ��� ��ã�Ҵ��� �𸣱� ������ false
		// for - each �� Ȱ���ؼ� �ٳ��� ã��
		//           {"���", "�ٳ���", "����", "������"};
		for( String f  : fruits)
			///��� ������ ������ �����Ű� �ٳ��� ������ ������ �����Ű� �ݺ�, ���� ������ ���� �����ϱ�
			//���࿡ ���� ã�� ���ϰ� �̸��� �Ȱ��ٸ� ã�Ҵ�~! ���ֱ�
			if(f.equals(search)) {
				found = true;
				break;
			}
		System.out.println(search + " ã��?" + (found ? "ã��" : "��ã��"));
	}

	public void practice5() {
		//��ĳ�� ������ �Է��ϰ� �迭�� ������ �ִ��� Ȯ���� ��
		// 4 serch ��ĳ�ʷ� ����
		String[] zoo = {"�ڳ���", "������", "Ǫ�ٿ�", "�䳢", "����"};
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String search = sc.next();
	
		boolean found = false;
		for(String anmimal : zoo) {
			//if(zoo.equals(����)) {
			if(anmimal.equals(search)) {
				found = true;
				break;
			}
		}
	System.out.print(search + " ã�ҽ��ϱ�? " + (found ? "ã�Ҿ��." : "��ã�Ҿ��."));
	


}
}
