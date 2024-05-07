package com.kh.Inheritance.OverLoading.Ex;

public class Person {
 
	
	//필드 : 변수명을 작성해주는 것
	private String name;
	private int age;
	
	//Getter  //너 메소드 연기 잘한다. 그럴때 메서드가 그거라고 함 혼신의 연기를 한다
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//메서드 : 특정 행동을 하기 위해 묶는 코드
	//setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//생성자 : 기본 오버로딩(똑같은 메서드 이름인데 안에 있는 매개변수가 다를 때 사용)
	public Person() {
		
		
	}
	//생성자 : 필수 오버로딩(똑같은 메서드 이름인데 name이 필수로 들어가길 원하는 메서드
	public Person(String name) {
		this.name = name;
		
	}
	//생성자 : 필수 오버로딩(똑같은 메서드 이름인데 name age가 필수로 들어가길 원하는 메서드)
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//void
	public void displayInfo() {
		System.out.println("이름 :"+name+ ", 나이: "+age);
	}
}
