package com.kh.IteratorEx;

import java.util.*; //java ���� �ؿ� util ���� �ȿ� �ִ� ���� ��� ��������.
/*
 ���� ��ġ�� ������ ��
 ������ ���� ��ġ���� ���� ������ ������ ����
 *����ؼ� ��� �������⸦ ���ش�.
      * ��ü���� : 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {

	public static void main(String[] args) {
		// 100,10,20,30,50,70
		ArrayList<Integer> ���ڵ� = new ArrayList<>(Arrays.asList(100,10,20,30,50,70));
		//���ڸ� �߰��ϴ� ��� 2ź
		//Arrays.asList();
		
		//���ڸ� �߰��ϴ� ��� 1ź
		//���ڵ�.add(100);
//		���ڵ�.add(100);
//		���ڵ�.add(10);
//		���ڵ�.add(20);
//		���ڵ�.add(30);
//		���ڵ�.add(50);
//		���ڵ�.add(70);
		
		
		
		System.out.println(���ڵ�);
	
		
		
		//Iterator ����
		Iterator<Integer> �ݺ��ϱ� = ���ڵ�.iterator();
		
		//while�� ����ؼ� hasNext()�� ���� ��Ұ� �ִ��� Ȯ���ϰ�
		while(�ݺ��ϱ�.hasNext()) {
			int ���� = �ݺ��ϱ�.next();
			System.out.println(����);
		}
		//next()�� ����ϱ�

	}

}
