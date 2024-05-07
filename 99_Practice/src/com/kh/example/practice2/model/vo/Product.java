package com.kh.example.practice2.model.vo;

public class Product {
	//필드
	private String pname; //-이니깐 private
	
	private int price;
	
	private String brand;

	//단축기 누르고 게터 먼저 만든후, 단축키 누르고 세터 누른다
	public void setName(String name) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
//게터세터 적어주는 습관 기른다 겟 붙고 셋붙은 것. 익숙해지면 굉장히 쉽다. 익숙해지는게 굉장히 중요
	//기본생성자
	public Product() {
		
	}
/*	public Product(String name,int price,String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand; 

	}*/
	
	//메서드 void
	public void information() {
		System.out.println("제품이름: "+pname);
		System.out.println("제품가격: "+price);
		System.out.println("브랜드는: "+brand);
		System.out.println("===============");
	}
	
	
	
}
