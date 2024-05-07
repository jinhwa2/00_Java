package com.kh.Inheritance.OverRide;

public class 소 extends 동물 {
	//생성자
	public 소(String 이름) {
		super(이름);
}
	@Override
	//void
	public void 소리() {
		System.out.println(이름 + "가(이) 음메 짖어요.");
	}
}