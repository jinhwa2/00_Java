package com.kh.oop.method.ex;

public class HamburgerStore {
 //�ʵ� �ܹ��� �̸� ����
	private String name;
	private int price;

	//�޼���
	//setter
	//getter
	//���� ���ʹ� �����̺� �� �ƴ϶� �ۺ������� �����
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//������ : �⺻
	public HamburgerStore() {
		
	}
	
	//������ : �ʼ� name price
	
	public HamburgerStore(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	//void info() �ܹ��� ���� ��� 
	public void info() {
		System.out.println("�ܹ����̸�: "+name);
		System.out.println("�ܹ��Ű���: "+price);
	}
	
	//main 
	public static void main(String[] args) {
		//1. �⺻ ������ �Ұ����� 2000
		HamburgerStore hs = new HamburgerStore();
		hs.setName("�Ұ�����"); //�ܹ��ſ��� �¿��� �����´�
		hs.setPrice(2000);
		hs.info();
		
		//2. �ʼ� ������ ġ����� 3000
		System.out.println("-------------------------");
		HamburgerStore hs2 = new HamburgerStore("ġ�����",3000);//�÷����� �ƴ� �޹���
		hs2.info(); //�ʼ������ڴ� set�� �ʿ����
		
	}


}
