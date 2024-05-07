package com.kh.oop.method;

public class Animal {
// 필드
	public String name;
	public int age;
	
//메서드
	//생성자
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//필수 name age
	
	//return 메서드
	public String getName() {
		return name;
	}
	//returm으로 나이 받기
	
	public int  getAge() {
		return age;
	}
	//void 출력
	public void info() {
		System.out.println("동물이름 :" + name);
		System.out.println("동물나이 :"+ age);
		
	}
	
	//메인메서드
	public static void main(String[] args) {
		Animal dog1 = new Animal("강아지",1);
		Animal cat = new Animal("고양이",1);
		
		dog1.info();
		cat.info();
	}

}
