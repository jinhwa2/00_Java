package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {
	// ��ĳ�ʷ� ���ϴ� ���� ���� ��ȣ�� �Է��ϱ�
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {
		while (true) {
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1. ���� �߰�");
			System.out.println("2. ù ��° ��ġ�� ���� �߰�");
			System.out.println("3. ��ü ��� ���");
			System.out.println("4. ���� �˻�");
			System.out.println("5. ���� ����");
			System.out.println("6. ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ��� �������� ����");
			System.out.println("9. ���α׷� ����");
			System.out.println("�޴�����: ");
			// ��ȣ �Է��� �� �ִ� ��ȣ �Է� ���� ������ֱ�
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				//removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �޴� �����Դϴ�.");

			}

		}

	}

	// ���� �߰�
	public void addList() {
		System.out.println("��� �Է�: ");
		String title = sc.nextLine();
		
		System.out.println("������ �Է�: ");
		String singer = sc.nextLine();
		
		//��� ���� �����ϱ�
		mc.addList(title, singer);
		
		
	}
	
	// ù ��° ��ġ�� �ٷ� ���� �߰��ϱ�
	public void addAtZero() {
		System.out.println("��� �Է�: ");
		String title = sc.nextLine();
		
		System.out.println("������ �Է�: ");
		String singer = sc.nextLine();
	
		// ������ �߰��ϴµ� �� �տ� �߰�
		mc.addAtZero(title, singer);
	
	}
	
	// ��� ���� ��� ���
	public void printAll() {
		System.out.println(mc.printAll());
	}

	// ���� �˻�
	public void searchMusic() {
		System.out.println("�˻��� ��� �Է�: ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}

	//���ǿ��� ������ ����
	public void setMusic() {
		System.out.println("������ ��� �Է�: ");
		String title = sc.nextLine();
		System.out.println("���ο� ������ �Է�: ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}

	// �������� ����
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("����� ������������ �����Ͽ����ϴ�.");
	}
	// �������� ����
	public void descTitle() {
		mc.descSinger();
		System.out.println("�������� ������������ �����Ͽ����ϴ�.");
	}

}

