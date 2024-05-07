package com.kh.arrayList.pre;

public class BookArray {
	// 메인메서드
	public static void main(String[] args) {
		// 객체생성
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드", "손원평");
		책들[1] = new Book("불변의법칙", "모건 하우철");
		책들[2] = new Book("나는 읽고 쓴다", "손웅정");

		// System.out.println(책들); ->컴퓨터에서 책들 배열의 주소 입니다.
		// 책을 어떻게 볼거냐면 for문을 쓸거에요
		for (Book 책 : 책들) {
			// System.out.println(책); ->책들에서 한 권씩 책 들의 주소
			System.out.println(책.getBookName());
			System.out.println(책.getAuthor());
		}

		System.out.println("=========================");
	
}
}

