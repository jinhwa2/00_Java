package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		// substing 메서드를 사용해서 문자열의 Today 추출
		String 문제1 = "Today is a beautiful day.";//오늘은 아름다운 날이다.
		String 서브스틀 = 문제1.substring(0,5);
		System.out.println(서브스틀);
		
		// toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programmin is fun and challenging";
		String 투우펄 = 문제2.toUpperCase();
		System.out.println("대문자니? "+투우펄);
		
		// toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Leanrning new things is exciting";//새로운 것을 배우는 것은 흥미로운 것이다
		String 투로울 = 문제3.toLowerCase();
		System.out.println("소문자니? "+투로울);
		
		// split 활용해서 문자열을 " " 로 구분하기
		String 문제4 = "A good medicine tastes bitter"; //좋은 약은 쓰다
		String[] 스필트 = 문제4.split(" ");
		for(String 스필 :스필트) {
			System.out.println(스필);
		}
		
		// replace 활용해서 more 을 less 로 대체
		String 문제5 = "The more, the better";
		String 리플레 = 문제5.replace("more", "less");
		System.out.println(리플레);
		
		// charAt 사용해서 6번째 글자를 가져오기			
		String 문제6 = "Walls have ears"	; //하찮은 개에게도 그의 날이 있다.
		char 차아트 = 문제6.charAt(5);
		System.out.println(차아트);
		
		// substing 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 서브스틀2 = 문제7.substring(14);
		System.out.println(서브스틀2);
		

	}

}
