package com.kh.example.practice6.model.vo;
//�ʵ�
public class Book {
	public String title;
	public String publisher;
	public String author;
	public 		int price;
	public double discoutRate;
	
	//������
	//1. �⺻������
	public Book() {
		
	}
	//2. �ʼ� ������ �ʼ��� �Ű������� �־���� �ϴ� ������
	public Book(String title,String publisher,String author ) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	//���
	public Book(String title ,String publisher,String author,int price,double discoutRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discoutRate = discoutRate;
	}
	//void ���
	public void inform() {
		System.out.println("å�̸�: "+title);
		System.out.println("���ǻ�: "+publisher);
		System.out.println("������: "+author);
		System.out.println("å����: "+price);
		System.out.println("������: "+discoutRate);
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "�װ��� �˰�ʹ�.";
		book1.author ="������";
		book1.publisher = "sbs";
		book1.inform();
		////book2 å�������� �ʼ������� String title, String publisher, String author ���
		Book book2 = new Book("5�� 32��","kh T��","T�� ��ü�ϵ�");
		book2.inform();
		//boo3 ��� �ԷµǾ� �ִ� �ʼ� ������ �̿��ؼ� ���
		Book book3 = new Book("Do it!�ڹ� ���α׷��� �Թ�","�������ۺ���","������",16500,0.34);
		book3.inform();
	    
			
	}
	
	
}
