package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		
		 
		  더하기 빼기 곱하기 몫 출력하기
		  
		  int 숫자1
		  int 숫자2
		  
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9까지 숫자를 입력받습니다.");
		System.out.print("숫자1 을 입력해주세요: ");
		int 숫자1 = sc.nextInt();
		//만약에 숫자1이 1~9까지 값이 아니라면
		//shift를 누르고 원하는 위 아래 방향 화살표 원하는 만큼 입력 ctrl alt화살표
		System.out.print("숫자2 을 입력해주세요:");
		int 숫자2 = sc.nextInt();
		// 1부터 9까지 값을 스캐너로 각각 입력받아
		
		if(숫자1 <1 || 숫자1>9) {
			System.out.println("1부터 9 사이의 정수를 입ㅇ력하세요.");
			return; //프로그램 종료
		}
		//합
		if(숫자2 <1 || 숫자2>9) {
			System.out.println("1부터 9 사이의 정수를 입ㅇ력하세요.");
			return; //프로그램 종료
		}
		//합
		int 합 = 숫자1+숫자2;
		//빼기
		int 빼기 = 숫자1-숫자2;
		//곱하기
		int 곱 = 숫자1*숫자2;
		//몫
		int 몫 = 숫자1/숫자2;
		
		
		System.out.println(숫자1+" + "+숫자2+" = "+합);
		System.out.println(숫자1+" - "+숫자2+" = "+빼기);
		System.out.println(숫자1+" * "+숫자2+" = "+곱);
		System.out.println(숫자1+" / "+숫자2+" = "+몫);
		
		
		
		
		
			
		}
	
		
		
		
		
	}

