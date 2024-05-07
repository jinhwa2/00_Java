package com.kh.practice.studunt.controller;

import com.kh.practice.studunt.model.vo.Student;

public class StudentController {
 //필드
	 //5개가 들어갈 배열을 만들어주는데 학생으로 만들어주세요
		/*Student[] sArr = new Student[5]
		 * 
		 * 
		 * Studunt ┌ sArr[0] 김길동 자바 100
		 *   sArr  ┝ sArr[1] 박길동 디비 50
		 *         ┝ sArr[2] 이길동 화면 85
		 *         ┝ sArr[3] 정길동 서버 60
		 *         └ sArr[4] 홍길동 자바 20
		 * 
		 * 
		 * 
		 * */
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	//생성자 : 기본
	public StudentController() {
		
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
		
	}
	//객체 배열에 있는 데이터 반환
	public Student[] printStudent() {
		  return sArr;
	}
	//객체 배열의 점수를 합한 값 리턴
	public int sumScore() {
		int sum =0;
		for(Student s : sArr) {
			 sum += s.getScore();
		}
		return sum;
	}
	// double배열을 만들어~
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
		avgArr[1] = avgArr[0] / sArr.length;
		
		return avgArr;
		
	}
    //각 학생의 합격 여부를 확인하고 출력하는 메서드
	public void printPass( ) {
		for(Student s : sArr) {
			s.setPassed(s.getScore() >= CUT_LINE);
			System.out.println(s.getName()+"학생은"+ (s.isPassed() ? " 합격" : " 불합격"));
		}
	}

/*
 if문 사용시 boolean 사용안함
 if(s.getScore() >== CUT_LINE){
    System.out.println(s.getName()+" 학생은 합격입니다"); 
 * } else {
 * 	System.out.println(s.getName()+ " 학생은 불합격입니다.")
 * }
 * 
 * 
 * 
 * 
 * */


}


