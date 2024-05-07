package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1을 입력하세요 : ");
		int num1 = sc.nextInt();
		if(num1>0) {
			if(num1%2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("음수입니다.양수만 입력하세요");
		}

	}
		
		public static void practice2() {
			//키보드로 국어 영어 수학 점수 입력받기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 점수는: ");
			int korean = sc.nextInt();
			
			System.out.print("영어 점수는: ");
			int english = sc.nextInt();
			
			System.out.print("수학점수는: ");
			int math = sc.nextInt();
			
			System.out.println("국어점수는: "+korean);
			System.out.println("영어점수는: "+english);
			System.out.println("수학점수는: "+math);
			// 합계와 평균 계산
			int totalScore = korean + english + math;
			System.out.println("합계는: "+ totalScore );
			double average = totalScore/3.0;
			System.out.println("평균은: "+totalScore);
			//합격 여부 판별
			//세과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
			if(korean>=40 && english>=40 && math>=40 && average>=40) {
				System.out.println("축하합니다. 합격니다!");
			} else {
				System.out.println("불합격입니다.");
			}
		}
					
		public static void practice3() {
			/*
			 * 1 ~ 12 사이의 수를 입력받아 해당 달의 일수를 출력하세요.
			 * 2월 윤달은 생각하지 않습니다.
			 * OO월은 잘못 입력한 달입니다. 한/영 대문자 O
			 */
			Scanner sc = new Scanner(System.in);
			System.out.print("1부터 12 중 하나 입력: ");
			int month = sc.nextInt(); //키보드로 입력한 날
			
			int dayMonth;
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				dayMonth = 31;
				break;
			case 4: case 6: case 9: case 11:
				dayMonth = 30;
				break;
			case 2: 
				dayMonth = 28;
				break;
			default:
				System.out.println(month+" 월은 잘못 입력한 달입니다.");
				return;
			}
			System.out.println(month+ "월은 " +dayMonth + "일까지 있습니다.");		
		}
		
		public static void practice4 () {
			Scanner sc = new Scanner(System.in);
			// 키와 몸무게 입력받기
			System.out.print("키(m)를 입력하세요:");
			double height = sc.nextDouble();
			System.out.print("몸무게(kg)를 입력하세요:");
			//BMI 계산 BMI = 체질량지수 비만도를 확인하는 것
			double weight = sc.nextDouble();
			
			double bmi = (double)weight/(height * height);
			//BMI 지수에 따라 결과 출력
			if(bmi<18.5) {
				System.out.println("저체중");
			} else if(bmi<23) {
				System.out.println("정상체중");
			} else if(bmi<25) {
				System.out.println("과체중");
			} else if(bmi<30) {
				System.out.println("비만");
			} else {
				System.out.println("고도비만");
			}
		}
	
		public static void practice5 () {
			Scanner sc = new Scanner(System.in);
			System.out.print("중간고사 점수는 ;");
			double mid = sc.nextDouble();
			System.out.print("기말고사 점수는 :");
			double fin = sc.nextDouble();
			System.out.print("과제 점수는 :");
			double assig = sc.nextDouble();
			System.out.print("출석 횟수는 :");
			int attend = sc.nextInt();
			
			// 출석 비율 계산 20회
			double attendPer = attend / 20 * 100;
			// attend / 20 = 출석한 횟수를 전체 강의 횟수로 나눠서 출석 비율을 계산
			// double 소수점 밑에 있는 수까지 얻어옴
			// 실수로 된 값을 100을 곱해서 백분율로 변환
			
			// 평가 비율에 따른 총점 계산
			// 중간 20 기말 30 과제 30 출석 20 =100점
			//중간 점수 20
			double midScore = mid *0.2;
			//기말 점수 30
			double finScore = fin * 0.3; // 100점 만점 30%
			//과제점수 30
			double assigScore = assig * 0.3;
			double attendScore = attendPer * 0.2; //100점 만점 0.2
			double totalScore = midScore + finScore + assigScore +attendScore;
			
			//평가에 따른 Pass 또는 Fain 출력
			if(totalScore >=70 && attendPer >=70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
			System.out.println("======= 결과 =======");
			System.out.println("중간고사 점수 (20점 만점) : " + midScore);
			System.out.println("기말고사 점수 (30점 만점) : " + finScore);
			System.out.println("과   제 점수 (20점 만점) : " + assigScore);
			System.out.println("출   석 점수 (30점 만점) : " + attendScore);
			System.out.println("총                 점) : " + totalScore);
			
			
			 
		}
		
		public static void main(String[] args) {
			//pactice1 ();
			//practice2 ();
			//practice3 ();
			practice4 ();
			//practice5();
			
		}	
		
		
	}

