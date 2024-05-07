package com.kh.loop.ex;

import java.util.Scanner;

public class LoopwhileEx {
	
	/*
	public static void method1() {
	Scanner sc = new Scanner(System.in);
	1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료
	int menu
	while(true) {
		System.out.println("~~ 프로그램 작성");
		System.out.println("원하는 프로그램 번호를 입력해주세요 :
		switch(menu) {
		   case 1 :
		   
		   case 4 :
		
		
		}
	}
	
	
	
	}
	 * */
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==========[메뉴판]===========");
			System.out.println("1.아메리카노 2.카페라떼 3.녹차 4.주문취소");
			System.out.println("메뉴를 입력해주세요: ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("아메리카노");
				break;
			case 2:
				System.out.println("카페라떼");
				break;
			case 3:
				System.out.println("녹차");
				break;
			case 4:
				System.out.println("주문취소");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.\n"
						           +"다시 입력해주세요\n");
				
			}
		}

	}
	
	/*
	public static void kh까페() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("kh카페에 오신걸 환영합니다. ^^* \n"
		                 +"원하는 메뉴를 입력해주세요.\n"
		                 +"1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 
		                 
     	String minu = sc.next();
     	switch (menu) {
     		case "1": case "아메리카노":
     		System.out.println("아메리카노 주문 추가되었습니다.");
     		break;
     		
     		
     		case "5": case "주문취소:
     		System.out.println("주문이 취소되었습니다.");
     		
 		default:
 			System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요");
     	}
	
	}
	 * */
	public static void kh까페() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kh카페에 오신걸 환영합니다.^^*\n"
					           + "원하는 메뉴를 입력해주세요.\n "
					           + "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5주문취소 ");
			String menu = sc.next();
			switch(menu) {
			case "1": case "아메리카노":
				System.out.println("아메리카노 주문 추가되었습니다.");
				break;
			case "2": case "까페라떼":
				System.out.println("카페라떼 주문 추가되었습니다.");
				break;
			case "3": case "녹차":
				System.out.println("녹차 주문 추가되었습니다.");
			case "4": case "흑당버블티":
				System.out.println("흑당버블티 주문추가 되었습니다.");
			break;
			case "5": case "주문취소":
				System.out.println("흑당버블티 주문추가 되었습니다.");
				return;
			default:
			System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요");
			}
			
			
		}
	}
	
	public static void getMoney() {
		//커피 10잔 커피값 300원
		int coffee = 10;
		int money = 300;
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			coffee--;
			System.out.println("남은 커피의 양은 "+coffee+" 잔 입니다.");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
			
		}
	}

	//1부터 5까지 숫자를 출력
	public static void allNumber() {
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num++;//num = num +1;
		}
	}
	
	
	
	//
	//나무를 10번 찍으면 나무 넘기기
	public static void tree() {
		//나무를 찍기 전이기 때문에 공격0
		int hit =0;
		
		while(hit < 10) {
			//나무를 몇번 찍었는지 확인
			hit++; // 나무 1번찍을때마다 hit = hit +1;
			System.out.println("나무를 "+hit+" 번 찍었습니다.");
			//만약에 나무를 공격한 수가 10번이 되면 나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다~~!!!! 성공~!!!!");
			}
		}
	}
	
	
//	 사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
//	 단 입력한 수를 1보다 크거나 같아야함
//	 만약에 1 미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주세요 출력하기
//	 
	 
	 public static void method2(){
		 Scanner sc = new Scanner(System.in);
		 	System.out.println("0보다 큰 숫자를 입력하세요 : ");
		 	int num = sc.nextInt();
	 	if(num<1) {
	 		System.out.println("1이상의 숫자를 입력하세요: ");
	 	} else {
	 		System.out.println("1부터 "+num+" 까지의 숫자들");
	 		int abc = 1;
	 		//while문을 사용해서 숫자 abc 부터 num까지 모두 출력하기
	 		while(abc <= num) {
	 			System.out.println(abc);
	 			abc++;
	 		}
	 	}
	 }
	

	 //커피가 100원 돈이 없으면 커피를 구매하지 못하는 경우
	 public static void getCoffee() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("커피에 오신걸 환영합니다.");
		 System.out.println("현재 가진 돈을 입력해주세요:");
		 
		 int coffeePrice = 100 ;
		 int money = sc.nextInt();
		 while(money < coffeePrice) {
			 System.out.println("돈이 부족합니다.\n"
					  + "커피를 구매하기 위해 더 많은 돈을 넣어주세요.");
			 System.out.println("현재 가진 돈을 입력해주세요:");
			 money = sc.nextInt();
			 
			 
		 }
			 
		 System.out.println("커피를 구매했습니다. 거스름돈은"
				             + (money - coffeePrice)+ "입니다.");

		 
	 }     
	
	 //10000원 이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
	 public static void iLovePork() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("안녕하세요. 탕수육점입니다.");
		 System.out.println("가지고 있는 돈을 입금해주세요: ");
		 int tangsuyuk = 10000;
		 int mymony = sc.nextInt();
		 
		 while(mymony < tangsuyuk) {
			 	System.out.println("잔액이 부족합니다.\n"
			 			            +"다시 입금해주세요."    );
			 	System.out.println("가지고 있는 돈을 입금해주세요 : ");
			 	mymony = sc.nextInt();
			 	
		 }
		 
		 //1.스캐너를 이용해서 현재 보유하고 있는 금액 입력하기
		 
		 //보유하고 있는 금액이 tangsuyuk 보다 적으면 잔액이  부족합니다.
		 //다시 입금해주세요.
		 //넥스트인트로 다시 입금할 금액을 입력
		 //돈이 10000원 이상이면 주문이 완료 되었습니다
		 //현재 잔액은 00 입니다.
		System.out.println("탕수육을 구매했습니다. 거스름돈은"+(mymony-tangsuyuk)+"입니다."); 
		 
	 }
	 
	 
	
	
	

	public static void main(String[] args) {
		method1();
		//kh까페();
		//getMoney();
		//tree();
		//method2();
		//getCoffee();
		//iLovePork();
	}

}
