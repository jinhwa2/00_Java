package com.kh.variable.ex;

public class EnumPre {
	public enum 소비자 {
		학생, 직장인, 연장자
	};

	public enum 판매자 {
		소매업, 도매업, 중매업
	};

//생성자 : 기본	
	public EnumPre() {

	}

//메서드
	// void
	public void 메서드2() {
		System.out.println("소비자");
		소비자[] 소비자들 = 소비자.values();
		for(소비자 소: 소비자들) {
			System.out.println(소);
		}
	}

	// void 메서드2를 만들어서 소비자와 판매자를 for-each 사용해서 각각 출력
	
	public void 메서드3() {
	System.out.println("===판매자===");
	판매자[] 판매자들 = 판매자.values();
	for(판매자 판: 판매자들) {
		System.out.println(판);

	}
	// 소비자 학생 판매자 소매업 ordinal() if문 사용해서 비교하는 문장을 메서드 2 작성
	소비자 c = 소비자.학생;
	판매자 p = 판매자.소매업;
	if(c.ordinal()>p.ordinal()) {
		System.out.println();
	} else {
		System.out.println();
	}
	
	
	}

	// 메인메서드
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		ep.메서드3();
	}
}
