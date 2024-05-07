package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

/*
Queue(ť)
	���� �߰��� �׸� ���� ����
	First In - First Out : ���� �߰��� �׸��� ���� ���� ����
	�����Ͱ� ���� ���ִ� �Ͱ� �����ϸ�, ���� ���� �� �׸��� ���� �տ� ��ġ
	���(ex>Ƽ����), �̺�Ʈ ó�� 
	
�޼���
	offer() : ť�� ������ ����� ��� ���� �߰��ǰ�, �߰��Ǹ� true ��ȯ
	          �߰����� ���ϸ� ����
	          add�� ����� �� ������ offer�� ���������� ������ ������ ���� ó���� ��
    poll() : ���� �����ϰ� ��ȯ ���࿡ ����ִ� ��� null ��ȯ
  remove() : poll ������ ����� ����������, ����ִ°�� ���ܸ� ����
    peek() : �� �տ� �ִ� ���� ��ȯ������ ���������� ����
 element() : peek ó�� �� �տ� �ִ� ���� ��ȯ������ �������� ����. ����ִ� ��� ���ܸ� ����
        
*/
public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> ť = new LinkedList<>();
		
		// ť�� ������ �߰�
		ť.offer(1);
		ť.offer(2);
		ť.offer(3);
		
		// ť���� �� �� �����͸� Ȯ�� ����
		int ������Ȯ�� = ť.poll();
		System.out.println(������Ȯ��);
		
		// ť �� �տ� ������ Ȯ��
		int �Ǿյ����� = ť.peek();
		System.out.println(�Ǿյ�����);
		
		boolean ����� = ť.isEmpty();
		System.out.println("����ֳ��� ?" + �����);
		
		
		
		
		
		
	}
		
		
		
		
		
		
	
}
