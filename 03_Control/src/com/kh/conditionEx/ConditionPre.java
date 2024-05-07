package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	/*public static void method1() {
		//if 문 활용, 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		같다면 같습니다. 출력하고
		같지 않다면 같지 않습ㄴ디ㅏ. 출력하기
		
	// *public static void method1() {
		//if 문 활용, 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
		Scanner sc = nes Scanner(System.int);
		String str1 = sc.nextInt();
		String str2 = sc.nextInt();
		같다면 같습니다. 출력하고
		같지 않다면 같지 않습니다.. 출력하기
		
	//(응용편)method3 double 로 실수 2개 값 받아서 실수 두개가 일치하는지 확인 ==
*/
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1값을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("num2값을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println(num1 + " 과" +num2 +"의 값이 같습니다.");
		} else {
			System.out.println(num1 + " 과" +num2 +"의 값이 같지 않습니다.");;
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("str1 문자를 입력하세요: ");
		String str1 = sc.nextLine();
		System.out.print("str2 문자를 입력하세요: ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println(str1 + " 과" +str2 +"는 같습니다.");
		} else {
			System.out.println(str1 + " 과" +str2 +"는 같지 않습니다.");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 실수를 입력하세요: ");
		double double1 = sc.nextDouble();
		System.out.print("두번째 실수를 입력하세요: ");
		double double2 = sc.nextDouble();
		
		if(double1 == double2) {
			System.out.println(double1 + " 과" + double2 + "는 일치합니다.");
		}else {
			System.out.println(double1 + " 과" + double2 + "는 일치하지 않습니다.");
		}
		
	}
	
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();

	}

}
