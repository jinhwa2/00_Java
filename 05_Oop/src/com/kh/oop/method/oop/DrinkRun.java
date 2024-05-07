package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//음료 제조 객체 생성
		DrinkMaker drinkMaker = new DrinkMaker("아메리카노",2,3);
		//음료 가게 객체 생성
	    DrinkStore drinkStore = new DrinkStore(drinkMaker,"서울","빠나쁘레쏘",true);
	     
	     drinkStore.ordermakeDrink();
	     //음료 가게 객체 생성
	     
	}

}
