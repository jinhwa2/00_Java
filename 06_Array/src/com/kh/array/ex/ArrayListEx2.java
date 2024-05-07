package com.kh.array.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	//기본생성자
	public ArrayListEx2 () {
		
	}
	
	public void method1() {
		//딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		// add를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get 0 1 2 사용해서 각  index 자리에 값 출력하기
		
		System.out.println("list.get(0) : " + list.get(0)); //딸기
		System.out.println("list.get(1) : " + list.get(1)); //바나나
		System.out.println("list.get(2) : " + list.get(2)); //사과
		
		//바나나 ->키위 수정, set을 사용해서
		list.set(1,"키위");
		
		//size 를 이용해서 크기 확인 
		System.out.println("바구니 크기 : " +list.size());
		
		//remove 사용해서 키위 삭제
		list.remove(1);
		
		//isEmpty() 비어 있는지 확인
		System.out.println("장바구니 비어 있나요 ? : "+list.isEmpty());		
		//장바구니 뭐뭐 들어가 있는지 확인!
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//앞으로 사용할 for 문
		System.out.println("==============");
//	for( 내가 만들어준 변수명: 반복할변수명      ) {
//		System.out.println();
//	}
		for(String 과일:list) {
			System.out.println(과일);
		}
		
		
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//단축키로 한줄 복사해서 밑에 붙여넣기 ctrl + alr + ↓ 
		//사자 호랑이 고양이 강아지 add
		animal.add("사자"); 
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size() 동물이 몇마리 있는지 확인
		System.out.println(animal.size());
		//고양이 ->토끼로 변경 set
		animal.set(2, "토끼");
		//get으로 동물 확인
		System.out.println("동물1: "+animal.get(0));
		System.out.println("동물2: "+animal.get(1));
		System.out.println("동물3: "+animal.get(2));
		System.out.println("동물4: "+animal.get(3));
		//remove 강이지 삭제
		animal.remove(3);
		//animal.remove(강아지); >가능하다
		//for문을 확용해서 get출력
		for(String name:animal) {
			System.out.println("동물! :"+name);
		}
		//clear 사용해서 모두 삭제
		animal.clear();
		//마지막으로 isEmpty() 모두 삭제가 됐는지 확인
		System.out.println("모두 이사합시다.");
		System.out.println("동물들이 모두 비어있나요? "+animal.isEmpty());
		
	}
	
	public void method3() {
		// 피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자메뉴 ===");
		// pizza 고구마피자 포테이토피자 페페로니 피자들을 추가해주세요
		pizza.add("고구마피자");
		pizza.add("포테이토피자");
		pizza.add("페페로니피자");
	
		//get 을 활용해서 출력
		System.out.println("피자 1번: "+pizza.get(0));
		System.out.println("피자 2번: "+pizza.get(1));
		System.out.println("피자 3번: "+pizza.get(2));
		//get은 하나하나 볼떄 사용하고
		//모두보기 할때는 아래처럼 출력
		System.out.println("모든 메뉴 보기:"+ pizza);
		
		//set 활용해서 페페로니 -> 파인애플
		pizza.set(2, "파인애플");
		
		//remove 파인애플
		pizza.remove("파인애플");
		
		//for 문 활용해서 출력
		for(String 피자 : pizza) {//String 피자 = 이전 for문에서 int i =0 -> int i/String i = 0 ->String i
			System.out.println("피자들은: "+ 피자);
		}
		System.out.println("피자가게가 사라질 예정입니다.");
		//메뉴 모두 삭제
		pizza.clear();
		//메뉴 모두 삭제됐는지 확인 isEmpth()
		System.out.println("메뉴가 모두 삭제되었나요? "+pizza.isEmpty());
	
	
	}
	
		
	
	
	
	
	
	
	
	
	//메인
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();

	}

}
