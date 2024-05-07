package com.kh.array.ex;

import java.util.Arrays;

public class ArraysEx2 {
	
	//기본 생성자
	public ArraysEx2() {
		
	}
	
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {  6   ,   4   ,   2   ,3 ,  5,  7,  9};
		//숫자 정렬하기 Arrays.sort
		Arrays.sort(num);
		System.out.println(num);
		//정렬된 내용 출력하기
		System.out.println(Arrays.toString(num));
		//num 배열 복사하기
		int[] abc = Arrays.copyOf(num, num.length);
				//num이 abc로 잘 복사 되었는지
		System.out.println("잘일"+Arrays.toString(abc));
		//num과 abc가 같은지 비교하기
		System.out.println(Arrays.equals(num, abc));
		
	
	
	
	
	
	
	
	
	}
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}

}
