package sup1.model;

public class Score {
//필드
	private int korean;
	private int english;
	private int math;
	
	
	
//메서드
	//필수 생성자
	public Score(int korean,int english,int math) {
		this.korean = korean;
		this.english = english; 
		this.math = math;
		
	}
	
	//void
	public void 계산() {
		
		String 결과 = (korean>=50 && english>=50 && math>=50 ) ? "합격" : "불합격";
		
			System.out.println("국어점수 : "+korean);
			System.out.println("영어점수 : "+english);
			System.out.println("국어점수 : "+math);
			
		}
		
		//평균 50점 이상이면 합격
		//삼항연산자로 합격 불합격
		// 각 점수가 50 이상 평균 50점 이상
		//출력문으로 국어영어 수학점수랑
		//삼항연산자에 대한 결가 출력
	
}

