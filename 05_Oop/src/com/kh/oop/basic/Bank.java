package com.kh.oop.basic;

public class Bank {
	// �̸� ���¹�ȣ �ܾ� ��й�ȣ �����ü��ŵ���
	public String name;
	public String accoutNumber;
	public int balance;
	public String password;
	public boolean agree1;
	//boolean �⺻�� false
	// ������ �޼���
	//1. �ʼ��� �ƴ� ������ = Ŭ������ ���ƾ���
	public Bank() {
		
	}
	
	
	//2.�ʼ��� ������//�̸� ���¹�ȣ �ܾ� �н�����
	public Bank(String name,String accoutNumber,int balance,String password) {
		this.name = name;
		this.accoutNumber = accoutNumber;
		this.balance = balance;
		this.password = password;
		
	}
	
	//3.��� �޼���
	public void info() {
		System.out.println("�̸� :" +name);
		System.out.println("���¹�ȣ: "+accoutNumber);
		System.out.println("�ܾ� :"+balance);
		System.out.println("��й�ȣ :"+password);
		System.out.println("�����ü��ŵ��� :"+agree1);
		
	}
	
	//4.���� ���� ��� �޼���
	public static void main(String[] args) {
		//1.�� �� ���� ���� ok
		Bank customer1 = new Bank();
		customer1.name = "jor";
		customer1.accoutNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree1 = true;
		
		customer1.info();
		
		//2. �� �� �������� ���ŵ��� �Ǽ��� ����
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accoutNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		//���ŵ��Ǹ� �ؾ� �ϴµ� ���ŵ��Ǹ� ���ϰ� �ٻڴٰ� ���� ������
				
		customer2.info();
		
		//3.�ʼ� �����ڸ� Ȱ���ؼ� ����Ŭ ���� ��������
		//�̸� ���¹�ȣ �ܾ� ��й�ȣ�� �Է��ϰ�
		//������ ���ŵ��Ǹ� true �����ؼ� ����ϱ�
		Bank costomer3 = new Bank("����Ŭ","121-1234-123",200,"3312");
		costomer3.agree1 = true;
		
		costomer3.info();
		
	}
	
	
	

}
