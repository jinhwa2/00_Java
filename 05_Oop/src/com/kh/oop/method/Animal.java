package com.kh.oop.method;

public class Animal {
// �ʵ�
	public String name;
	public int age;
	
//�޼���
	//������
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//�ʼ� name age
	
	//return �޼���
	public String getName() {
		return name;
	}
	//returm���� ���� �ޱ�
	
	public int  getAge() {
		return age;
	}
	//void ���
	public void info() {
		System.out.println("�����̸� :" + name);
		System.out.println("�������� :"+ age);
		
	}
	
	//���θ޼���
	public static void main(String[] args) {
		Animal dog1 = new Animal("������",1);
		Animal cat = new Animal("�����",1);
		
		dog1.info();
		cat.info();
	}

}
