package com.kh.StackEx;

import java.util.Stack;

/*
Stack(스택)
   데이터를 저장하는 자료구조
   LIFO Last In-First Out   : 마자막에 추가된 항목이 먼저 제거
   뒤로 가기 기능, 실행 취소 기능
   
   pop()  : 맨 위 값을 제거하고 반환(보여줌)
  peek()  : 스택이나 큐에서 맨 위 또는 맨 앞에 있는 데이터를 반환(보여줌) 하지만 제거하지는 않음
  push()  : 스택에서 값을 추가할 때는 push 사용하거나 add 를 사용해서 넣음
           주로 스택에서는 push 를tkdyd
           add 보통 리스트나 컬렉션에서 주로 사용
           Stack 클래스가 Vector를 상속받아 만들어진 클래스이기 때문에 add 가능
isEmpty() : 값이 비어있는지 확인ㅁ
   size() : 크기확인          
   
  */
public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();

		스택.push(1);
		스택.push(2);
		스택.push(3);

		// 스택에서 맨 위 데이터를 확인하고 지우기
		int 맨위 = 스택.pop();
		System.out.println(맨위);

		// peek() : 스택에서 맨 위에 어떤 값이 들어있는지 데이터 확인
		int 맨위값 = 스택.peek();
		System.out.println(맨위값);

		// isEmpty() : 스택이 비어있는지 확인
		boolean 비었닝 = 스택.isEmpty();
		System.out.println(비었닝);

		System.out.println("======= 스택 2 =======");

		Stack<Integer> 스택2 = new Stack<>();

		스택2.add(1);
		스택2.add(2);
		스택2.add(3);
		스택2.add(4);

		int 사라진값 = 스택2.pop();
		System.out.println("가장 마지막에 보여주고 사라진 스택2의 값 : " + 사라진값);

		int 맹위값 = 스택2.peek();
		System.out.println("스택 2의 맨위 값은 : " + 맹위값);

		boolean 값의존재유무 = 스택2.isEmpty();
		System.out.println("스택2가 비어있나요 ? " + 값의존재유무);

		int 사이즈 = 스택2.size();
		System.out.println("스택2의 사이즈는? " + 사이즈);

	}
}
