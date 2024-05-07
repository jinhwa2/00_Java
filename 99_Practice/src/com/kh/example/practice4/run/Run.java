package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//학생 객체 생성
		Student st = new Student();//빨간줄 생기면 마우스 올려놓고 임포트 학생을 어떻게 가져올건가
		
		st.setName("홍길동");
		st.setGrade(3);
		st.setClassroom(2);
		st.setHeight(200.5);
		st.setGender('남');
		
		//void information 을 갖고와서 정보 출력
		st.information();
	}

}
