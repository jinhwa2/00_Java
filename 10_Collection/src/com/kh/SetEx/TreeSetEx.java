package com.kh.SetEx;

import java.util.TreeSet;

/*
TreeSet
�ߺ��� ������� �ʰ�, ���� �ڵ����� �����ϴ� ����
�˻� Ʈ���� ���·� �����͸� �����ϸ�, �ڵ����� ���ĵ� ���� ����

�ڵ����� 0 ~ 9, A-Z ,a-z, ��-�� ��������

   add()  : �߰�
remove()  : ����
contains(): ������ ���� �ִ��� Ȯ��
isEmpty() : TreeSet �� ����ִ��� Ȯ��
   size() : ���� Ȯ��
first()   : ���� ���� ������ ��ȯ
last()    : ���� ū �����͸� ��ȯ
Clear()   : ��� �� ���� 
 * */
public class TreeSetEx {
	
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		//�߰�
		ts.add(5);
		ts.add(2);
		ts.add(1);
		System.out.println("TreeSet  ��κ���: "+ts);
		ts.remove(2);
		//����Ű :�ڵ� �� �̵� alt ȭ��ǥ �� �Ʒ���
		//����Ű :�� ����  ctrl  + D
		System.out.println("TreeSet  ��κ���: "+ts);
		
		//Set �ߺ��̾ȵǴ� ȣ�ָӴ� ���� ����
		// �ָӴϰ��� = �ȿ� ������� ������ �Ǿ����� �ʴٴ� �ǹ�
		
		// �� ������ �Ǿ��ִ��� Ȯ��
		System.out.println(ts.contains(5));
		
		//����ִ��� Ȯ��
		System.out.println(ts.isEmpty());//��������� true
		
		//������ ����
		System.out.println(ts.size());
		
		//���� ���� ��
		System.out.println(ts.first());
		
		//���� ū ��
		System.out.println(ts.last());
		
		//��� �� ����
		ts.clear();
		System.out.println("��κ���:"+ts);
		
		
	}
}
