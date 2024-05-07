package com.kh.oop.basic;

public class Bank {
	// 이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String name;
	public String accoutNumber;
	public int balance;
	public String password;
	public boolean agree1;
	//boolean 기본값 false
	// 생성자 메서드
	//1. 필수가 아닌 생성자 = 클래스명 같아야함
	public Bank() {
		
	}
	
	
	//2.필수인 생성자//이름 계좌번호 잔액 패스워드
	public Bank(String name,String accoutNumber,int balance,String password) {
		this.name = name;
		this.accoutNumber = accoutNumber;
		this.balance = balance;
		this.password = password;
		
	}
	
	//3.출력 메서드
	public void info() {
		System.out.println("이름 :" +name);
		System.out.println("계좌번호: "+accoutNumber);
		System.out.println("잔액 :"+balance);
		System.out.println("비밀번호 :"+password);
		System.out.println("마케팅수신동의 :"+agree1);
		
	}
	
	//4.최종 메인 출력 메서드
	public static void main(String[] args) {
		//1.조 씨 은행 통장 ok
		Bank customer1 = new Bank();
		customer1.name = "jor";
		customer1.accoutNumber = "111-222-3333";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree1 = true;
		
		customer1.info();
		
		//2. 던 씨 은행통장 수신동의 실수로 안함
		Bank customer2 = new Bank();
		customer2.name = "dan";
		customer2.accoutNumber = "111-110-1234";
		customer2.balance = 1000;
		customer2.password = "1234";
		//수신동의를 해야 하는데 수신동의를 안하고 바쁘다고 먼저 가버림
				
		customer2.info();
		
		//3.필수 생성자를 활용해서 마이클 씨의 은행통장
		//이름 계좌번호 잔액 비밀번호를 입력하고
		//마케팅 수신동의를 true 변경해서 출력하기
		Bank costomer3 = new Bank("마이클","121-1234-123",200,"3312");
		costomer3.agree1 = true;
		
		costomer3.info();
		
	}
	
	
	

}
