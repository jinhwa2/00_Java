package com.kh.example.practice4.model.vo;
//�ʵ�
public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//���� ���� �����>����Ű ���� �� üũ �� ���� �׸��� ����Ű �׸��� ��� üũ
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	//�ʱ�ȭ ��
	/*{
		grade = 0;
		
		
		
		
	}*/
	
	//�⺻ ������
	public Student() {
		
	}
	//�޼��� void
	public void information() {
		System.out.println("�г���: "+grade);
		System.out.println("�ݹ�ȣ: "+classroom);
		System.out.println("�̸���: "+name);
		System.out.println("Ű�̴�: "+height);
		System.out.println("������: "+gender);
	}

	
	
	
}
