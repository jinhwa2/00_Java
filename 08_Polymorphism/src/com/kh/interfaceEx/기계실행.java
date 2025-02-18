package com.kh.interfaceEx;

public class 기계실행 {

	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
	
		세탁기 돌돌이 = new 세탁기();
		돌돌이.전원켜기();
		돌돌이.전원끄기();
		
		//어린이용 기계 실행
		어린이용계산기 c1 = new 어린이용계산기();
		c1.전원켜기();
		c1.전원끄기();
		
		//어린이용 계산기 기능 테스트
		int a = 10;
		int b = 5;
		// ctrl alt 화살표 아래모양
		System.out.println(a + " + " + b + " = "+c1.합(a,b));
		System.out.println(a + " - " + b + " = "+c1.차(a,b));
		System.out.println(a + " * " +b + " = "+c1.곱(a,b));
		System.out.println(a + " / " + b + " = "+c1.몫(a,b));
		System.out.println(a + " % " + b + " = "+c1.나머지(a,b));
		
		//중학생용 기계 실행
		중학생계산기 c2 = new 중학생계산기();
		c2.전원켜기();
		c2.전원끄기();
		
		//중학생용 계산기 기능 테스트
		a = 20 ;  //앞에 인트 해줬기 때문에 다시 안써도 됨
		b = 12;
		
		System.out.println(a + " + " + b + " = "+c2.합(a,b));
		System.out.println(a + " - " + b + " = "+c2.차(a,b));
		System.out.println(a + " * " +b + " = "+c2.곱(a,b));
		System.out.println(a + " / " + b + " = "+c2.몫(a,b));
		System.out.println(a + " % " + b + " = "+c2.나머지(a,b));
		
		
	
	}

}
