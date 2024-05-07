package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*

 Map ��    HashMap   : ���� �˻� �ӵ� (���� ���� ���) 
     ��    TreeMap   : ���ĵ� �����͸� �ʿ��� ��� ���
     �� LinkedHashMap: ������ �����ϸ鼭 �����ϱ� ������ ������ �߿��� ��� ���
 * 
 Map : Ư�� Ű�� �Է��ϸ� �ش�Ǵ� ���� ���� �� �ִ� Collection ��ü
 	Ű = key(=����)
 	�� = value(=����ġ�� �ִ� ��)
 	key:value ������ ����  ,Ű�� ����ͼ� � ����ġ�� ������ ���ڴ�
 	
 	
 	
�޼���
	put(key, value)     : ������ Ű��, ������ ���� ���� �߰�
	get(key)            : ������ Ű�� ����� ���� ������
	containskey(key)    : ������ Ű�� �����ϴ��� Ȯ��
	containsValue(value): ������ ���� �����ϴ��� Ȯ��
	remove(key)         : ������ Ű�� Ű�� ����� ���� ����
	keySet()		    : Ű�� �����ϴ� ������ ��ȯ
	values()            : ��� ������ �����ϴ� �÷��� ��ȯ
	entrySet()          : ��� Ű-���� �����ϴ� ������ ��ȯ
 * */
public class MapEx {
	public static void main(String[] args) {
		//Map ����
		Map<String,Integer> �л��� = new HashMap<>();
		
		//put �� Ȱ���ؼ� �� �߰��ϱ�
		//  .�߰��ϱ�(key,value)
		�л���.put("ö��",   90);
		�л���.put("����",   85);
		�л���.put("�μ�",   88);
		//��ü����
		System.out.println(�л���);
		//get�� ����ؼ� ��ȸ�ϱ�
		System.out.println("ö���� ����: "+�л���.get("ö��"));
		//remove ����ؼ� �����ϱ�
		�л���.remove("����");
		
		//���� ��������� ��ü���⸦ ���ؼ� Ȯ��
		System.out.println("��ü�л��� : "+�л���);
		
		//Ű�� �����ؾ� �� Ű�� ���� �ߺ��� �� �� ���� �� ������ ������ �������
		�л���.put("ö��", 80);
	
		//�л��� ���� ����ϱ�
		//for-each  �л��鿡 ����ִ� key�� ��� ������ͼ� �迭�س��� keySet() Ȱ��
		for(String �̸� : �л���.keySet()) { //�л���.keySet() {"ö��","�μ�"}
			//�� �л��� ���� ��ȸ
			int ���� = �л���.get(�̸�);
			System.out.println(�̸� + "�� ������ "+����);
		}
		
	}

}
