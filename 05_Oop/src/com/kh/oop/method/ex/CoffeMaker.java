package com.kh.oop.method.ex;

public class CoffeMaker {
// 필드
	private String coffeType; //커피 종류
	private int sugar; //설탕양
	private boolean milk; //우유 유무//겟할시 불리언은 겟이 아니라 이즈 체크
	
	//getter - boolean 같은 경우 get 이 아니라 is 표기
	public void setCoffeType(String coffeType) {
		this.coffeType = coffeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	public String getCoffeType() {
		return coffeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}

	
//메서드 게터 해주고 세터
	//생성자 : 기본
	public CoffeMaker() {
		
	}
	//생성자 : 필수 
	public CoffeMaker(String coffeType,int sugar,boolean milk) {
		this.coffeType = coffeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	
	//void
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류: "+coffeType);
		System.out.println("설턍: "+sugar+" g");
		//만약에 우유가 추가 됐다면
		if(milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
	}
}
