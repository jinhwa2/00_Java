package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//Geeting : 안녕하세요 인사를 출력하는 메서드
	
	//1 미만의 숫자가 입력됐다면
	//1 이상의 숫자를 입력해주세요가 출력되면서
	//다시 사용자가 값을 입력하도록 하기
	
	public void practice1() {
		//사용자로부터 한개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단, 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자를 입력했다면
		//1이상의 숫자를 입력해주세요 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		// 입력받은 숫자가 1미만일 경우 출력해주기
		if(num <1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			return;
		}
		
		//입력받은 숫자가 1 이상이면 1부터 입력받은 숫자까지 모두 출력해주기
		for(int i =1; i<=num; i++) {
			//System.out.println(i+" <= "+num);
		}
		//마무리로 줄바꿈을 해주길 원한다면
		System.out.println(); //줄바꿈 완성
	}
	
	
	public void practice2() {
	//입력받기 위해서틑 스캐너를 통해서 입력받기
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
		System.out.print("숫자를 입력하세요: ");
		 num = sc.nextInt();
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해주세요");
			}else {
				break;
			}
		}
		System.out.println("1부터"+num+"까지의 숫자들");
		int i =1;
		while(i<=num) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println();
	}
	
	

	public void practice3() {
		// 사용자로부터 한 개의 값을 입력받아
		Scanner sc = new Scanner(System.in);
		int num;
			while(true) {
			System.out.print("한개의 숫자를 입력하세요: ");
			num = sc.nextInt();
			if(num < 1) {
				System.out.println("입력한 숫자는 1보다 크거나 같어야 합니다.");
			} else {
				break;
				
			}
					
			
		}
			System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
			int i =1;
			while(i>=num) {
				System.out.println(i+" ");
				num--;
			}
	
	
	
	
	}		
	

		
		
		
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("숫자 한개를 입력하세요: ");
			num = sc.nextInt();
			if(num<1) {
				System.out.println("1이상의 숫자를 입력해주세요");
			}
		}while (num>1);
		for(int i=num; i>=1; i--) {
			System.out.println(i + " ");
	
	}
}
	
	public void practice5() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하기
		//ex. 정수를 하나 입력하세요: 8
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 =36
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		// 입력 받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		//숫자가 들어왔을 때 1부터 입력받은 숫자까지 더해서 총합 구하기
		for(int i=1; i<=num; i++) {
			result += i;
			
			//더해지숫자를 출력하기
			if(i <num) {
				System.out.print(i+ "+");
			}else {//i > num
				System.out.print(i+"=");
				
			}
		}
		System.out.println(result);
	}
	
	public void practice7() {
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자 출력하기
		 만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요 출력하기
		 **/
		Scanner sc = new Scanner(System.in);
		while(true ) {
			System.out.print("첫 번째 숫자: ");
			int firstNum = sc.nextInt();
			
			System.out.print("두 번째 숫자: ");
			int secondNum = sc.nextInt();
			
			//만약에 첫 번째 숫자와 두 번째 숫자 모두 1보다 크거나 같을 경우
			if(firstNum >=1 && secondNum>=1) {
				//int fistNum <= secondNum
				// 두 수를 비교해서
				//최소값 최대값 구하기
				int 최소값 = Math.min(firstNum,secondNum);
				//Math(수학 파일에서) 가장 작은 값을 찾는 min을 활용해서
				//알아서 비교하고 작은 값을 구하게 하기
				//(  ,  ) 괄호 안에 숫자를 넣을 때 숫자 순서는 상관없음
				// Math에도 random 이 있던데요?!
				//Random파일 Math.random
				// Math에 있는 random보다 Random에 있는 랜덤기능이 더
				// 많지만 둘 다 사용하는데 큰 차이는 없음
				// 
				int 최대값 = Math.max(firstNum,secondNum);
				for(int i = 최소값; i <=최대값; i++) {
					System.out.println(i+ " ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요. ");
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String operator;
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산입력(+ - * / % :");
			operator = sc.next();
			
			if("operator".equals("exit")) {
				System.out.println("해당프로그램을 종료합니다.");
				break;
			}
			System.out.println("정수1을 입력해주세요: ");
			int 정수1 = sc.nextInt();
			System.out.println("정수2를 입력해주세요: ");
			int 정수2 = sc.nextInt();
			
			int 결과;
			
			if(operator.equals("+")) {
				결과 = 정수1 + 정수2;
			} else if(operator.equals("-")) {
				결과 = 정수1 - 정수2;
			} else if(operator.equals("*")) {
				결과 = 정수1 * 정수2;
			} else if(operator.equals("/")) {
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				}
				결과 = 정수1 / 정수2;
			} else if(operator.equals("%")) {
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				}
				결과 = 정수1 % 정수2;
			} else {
				System.out.println("없는 연산자 입니다. 다시 입력해주세요");
				continue;
			}
			System.out.println(정수1+" "+operator+" "+정수2+"="+결과);			
		}
		
	}
	
	
	
	/* 13과 14 번 문제 이중 for answp*/
	public void practice13() {
		//키보드로 숫자를 입력 받고 별찍기를 진행한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num  = sc.nextInt();
		
		//입력받sms 수만큼 세로줄 출력 ex) 2 세로로 二 (이 +한자)
		for(int 세로줄 =1; 세로줄 <=num; 세로줄++) {
			//한줄씩 별을 만들어주고 싶음
			// 한 줄-하나 두줄-둘 세줄-셋....num줄 = num
			for(int 별=1; 별<=세로줄; 별++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void practice14() {
		//키보드로 입력받을 정수
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력: ");
		int num  = sc.nextInt();
		// 이중 포문 for(int line = num; 조건식: 증감식)
		//          for(int start=1; line<=start; star++)
		
		for(int line = 0; line >=1 ; line++) { //; 은 for문안에서 2개만 사용 가능
			for(int star=num; star<=line; star--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		//키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++ ) {
			//blank 공백을 출력하기 위한 for문
			//line 번째 줄에서는 line개의 공백을 출력하겠다
			 for (int blank = 0; blank < line; blank++) {
				 System.out.print("  ");
			 }
			 //start 별을 출력하기 위한 for문
			 //line 번째 줄에서는 size - line 개의 별을 출력
			 //	첫 번째 줄 size
			 // 두 번째 줄 size - line  
			 for (int star = size; star > line; star--) {
				 System.out.print("* ");
			 }
			System.out.println();
			
			
		}
	}

		
	
	//15번 문제
	//
	
	
	
	
	
	public void Geeting() {
		System.out.println("안녕하세요.");
	}
	//Geeting2 : 반갑습니다 인사를 출력하는 메서드
	public void Geeting2() {
		System.out.println("반갑습니다.");
	}
}




