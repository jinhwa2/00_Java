package com.kh.oop.constructor;

public class Cafe { //�� ���� () ���� ����
	//�ʵ弱��
		//���� �̸� ���� ���̺� ��
	public String name;
	public String location;
	public    int  tableNum;
	
	
	//�⺻������ �� 
	public Cafe() { //�߰��� �ƹ��͵� �ȵ�
		
	}
	//�ʼ������� �����
    public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	// void �޼��� �����
	public void cafeInfo() {
		//ī���̸� ���� ���̺�� ����ϱ�
		/*this.name = name;
		this.location = location;
		this.tableNum = tableNum;*/
		System.out.println("�����̸� :"+name);
		System.out.println("�������� :"+location);
		System.out.println("���̺�� :"+tableNum);
		System.out.println("---------------");
	}
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���. kh�����Դϴ�.");
		System.out.println("=== ī�� ��ȸ�ϱ� ===");
		
		//Cafe ��ü�� ����ؼ� 
		//1. �⺻�����ڷ� cafe1 �����
		// �̸� ���̺� �ۼ��ϰ� ����ϱ�
		Cafe cafe1 = new Cafe();
		cafe1.name = "���������";
		cafe1.tableNum = 5;
		
		cafe1.cafeInfo();
		
		//2. �⺻�����ڷ� cafe2 �����
		//���� ���̺� �ۼ��ϰ� ����ϱ�
		Cafe cafe2 = new Cafe();
		cafe2.location = "�ϻ�";
		cafe2.tableNum =5;
		
		cafe2.cafeInfo();
		
		//3.�ʼ������� cafe3 �����
		//�ʼ��� ������ ���� ����ϱ�
		Cafe cafe3 = new Cafe("�����׸���"," ����",4);
		
		cafe3.cafeInfo();

	}

}
