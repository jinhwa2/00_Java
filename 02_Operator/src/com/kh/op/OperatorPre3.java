package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {
	//최종 출력해줄 메서드
	//public static	
	public static void method() {
		//public static void method1() 을 만들어서
		// Scanner 를 이용해 num1 num2 의 값을 입력받고
		// < > 를 사용해서 입력 받은 값이 < > 중 어떤 값에서 true 가 나오는지 확인하기
		// boolean result1 = num1 > num2;
		// boolean result2 = num1 >= num2;
		// boolean result3 = num1 < num2;
		// boolean result4 = num1 <= num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("num1의 값을 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.println("num2의 값을 입력하세요: ");
		int num2 = sc.nextInt();
		
		boolean result1 = num1 > num2;
		System.out.println("num1 > num2 = "+result1);
		boolean result2 = num1 >= num2;
		System.out.println("num1 >= num2 = "+result2);
		boolean result3 = num1 < num2;
		System.out.println("num1 < num2 = "+result3);
		boolean result4 = num1 <= num2;
		System.out.println("num1 <= num2 = "+result4);
		
	}
	public static void method2() {
		// 응용편 
		//public static void method2() num1 num2 num3 를 받고 
		// && || 사용해서 크고 작은 값 확인하기
		// boolean result = (num1 < num2) && (num2 == num3) 참이 되는가?
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번 째 숫 자 입 력 하기: ");
		int num1 = sc.nextInt();
		System.out.println("두 번 째 숫 자  ");
		int num2 = sc.nextInt();
		System.out.println("세 번 째 숫자: ");
		int num3 = sc.nextInt();
		// && if while 조건을 체크할 때 //
		//     두 개의 조건이 모두 만족하는 경우 사용
		// & 비트 단위 연산 특정 비트 패턴을 판단할 때 사용
		
		boolean result = (num1<num2) && (num2 == num3);
		System.out.println("(num1<num2) && (num2 == num3)의 결과는!!! "+result+"입니다.");
	}
	
	
	
	public static void main(String[] args) {
		//method();
		method2();
		
		
		
	}	
}
