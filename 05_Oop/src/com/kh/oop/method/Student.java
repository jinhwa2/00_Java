package com.kh.oop.method;

public class Student {
	//�ʵ�
	//�л� �̸� ���� �г�
	private String name;
	private int age;
	private int grade;
	
	//�޼���
		//������ : �⺻
	public Student() {
		
	}
	
		//������ : �ʼ� �̸� ���� �г�
	public Student(String name,int age,int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
		//return �޼���
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		
		public int getgrade() {
			return grade;
		}
	
		//����
		public void info() {
			System.out.println("�л��� �̸�:"+name);
			System.out.println("�л��� ����:"+age);
			System.out.println("�л��� �г�:"+grade);
		}
	
	//���θ޼���
	public static void main(String[] args) {
		Student student1 = new Student("�ڿ���",15,2);
		Student student2 = new Student("�迵��",17,1);
		student1.info();
		student2.info();
		//student1 "�ڿ���" 15�� 2�г�
		//student2 "�迵��" 17 1
			

	}

}
