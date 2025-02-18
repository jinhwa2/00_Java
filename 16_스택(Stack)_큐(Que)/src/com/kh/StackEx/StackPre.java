package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
   //main 메서드에서 작성
	public static void main(String[] args) {
		Stack<Integer> 스탭 = new Stack<>();
		//stack 을 활용해서 10 30 50 40 20 을 넣고 push 사용
		스탭.push(10);
		스탭.push(30);
		스탭.push(50);
		스탭.push(40);
		스탭.push(20);
		System.out.println(스탭);
		
		// pop 맨 위 값을 지우고 반환해서 확인
		int 탑 = 스탭.pop();
		System.out.println(탑);
		
		// peek 현재 맨 위 값 확인
		int 맨위값확인 = 스탭.peek();
		System.out.println(맨위값확인);
		
		//isEmpty 비어있는지 확인
		boolean 비었나 = 스탭.empty();
		System.out.println(비었나);
		
		//size크기는 몇인지 확인
		System.out.println(스탭.size());
	}
	
}
