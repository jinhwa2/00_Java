package com.kh.oop.method;

public class Car {
	//�ʵ�
	public String brand; //
	public String model;
	public    int year;
	
	//������
	
	
	//������ : �⺻
	public Car() {
		
	}
	
	
	//������ :�ʼ�
	public Car(String brand,String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		
		
	}
	//
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getyear() {
		return year;
	}
	public static void main(String[] args) {
		// �ڵ��� 
		
		Car car1 = new Car("Toyota","Carmy",2022);
		//���� ���
		System.out.println(car1.getBrand()+ "  "+car1.getModel()+"   "+car1.getyear());
	}

}
