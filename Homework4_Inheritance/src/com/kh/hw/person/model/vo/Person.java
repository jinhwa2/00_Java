package com.kh.hw.person.model.vo;

public class Person {
//�ʵ�
	private String name;
	private int age;
	private double height;
	private double weight;
//�޼���
	
	//Getter
	public double getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
	//Setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//������ : �⺻
	public Person() {
		// TODO Auto-generated constructor stub
	}
		//������ : �ʼ�
	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	

	public String toString() {
		return "���[name=" +name +", age=" +age+ ",height="+height+",weight="+weight+"]";
	}

}
