package com.kh.oop.basic;

public class Student {
	//1.�ʵ� ��Ʈ�� name  age  int int �׷��̵�
	public String name;
	public int age;
	public int grade;
	//�л��ε� �л��� �̸��� ���̿� �г�
	//2.������ �޼���(�ʼ��� �ۼ��ؾ� �ϴ� ������ �޼��� �����)
	public Student(String name,int age,int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//�ʼ��� �־�� �ϴ� �� �̸� ���� �г�
	
	//3.��� �޼��� ���� ��� �޼���
	public void info() {
		System.out.println("�̸��� : "+ name); //�̸� ���� �г� ���
		System.out.println("���̴� :"+age);
		System.out.println("�г��� :"+grade);
	}
	
	
	//4.���� ���� �޼���
	public static void main(String[] args) {
		Student student1 = new Student("��ö��", 18, 3);
		Student student2 = new Student("�ڿ���",20,2);
	
	//�л� ��ü �����ϱ� ��ö�� 18�� 3�г� �ڿ��� 20 2�г�
	// Student student1
	// Student student2
		student1.info();
		student2.info();
	
	//�л�1�� �л�2 ���� ����ϱ�

}
}
