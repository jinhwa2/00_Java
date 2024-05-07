package com.kh.practice.list.library.view;

import java.util.Scanner;


import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	// Ű���� �� �Է¹��� scanner
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();

	// Book�� �������ڸ��� ���̴� ���θ޴������
	public void mainMenu() {
		// ���࿡ true ��� ��� ����
		while (true) {
			System.out.println("=== �������� ���α׷� === ");
			System.out.println("1.�����߰�");
			System.out.println("2.���� ��ü ��� ��ȸ");
			System.out.println("3.���� �˻�");
			System.out.println("4.���� ����");
			System.out.println("5.���� �� �������� ����");
			System.out.println("6.����");
			System.out.println("�޴�����: ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				insertBook();
				break;

			case 2:
				selectList();
			case 3:
				serchBook();
				break;
			case 4:
				deleteBook();
			case 5:
				ascBook();
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
			}

		}
	}

	public void selectList() {
		bc.selectList();
	}

	// å �߰��ϱ� ���� Ű����� �ۼ��ϴ� insetBook void �����
	public void insertBook() {
		System.out.print("���� : ");
		String title = sc.nextLine();

		System.out.print("���� : ");
		String author = sc.nextLine();

		System.out.print("ī�װ�: ");
		String category = sc.nextLine();

		System.out.print("����: ");
		int price = sc.nextInt();
		sc.nextLine();

		// å ���� �����ϴ� Book ��ü ��ȯ
		// ����, ����, ī�װ�, ����)
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
	}

	// �����˻�
	public void serchBook() {
		System.out.println("�˻��� Ű���带 �Է��ϼ���");
		String keyword = sc.nextLine();
		bc.searchbook(keyword);
	}
	//���� ����
		public void deleteBook() {
			System.out.println("������ ���� ��� : ");
			String title = sc.nextLine();
			System.out.println("������ ���� ���� :");
			String author = sc.nextLine();
		
	//BookController ���� �����ϴ� ��� �߰�
		bc.deleteBook(title, author);
}	

	// ��������� ������������ �����ϱ�
	// ascending ��������
	public void ascBook() {
		// BookController ���� ������������ �����ϴ� ��� �߰�
		bc.ascBook();
	}
}
