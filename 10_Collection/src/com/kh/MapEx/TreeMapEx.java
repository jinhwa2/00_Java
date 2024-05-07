package com.kh.MapEx;

import java.util.TreeMap;

/*
 TreeMap �����˻�Ʈ�� ������ �˻� ���� ���� ������ ������ ���� 
 Ű-��(key-value) �����ϴ� �ڷ� ����
 Ű�� �������� �����ؼ� ����(���� : 0-9, ��-��,A-Z,a-z)
 
 �޼���
 put(key, value)      : TreeMap�� Ű-���� �߰�
 get(key)             : ����� Ű�� �ִ� ���� ���� ����
 containsKey(key)     : Ű�� ���Ե��ִ��� Ȯ��
 containsValue(value) : ���� ���Ե��ִ��� Ȯ��
 remove(key)          : ������ Ű�� ���� ����
 size()               : Ű-�� ���� ���� ��ȯ(����Ǿ��ִ�)
 imEmpty()            : ����ִ��� Ȯ��
 clear()              : ��� ����
  
  
  
 * */
public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String>	tm = new TreeMap<>();
		
		//put ����ؼ� �� �߰�
		tm.put(1, "one");
		tm.put(2, "Two");
		tm.put(3, "Three");
		
		//�ѹ��� �ۼ��ϰ� �ʹٸ�
		Integer[] keys = {1, 2 ,3};
		String[] values = {"One","Two","Three"};
		
		//�ݺ����� ����ؼ� �߰�
		for(int i =0; i<keys.length; i++) {
			tm.put(keys[i], values[i]);
		}
		//Map ���� Ű �ߺ�X(�ȵ�) ������ �ٸ� ��� �� �ؿ� �ۼ��� ������ �������		
	
		System.out.println(tm);
		
		//get �޼��带 ����ؼ� �� ��������
		System.out.println(tm.get(2));
		
		//remove����ؼ� Ű-���� ����
		tm.remove(3);
		System.out.println(tm);
		
		//containsKey �޼��带 �̿��ؼ� Ű�� �ִ��� Ȯ��
		System.out.println("1����?:"+tm.containsKey(1));
		
		//size ����ؼ� ���� Ȯ��
		System.out.println(tm.size());
		
		//isEmpty ����ִ��� Ȯ��
		System.out.println(tm.isEmpty());
		
		//clear�� ����ؼ� ��� �� ����
		tm.clear();
		System.out.println(tm);
		
		
		
	
	}
}
