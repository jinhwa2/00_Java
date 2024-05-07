package com.kh.variable.ex;
/*
 Enum(������)
 �� : �����ϴ� ������ �� �þ�� ��
 �� : ��ų� ����Ű�ų� ���ϴ� ��
 �þ �ۼ��س��� ���� ����
 
 �������� �����س��� �� ���(��������� ������ �̸�)
 
 �޼���
 values()              : Enum�� ������� ��� ���ĸ� �迭�� ��ȯ
 valueOf(String �̸�)   : �̸��� ��ġ�ϴ� Enum ����� ��ȯ
 ordinal()             : Enum ����� ������ ����
 name()			       : Enum ����� �̸� ��ȯ
 campareTo(EnumType e) : �ٸ� Enum ����� ���� ��
 toString()            : Enum ����� ���ڿ� ǥ�� ��ȯ
 getClass()			   : Enum Ŭ������ Class ��ü ��ȯ		 
  
 * */
public class ������Ex {

	public enum ��¥�� {
		������,
		ȭ����,
		������,
		�����,
		�ݿ���,
		�����,
		�Ͽ���
	}
	public enum ���� { //��� ����
	//	 0	 1	  2	   3  index		
		��, ����, ����, �ܿ�
	}
	public static void main(String[] args) {
		//�� ���� ���
		System.out.println("������ :"+��¥��.������);
		System.out.println("ȭ���� :"+��¥��.ȭ����);
		System.out.println("������ :"+��¥��.������);
	 
		����[] ������ = ����.values();
		System.out.println("�����鿡 ���ǵ� ��� ���");
		for (���� r : ������) {
			System.out.println(r);
		}
		
		//valueOF(String �̸�) : �̸��� ��ġ�ϴ� Enum ����� ��ȯ
		//exception ���μ� ������ ����ó�� ����
		���� �� = ����.valueOf("��");
		System.out.println("�� �� ��ġ�ϴ� ��� : "+��);
		
		//ordinal : ���� ���̸� �����ϴ� ��
		System.out.println("�� ����� ���� :"+��.ordinal());
	
		//name() : ����� �̸��� ����
		System.out.println("�� ����� �̸�: " + ��.name());
		
		//toString : values() �� ����ߴ� ��ó�� ����ؼ� ���
		System.out.println(��.toString());
		
		//getClass() : Ŭ���� ��ü ��ȯ
		System.out.println("Ŭ������ ��ü�� : "+������.getClass());
		//class [Lcom.kh.variable.ex.EnumEx$����; ������ �迭�� ��Ÿ���� ��
	
	}

	
	
	
}
