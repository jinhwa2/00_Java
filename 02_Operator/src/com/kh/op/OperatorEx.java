package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
    // 메인 메서드 호출
	public static void main(String[] args) {
		//내가 스캐너로 입력받은 값이 출력되게 해봅시다.
		//int a = 1;
		//int b = 3;
	Scanner sc = new Scanner(System.in);
	System.out.println("안녕하세요. 계산기 입니다.");
	System.out.println("a의 값을 입력하셔요");
	int a = sc.nextInt();
	System.out.println("b의 값을 입력하셔요");
	int b = sc. nextInt();
	
	//덧셈
	int sum = a + b;
	System.out.println("덧셈의 결과는 : "+sum);
	//뺄셈
	int sub = a - b;
	System.out.println("뺄셈의 결과는 : "+sub);
	//곱셈
	int mul = a*b;
	System.out.println("곱셈의 결과는 : "+mul);
	//나눗셈
	int div = a/b;
	System.out.println("나눗셈의 결과는 : "+div);
		
	}

}
