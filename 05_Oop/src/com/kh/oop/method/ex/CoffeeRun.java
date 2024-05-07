package com.kh.oop.method.ex;

public class CoffeeRun {
	public static void main(String[] args) {
		// 커피 메이커 객체 생성
		CoffeMaker coffee1 = new CoffeMaker();
		coffee1.setCoffeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		
		
		
	}

}
