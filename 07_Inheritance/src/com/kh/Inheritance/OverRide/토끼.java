package com.kh.Inheritance.OverRide;

public class 토끼 extends 동물 {
	//생성자
	public 토끼(String 이름) {
		super(이름);
		
		
		
		
	}
	@Override
	public void 소리() {
		System.out.println(이름 + "가(이) 낑낑 짖어요.");
	
	
}
}