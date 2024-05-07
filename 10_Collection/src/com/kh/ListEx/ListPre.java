package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 List ��Vector : Java1 ���� �뿡�� ���� ���� ���忡�� ���� ��, ����ϴ� ���� �޸� ����� �ʹ� ŭ
      ��ArrayList : �˻��� ���� ���԰� ������ ����� ��� ������
  	  ��linkedList : �˻��� ������ ������ ���԰� �������� ����
 * */

public class ListPre {
	//������ : �⺻ ��Ʈ�� �����̽� ����
	public ListPre() {
		
	}
//void : ����
	public void VectorEx() {
		//List<String> ���� = new Vector<>(); �̷��� ����ص� ������ �Ʒ� ��� ����
		Vector<String> ���� = new Vector<>();
		����.add("�ڹ�");
		����.add("���̽�");
		����.add("C");
		System.out.println(����);
		
	}
	public void LinkedEx( ) {
		//LinkedList<String> ��ũ�帮��Ʈ = LinkedList<>(); 
		LinkedList<String> ��ũ�帮��Ʈ = new LinkedList<>();
		��ũ�帮��Ʈ.add("��");
		��ũ�帮��Ʈ.add("ȣ����");
		��ũ�帮��Ʈ.add("�۾���");
		System.out.println(��ũ�帮��Ʈ);
	}
	
	public void ArrayEx() {
		ArrayList<String> ��̸���Ʈ = new ArrayList<>();
		
		��̸���Ʈ.add("���");
		��̸���Ʈ.add("�ٳ���");
		��̸���Ʈ.add("����");
		System.out.println(��̸���Ʈ);
	
	}

	//main main ��Ʈ�� �����̽���
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
	
	
	
}
