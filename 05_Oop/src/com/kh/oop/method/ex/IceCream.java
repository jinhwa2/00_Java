package com.kh.oop.method.ex;

public class IceCream {
//필드
	private String name;
	private int suger;
	private boolean milk;
//메서드
	//setter
	//getter
	public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}
	
	//생성자 : 기본
	public IceCream() {
		
	}
	//생성자: 필수 이름 설탕 우유유무
	public IceCream(String name,int suger,boolean milk) {//타입이 중요한건지 변수는 중요하지 않음
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
	//void makeIceCrem() {
	//아이스크림 만들고 이름 설탕 
	//우유추가하면 우유추가 우유미추가 하면 우유 미추가 우유유무 출력
	//아이스크림 런> 메인메서드 해줄께요
	
	public void makeIceCrem() {
		System.out.println("이름은: "+name);
		System.out.println("설탕은: "+suger+" g");
		if(milk) {
			System.out.println("우유추가");
		} else {
			System.out.println("우유미추가");
		}
		System.out.println("아이스크림이 만들어졌어요.");	
		
	}
}
