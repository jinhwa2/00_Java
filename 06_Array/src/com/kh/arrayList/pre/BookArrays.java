package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {
	public static void main(String[] args) {
		Book[] å�� = new Book[3];
		å��[0] = new Book("�Ƹ��", "�տ���");
		å��[1] = new Book("�Һ��ǹ�Ģ", "��� �Ͽ�ö");
		å��[2] = new Book("���� �а� ���� ������", "�տ���");
	//å ���� ����
		//								�����ϰ����������, �����������Ұ����� �����Է�
		Book[] ������������ = Arrays.copyOf(å��, å��.length);
		//������ ������ ���� ���
		System.out.println("=== ������ ������ å���� ===");
		//for - each
		for(Book å : å��) {
			System.out.println(å.getBookName()+" , "+å.getAuthor());
		}
		//å��� ������ ������ å�� ������
		boolean same = Arrays.equals(å��, ������������);
		//������������ ��Ȳ������ å�� �����ؼ� ������ ���µ�
		Book[] ��Ȳ������ = Arrays.copyOf(å��, 3);
		//for - each �� ��� ��Ȳ���������� ���� å���� ���
		for(Book å : å��) {
			System.out.println(å.getBookName()+","+å.getAuthor());
		}
	}

}
