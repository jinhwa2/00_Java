package com.kh.oop.method.oop;

public class DrinkStore {
//필드
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout; //ok
	//메서드
	//setter
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	//getter
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
		//생성자 : 기본
	public DrinkStore() {
		
	}
		//생성자 : 필수 메이커 로케이션 네임 테이크아웃
	public DrinkStore(DrinkMaker maker,String location,String name,boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
		//void ordermakeDrink
	public void ordermakeDrink() {
		System.out.println(location+" "+name+" 에 주문한 정보");
		maker.makeDrink(); //앞서 만들어논 제조방법 함수러 갖고옴
		if(takeout) {
			System.out.println("테이크아웃 해주세요.");
		} else {
			System.out.println("매장내에서 섭취할께요.");
		}
		
	}
	//System.out.println(location+" "+name+" 에 주문한 정보");
	//만약 takeout true 테이크아웃 주문
	//else 매장내 섭취
	
	
}
