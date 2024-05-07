package com.kh.oop.method;

public class Car {
	//필드
	public String brand; //
	public String model;
	public    int year;
	
	//생성자
	
	
	//생성자 : 기본
	public Car() {
		
	}
	
	
	//생성자 :필수
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
		// 자동차 
		
		Car car1 = new Car("Toyota","Carmy",2022);
		//값을 출력
		System.out.println(car1.getBrand()+ "  "+car1.getModel()+"   "+car1.getyear());
	}

}
