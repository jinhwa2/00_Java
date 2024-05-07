package sup1.controller;

import java.util.Scanner;

import sup1.model.Score;

public class TestUSup1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 :");
		int korean = sc.nextInt();
		System.out.println("영어점수 :");
		int english = sc.nextInt();
		System.out.println("국어점수 :");
		int math = sc.nextInt();
		
		//스캐너 이용해서
		//국어점수 영어점수 수학점수 입력받고
		
		Score 점수 = new Score(korean,english,math);
		점수.계산();
	
	}
}
