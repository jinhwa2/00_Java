package com.kh.hw.person.model.vo;

public class Student extends Person{
//필드
	//학년
	private int grade;
	private String major;
	//메서드
		//Setter
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	//Getter
	public int getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}

	//생성자 : 기본 ctrl space constructor
	public Student() {
		
	}
	//생성자 : 필수 person 네임과 에이지 헤이트 웨이트 모두 가지고 오고
	//super() 안에 추가
	public Student(String name, int age, double height, double weight,int grade, String major) {
		super(name,age,height,weight); //원래 부모가 갖고 있었던거 부모한테 보내줘라
		this.grade = grade;
		this.major = major;
	}
	
	//@Override toString
	@Override
	public String toString() {
		return "학생[이름="+getName()+",나이="+getAge()
		+ ",키=" +getHeight()+",몸무게="+getWeight()+",학년="+grade+",전공="+major;
	}

}
