package com.kh.practice.list.library.controller;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
	
	//������
	public BookController() {
		
	}

	//å �߰��ϱ�
	public void insertBook(Book bk) {//�� ������ �����
		list.add(bk);
	}

	//å ��ü����
	public void selectList() {
		//���࿡ å�� ���ٸ� ��ϵ� ������ �����ϴ�. å�� �ִٸ�  å ����� �����ְ�
		//
		if(list.isEmpty()) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else {
			//for-each�� Ȱ���ؼ� ��ü����
			for(Book b:list) {
				System.out.println(b.toString());
				
			}
		}
	}
	
	//b.toString @Oberride
	
	//å �˻��ϱ�
	public void searchbook(String keyword) {
		List<Book> �˻���� = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				�˻����.add(b);
			}
		}
	if(�˻����.isEmpty()) {
		System.out.println("�˻������ �����ϴ�.");
	} else {
		for(Book bb:�˻����) {
			System.out.println(bb);
		}
	}
	}
	//���� ���� ��� �߰�
	public void deleteBook(String title, String author) {
		// ture false �� ���� ������ �ƴ��� �� �ƴ��� Ȯ���� �� �ֵ��� ��
		boolean removed = false;  //boolean false ���� �⺻�̱� ������ remove =false
		//å ����� ���ڸ� �˻��ؼ� ������ å ã��
		//��ü��� for-each
		for(Book bbb : list) {
			//���࿡ ���� �����ϰ��� �ϴ� å����� å���ڰ� �����Ѵٸ�
			//     å ���� ��������.���ϱ�(���������ϰ����ϴ�å����)  å���ڵ� �������� ���ϱ�
			if(bbb.getTitle().equals(title)    &&             bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				//������ ������ true
				removed = true;
				break;
			}
		}
		//(���� �ؿ��ٰ�)���࿡ ������ ������ �����ƴٸ� true false �̿��ؼ� ǥ���ϱ�
		if(removed) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�ش��ϴ� ������ ã�� �� �����ϴ�.");
		}
	}
	//�������� ����
	public void ascBook() {
		//for while short �������� ������ ���ָ� ��
			//sort ����� �������� �����ϴ�
								//�����ϴ� ����        å���� å ����
									// :: Book ������ getTitle �����ؼ� ����ϰڴ�.
											//comparing ���ϴ�
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}
}
