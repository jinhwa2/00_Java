package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
 Colletion(List, Set, Map ) �ݺ��ϴµ� ��� 
 Enumeration : ���̻� ���� X Vector�� ���� ������ ���� Ŭ���������� ����
 
 Iterator : �ݺ��ϴµ� ���(���������� ȸ��)
     		�б⸸ ����, �߰��ϰų� ������ �� ����
 
 
 ListIterator: Iterator ���׷��̵� ����
 			List(Vector, ArrayList LinckedList) �÷��ǿ����� ���
 			��������� ���������� ȸ���Ҽ� ���� ȸ��(���ư�ȸ,���ư���)�� �� ����>�̰� �� ����
 			��������� ��ȸ = �յڷ� �̵�����
 			�߰��ϰų� ������ �� ����
 			
Iterator �ؿ��ִ� �޼���
	hasNext() : ������ �ִ��� ������ Ȯ��
				���࿡ �����Ѵٸ� ture �������� �ʴ´ٸ� false
	Next()    : ���� ���� ������ ���µ� ���
			next() �� ����ϱ� ���� hasNext()�� ����ؼ� �� ������ �ִ��� �������� Ȯ���ϰ�
				next()�� ����ϴ� ���� ������(�μ��� ������ ��)
  
  
  
 * */
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ���ϵ� = new ArrayList<>();
		���ϵ�.add("���");
		���ϵ�.add("��纣��");
		���ϵ�.add("�м��ĸ���"); //������ ���� ����
		���ϵ�.add("����");
		
		//Iterator
		Iterator<String> �ݺ� = ���ϵ�.iterator();
		
		//hasNext() ���� ���� �ִ��� Ȯ�� = true false
		while(�ݺ�.hasNext()) {
			//next() �� ���� �� ��������
			String ���� = �ݺ�.next();
			System.out.println(����);
			
		}
		
		//next()�� ���� �� ������ ����
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
