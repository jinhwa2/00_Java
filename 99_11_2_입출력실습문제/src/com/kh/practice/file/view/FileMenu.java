package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// Ű����� �Է¹��� Scanner �ۼ�
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void Mainmenu() {
		System.out.println("1. ��������");
		System.out.println("2. ���Ͽ���");
		System.out.println("3. ��������");
		System.out.println("4. ��   ��");
		System.out.print("�޴�����");

		int choice = sc.nextInt();
		sc.nextLine(); // �����ִ� ���� �����

		switch (choice) {
		case 1:
			fileSave();
			break;
		case 2:
			// ���Ͽ���
			break;
		case 3:
			// ��������
			break;
		case 4:
			System.out.println("���α׷�����");
			System.exit(0);
			// return;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");

		}

	}
   //1. ��������
	public void fileSave() {
		System.out.println("���ϸ��Է�: ");
		String fileName = sc.nextLine();
		
	//���࿡ ������ �����Ѵٸ�
		if(fc.chechName(fileName)) {
			System.out.println("������ �̹� �����մϴ�.");
		} else {
			System.out.println("�ۼ��� ���� �Է�:");
			String content = sc.nextLine();
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
  //���Ͽ���
	public void fileOpen() {
		System.out.println("������ ���� �̸� �Է��ϱ�:");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpne(fileName);
		
		//������ ���ٸ� ������ �������� �ʽ��ϴ�.
		
		System.out.println("���� ���� ����: "+fileContent);
		System.out.println("���ο� ���� �Է�: ");
		String newContent = sc.nextLine();
		fc.fileEdit(fileName, new StringBuilder(newContent));
	}
}
