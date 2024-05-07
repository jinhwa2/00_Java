package com.kh.inheritance.ex;

// extends 스마트폰 상속받기
/*
 * 
 */
public class 갤럭시 extends 스마트폰 {
//필드
	private int 안드로이드;

	// 메서드
	// Setter
	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}

	// Getter
	public int get안드로이드() {
		return 안드로이드;
	}

	// 생성자 : 기본 컨트롤+스페이서 엔터
	public 갤럭시() {

	}

	// 생성자 : 필수 알트 슈프트 에스 오
	public 갤럭시(String 화면, String 통신사, String 성능, int 안드로이드) {
		super();
		this.안드로이드 = 안드로이드;

	}
	//@Override toString  alt shift s s
	@Override
	public String toString() {
		return "갤럭시 버전 : " + 안드로이드 +  " / "  + super.toString() + "]";
	}
	
	

	// @Override toString 알트 슈프트 에스에스

}
