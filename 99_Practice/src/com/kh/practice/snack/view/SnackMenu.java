package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� :");
		String kind = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�� : ");
		String flavor = sc.next();
		System.out.print("���� :");
		int numOf = sc.nextInt();
		System.out.print("���� :");
		int price = sc.nextInt();
		System.out.println("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n)");
		
		String answer = sc.next();
		//���࿡ y�� ������ ������ ���� ���
		//equalsIgnoreCase ��ҹ��� ������� �� ���ڿ��� ���ϴµ� ���(�߿��ϴ�)
		if(answer.equalsIgnoreCase("y")) { //�빮�� �ҹ��ڸ� �������� �ʰ� �ѹ��� ���°Ŵ� equals���� equalsIgnoreCase
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			//���� ���� �� ������ Ȯ��
			System.out.println(scr.confirmData());
			
		} else if(answer.equalsIgnoreCase("n")) {
			System.out.println("���α׷��� �����մϴ�.");
		}
		//������ ���� ���
	}


}
