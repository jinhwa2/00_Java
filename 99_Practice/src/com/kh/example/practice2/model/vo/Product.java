package com.kh.example.practice2.model.vo;

public class Product {
	//�ʵ�
	private String pname; //-�̴ϱ� private
	
	private int price;
	
	private String brand;

	//����� ������ ���� ���� ������, ����Ű ������ ���� ������
	public void setName(String name) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
//���ͼ��� �����ִ� ���� �⸥�� �� �ٰ� �º��� ��. �ͼ������� ������ ����. �ͼ������°� ������ �߿�
	//�⺻������
	public Product() {
		
	}
/*	public Product(String name,int price,String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand; 

	}*/
	
	//�޼��� void
	public void information() {
		System.out.println("��ǰ�̸�: "+pname);
		System.out.println("��ǰ����: "+price);
		System.out.println("�귣���: "+brand);
		System.out.println("===============");
	}
	
	
	
}
