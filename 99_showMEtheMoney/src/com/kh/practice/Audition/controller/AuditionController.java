
import com.kh.practice.Audition.model.vo.Audition;
package com.kh.practice.Audition.controller;
public class AuditionController {
//필드
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;
//메서드
	//생성자 : 기본
	public AuditionController() {	
		//5개의 데이터를객체를 초기화해주는 작업
	sArr[0] = new Audition("김영희","발라드",100);
	sArr[1] = new Audition("박영희","힙합",50);
	sArr[2] = new Audition("이연이","뮤지컬",85);
	sArr[3] = new Audition("정영히","댄스",60);
	sArr[4] = new Audition("홍영희","팝",20);
	}
	//객체 배열에 있는 데이터 반환
	public Audition[] printStudent() {
		return sArr;
	}
	
	//객체 배열의 점수를 합한 값 리턴
	public int sumScore() {
		int sum = 0;
		for(Audition audition : sArr) {
			sum += audition.getScore();
		}
		return sum;
	}
	
	//double배열을 만들어 sumScore의 리턴값을 0번째 장바구니에 담고
	//합의평균을 1번째 장바구니에 담아라
	 public double[] avgScore() {
		double[] avgScore = new double[2];
		avgScore[0] = sumScore();
		avgScore[1] = avgScore[0] / sArr.length;
			return avgScore;
	}
	
	
	public void printPass() {
		for(Audition a : sArr) {
			a.setPassed(a.getScore() >= CUT_LINE);
			System.out.println(a.getName()+" 학생은 "+(a.isPassed() ? "통과" : "합격"));
		}
	}
}
