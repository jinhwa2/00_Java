package com.kh.IteratorEx;

import java.util.*; 
/*
 ListIterator
 next�� �տ������� ���������� ���
 hasNext() : ���� ���� �����ϴ��� true false �� Ȯ��
 next()  : ���� �� ��������
 Previous�� �ڿ������� ���������� ������ ���
 hasPrevious()  //Pre(����) ���� ���� �����ϴ��� true false �� Ȯ��
 Previous() : ���� �� ��������
 
 ���� �߰��ϰų� ������ �� ����
 add()             : �߰�
 remove()          : ���� ����
*/
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ����� = new ArrayList<>();
		�����.add("����");
		�����.add("ȭ��Ʈ");
		�����.add("�ʷ�");
		
		//����Ʈ���ͷ����� ����
		ListIterator<String> �ݺ��ϱ� = �����.listIterator();
		
		System.out.println("�տ������� ���");
		while(�ݺ��ϱ�.hasNext()) {
			String ���� = �ݺ��ϱ�.next();
			System.out.println(����);
		} //������ �����ϴ� ��
		
		System.out.println("�ڿ������� ���");
		while(�ݺ��ϱ�.hasPrevious()) {
			String ���� = �ݺ��ϱ�.previous();
			System.out.println(����);
		}
		System.out.println("add �� ����ؼ� �߰��ϱ�");
		�ݺ��ϱ�.add("�Ķ�");
		//add �ؼ� ���� �߰��� ���� �տ��� �߰���
		System.out.println(�����);
		
		//next() �� previous() ����ؼ� ���� ��ġ�� �Ķ��� ��ġ�� �̵�
		�ݺ��ϱ�.previous();
		�ݺ��ϱ�.remove();
		System.out.println("�����ƴ��� Ȯ��: "+�����);
		/*
		 Exception in thread "main" java.lang.IllegalStateException
	     at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
	     at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:43)
	     
	     add ���� �߰��ϸ鼭 ������ �̵��� �������� ����Ʈ�� ���� ��ġ
	     
	     ���̻� ������ ���� ������ ������ �� ����
	     
	     �ذ��ϴ� ���
	     next()�� ȣ���ؼ� ������ġ�� ������ ������ remove() ȣ���ϰų�
	     previous()�� ȣ���ؼ� ���� ��ġ�� ������ ������ remove() ȣ��
		 */
	}
}
