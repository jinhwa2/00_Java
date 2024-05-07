package com.kh.example.practice4.model.vo;
//필드
public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//세터 게터 만든다>단축키 먼저 겟 체크 후 세터 그리고 단축키 그리고 모두 체크
	
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
	
	//초기화 블럭
	/*{
		grade = 0;
		
		
		
		
	}*/
	
	//기본 생성자
	public Student() {
		
	}
	//메서드 void
	public void information() {
		System.out.println("학년은: "+grade);
		System.out.println("반번호: "+classroom);
		System.out.println("이름은: "+name);
		System.out.println("키이는: "+height);
		System.out.println("성별은: "+gender);
	}

	
	
	
}
