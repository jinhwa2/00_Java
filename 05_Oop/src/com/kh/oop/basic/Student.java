package com.kh.oop.basic;

public class Student {
	//1.필드 스트링 name  age  int int 그레이드
	public String name;
	public int age;
	public int grade;
	//학생인데 학생의 이름과 나이와 학년
	//2.생성자 메서드(필수로 작성해야 하는 생성자 메서드 만들기)
	public Student(String name,int age,int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//필수로 넣어야 하는 것 이름 나이 학년
	
	//3.출력 메서드 정보 출력 메서드
	public void info() {
		System.out.println("이름은 : "+ name); //이름 나이 학년 출력
		System.out.println("나이는 :"+age);
		System.out.println("학년은 :"+grade);
	}
	
	
	//4.최종 메인 메서드
	public static void main(String[] args) {
		Student student1 = new Student("김철수", 18, 3);
		Student student2 = new Student("박영희",20,2);
	
	//학생 객체 생성하기 김철수 18살 3학년 박영희 20 2학년
	// Student student1
	// Student student2
		student1.info();
		student2.info();
	
	//학생1과 학생2 정보 출력하기

}
}
