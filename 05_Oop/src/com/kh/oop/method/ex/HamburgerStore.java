package com.kh.oop.method.ex;

public class HamburgerStore {
 //필드 햄버거 이름 가격
	private String name;
	private int price;

	//메서드
	//setter
	//getter
	//세터 게터는 프라이빗 뿐 아니라 퍼블릭에서도 사용함
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	//생성자 : 기본
	public HamburgerStore() {
		
	}
	
	//생성자 : 필수 name price
	
	public HamburgerStore(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	//void info() 햄버거 정보 출력 
	public void info() {
		System.out.println("햄버거이름: "+name);
		System.out.println("햄버거가격: "+price);
	}
	
	//main 
	public static void main(String[] args) {
		//1. 기본 생성자 불고기버거 2000
		HamburgerStore hs = new HamburgerStore();
		hs.setName("불고기버거"); //햄버거에서 셋원을 가져온다
		hs.setPrice(2000);
		hs.info();
		
		//2. 필수 생성자 치즈버거 3000
		System.out.println("-------------------------");
		HamburgerStore hs2 = new HamburgerStore("치즈버거",3000);//플러스가 아닌 콤버다
		hs2.info(); //필수생성자는 set할 필요없다
		
	}


}
