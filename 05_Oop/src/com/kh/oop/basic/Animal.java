package com.kh.oop.basic;

public class Animal { //����

	// 1.�ʵ� �̸�String name ���� int age
	public String name;
	public int age;
	
	//2.�ʱ� ������ public Animal () {}
	public Animal() {
		
	}
	
	//3.�ʼ� ������ String name, int age
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//4.��¸޼��� public void info(){System.out.println(�̸��� ���� ���)
	public void info() {
		System.out.println("�̸� :"+name);
		System.out.println("���� :"+age);
	}
	
	//5.���θ޼��� public static void main~ 
	public static void main(String[] args) {
		
	
	
	// 1) �ʱ� �����ڷ� 
		Animal dog = new Animal();
		dog.name = "Ǫ����";
		dog.age = 12;
		
				
		//�������� �̸� ����
		//������ ���� ���
	// 2 ) �ʼ�������
		Animal cat = new Animal("�����", 3);
			//����� ���� ���
		
		dog.info();
		cat.info();
	}	
	
	
}
